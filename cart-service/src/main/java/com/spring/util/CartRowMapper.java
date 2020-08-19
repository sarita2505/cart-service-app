package com.spring.util;

import com.spring.model.CartRequest;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartRowMapper implements RowMapper<CartRequest> {


    @Override
    public CartRequest mapRow(ResultSet resultSet, int i) throws SQLException {
        CartRequest request=new CartRequest();
        request.setItemId(resultSet.getInt("itemid"));
        request.setAccountId(resultSet.getInt("accountid"));
        return request;
    }
}
