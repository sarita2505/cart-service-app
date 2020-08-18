package com.spring.utils;

import com.spring.model.Address;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AddressRowMapper implements RowMapper<Address> {
    Address address=new Address();

    @Override
    public Address mapRow(ResultSet resultSet, int i) throws SQLException {
        //address.setId(resultSet.getInt("id"));
        address.setAccount_id(resultSet.getInt("account_id"));
        address.setCity(resultSet.getString("city"));
        address.setState(resultSet.getString("state"));
        address.setHouse_no(resultSet.getString("house_no"));
        address.setLand_mark(resultSet.getString("land_mark"));
        address.setPin(resultSet.getInt("pin"));
        return address;
    }
}
