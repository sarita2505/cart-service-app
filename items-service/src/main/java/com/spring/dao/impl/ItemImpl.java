package com.spring.dao.impl;

import com.spring.model.Items;
import com.spring.utils.ItemRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ItemImpl extends AbstractItemClass<Items,Integer> {
    private static final String save="insert into items(name,price,description,imageurl) values(?,?,?,?)";
    private static final String update="update table items set price=? where is=?";
    private static final String select="select name,price,description,imageurl from items where id=?";
    private static final String selectAll="select * from items";
    public ItemImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Integer save(Items items) {
        return getJdbcTemplate().
                update(save,new Object[]{items.getName(),
                        items.getPrice(),items.getDescription(),items.getImageUrl()});
    }

    @Override
    public Integer update(Items items,Integer id) {
        return getJdbcTemplate().update(update,new Object[]{items.getPrice(),id});
    }

    @Override
    public Items select(Integer id) {
        return getJdbcTemplate().queryForObject(select,new ItemRowMapper(),new Object[]{id});
    }

    @Override
    public List<Items> selectAll() {
        return getJdbcTemplate().query(selectAll,new ItemRowMapper());
    }
}
