package com.spring.dao;

import java.util.List;

public interface IAddressDao<T, I> {
    I save(T t);

    I update(T t, I I);

    I delete(I i);

    T select(I i);

    List<T> selectAll();
}
