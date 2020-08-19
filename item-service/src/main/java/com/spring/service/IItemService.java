package com.spring.service;

import com.java.model.Item;

import java.util.List;

public interface IItemService {
    public Integer save(Item items);
    public Integer update(Item items, Integer id);
    public Item select(Integer id);
    public List<Item> selectAll();
}
