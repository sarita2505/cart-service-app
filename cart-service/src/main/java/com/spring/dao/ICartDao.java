package com.spring.dao;

import java.util.List;

public interface ICartDao<T, I> {
    I save(T t);

    I update(T t,I i);

    I delete(I i1);

    List<T> select();

    //List<T> selectAll();
}
