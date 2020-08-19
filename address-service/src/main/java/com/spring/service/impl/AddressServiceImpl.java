package com.spring.service.impl;

import com.spring.dao.IAddressDao;
import com.spring.exception.AddressException;
import com.spring.model.Address;
import com.spring.model.AppError;
import com.spring.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    IAddressDao<Address, Integer> dao;
    private int i = 0;

    @Override
    public Integer save(Address address) {
        try {
            i = dao.save(address);
        } catch (Exception e) {
            AddressException exception = new AddressException(e,
                    new AppError("data is not inserted", 500));
            throw exception;
        }
        return i;
    }

    @Override
    public Integer update(Address address, Integer integer) {
        return null;
    }

    @Override
    public Integer delete(Integer integer) {
        return null;
    }

    @Override
    public List<Address> select()
    {
        try {
            return dao.select();
        } catch (Exception e) {
            AddressException exception = new AddressException(e,
                    new AppError("no data found", 500));
            throw exception;
        }
    }

    @Override
    public List<Address> selectAll() {
        return dao.selectAll();
    }
}
