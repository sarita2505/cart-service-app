package com.spring.utils;

import com.java.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Item> {
    @Override
    public Item mapRow(ResultSet resultSet, int i) throws SQLException {
        Item items=new Item();
        items.setId(resultSet.getInt("id"));
        items.setName(resultSet.getString("name"));
        items.setPrice(resultSet.getDouble("price"));
        items.setDescription(resultSet.getString("description"));
        items.setImageUrl(resultSet.getString("imageurl"));
        return items;
    }
}
