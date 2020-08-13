package com.spring.service;

import com.spring.model.Items;

import java.util.List;

public interface IItemService {
    public Integer save(Items items);
    public Integer update(Items items,Integer id);
    public Items select(Integer id);
    public List<Items> selectAll();
}
