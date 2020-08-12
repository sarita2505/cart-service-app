package com.spring.utils;

import com.spring.model.Items;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ItemRowMapper implements RowMapper<Items> {
    @Override
    public Items mapRow(ResultSet resultSet, int i) throws SQLException {
        Items items=new Items();
        items.setId(resultSet.getInt(1));
        items.setName(resultSet.getString(2));
        items.setPrice(resultSet.getDouble(3));
        items.setDescription(resultSet.getString(4));
        items.setImageUrl(resultSet.getString(5));
        return items;
    }
}
