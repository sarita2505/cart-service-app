package com.spring.service;

import com.java.model.Item;
import com.spring.model.CartRequest;

import java.util.List;

public interface ICartService {
    Integer save(CartRequest request);

    Integer update(CartRequest request,Integer id);

    Integer delete(Integer i1);

    List<Item> select();
}
