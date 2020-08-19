package com.spring.dao;

import com.spring.model.Address;

import java.util.List;

public interface IAddressDao<T, I> {
    I save(T t);

    I update(T t, I I);

    I delete(I i);

    List<Address> select();

    List<T> selectAll();
}
