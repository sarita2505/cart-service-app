package com.spring.dao.impl;

import com.java.model.Item;
import com.spring.utils.ItemRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ItemDaoImpl extends AbstractItemClass<Item,Integer> {
    private static final String save="insert into items(name,price,description,imageurl) values(?,?,?,?)";
    private static final String update="update  items set price=? where id=?";
    private static final String select="select id,name,price,description,imageurl from items where id=?";
    private static final String selectAll="select * from items";
    public ItemDaoImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Integer save(Item items) {
        return getJdbcTemplate().
                update(save,new Object[]{items.getName(),
                        items.getPrice(),items.getDescription(),items.getImageUrl()});
    }

    @Override
    public Integer update(Item items, Integer id) {
        return getJdbcTemplate().update(update,new Object[]{items.getPrice(),id});
    }

    @Override
    public Item select(Integer id) {
        return getJdbcTemplate().queryForObject(select,new ItemRowMapper(),new Object[]{id});
    }

    @Override
    public List<Item> selectAll() {
        return getJdbcTemplate().query(selectAll,new ItemRowMapper());
    }
}
