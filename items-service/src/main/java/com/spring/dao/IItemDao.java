package com.spring.dao;

import java.util.List;

public interface IItemDao<T,I> {
    I save(T t);
    I update(T t,I i);
    T select(I i);
    List<T> selectAll();
}
