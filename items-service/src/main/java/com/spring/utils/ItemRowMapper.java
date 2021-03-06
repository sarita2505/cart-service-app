package com.spring.utils;

import com.spring.model.Items;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Items> {
    @Override
    public Items mapRow(ResultSet resultSet, int i) throws SQLException {
        Items items=new Items();
        items.setId(resultSet.getInt("id"));
        items.setName(resultSet.getString("name"));
        items.setPrice(resultSet.getDouble("price"));
        items.setDescription(resultSet.getString("description"));
        items.setImageUrl(resultSet.getString("imageurl"));
        return items;
    }
}
