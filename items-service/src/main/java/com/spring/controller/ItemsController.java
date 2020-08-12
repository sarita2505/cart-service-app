package com.spring.controller;

import com.spring.dao.IItemDao;
import com.spring.dao.impl.ItemImpl;
import com.spring.model.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
    @Autowired
    IItemDao<Items,Integer> item;

    @GetMapping("/active")
    public String active() {
        return "active";
    }

    @PostMapping("/items")
    public ResponseEntity<Integer> save(@RequestBody Items items) {
        int i = item.save(items);
        return ResponseEntity.status(200).body(i);
    }
}
