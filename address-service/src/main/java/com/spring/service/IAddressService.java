package com.spring.service;

import com.spring.model.Address;

import java.util.List;

public interface IAddressService {
    Integer save(Address address);

    Integer update(Address address,Integer integer);

    Integer delete(Integer integer);

    Address select(Integer integer);

    List<Address> selectAll();
}
