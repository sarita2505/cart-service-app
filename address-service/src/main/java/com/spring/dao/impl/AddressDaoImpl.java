package com.spring.dao.impl;

import com.java.model.UserContext;
import com.spring.model.Address;
import com.spring.utils.AddressRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Profile("dev")
@Repository
@Transactional
public class AddressDaoImpl extends AbstractDao<Address, Integer> {
    private static final String save = "insert into address(account_id,city,state,land_mark,house_no,pin) values(?,?,?,?,?,?)";
    private static final String selectAll = "select * from address";
    private static final String select = "select * from  address where account_id=?";

    public AddressDaoImpl(JdbcTemplate template) {
        super(template);
    }

    @Autowired
    private UserContext context;

    @Override
    public Integer save(Address address) {
        return getTemplate().update(save, new Object[]{context.getAccountId(), address.getCity(),
                address.getState(), address.getLand_mark(), address.getHouse_no(), address.getPin()});
    }

    @Override
    public Integer update(Address address, Integer I) {
        return null;
    }

    @Override
    public Integer delete(Integer integer) {
        return null;
    }

    @Override
    public List<Address> select() {
        return getTemplate().query(select, new AddressRowMapper(),
                new Object[]{context.getAccountId()});
    }

    @Override
    public List<Address> selectAll() {
        return getTemplate().query(selectAll, new AddressRowMapper());
    }
}
