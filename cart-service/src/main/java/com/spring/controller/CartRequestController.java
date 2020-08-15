package com.spring.controller;

import com.java.model.Item;
import com.spring.dao.impl.CartDaoImpl;
import com.spring.model.CartRequest;
import com.spring.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CartRequestController {
    @Autowired
    private ICartService service;

    @GetMapping("/active")
    public String active() {
        return "active";
    }

    @PostMapping("/cart")
    public ResponseEntity<Integer> save(@RequestBody CartRequest request) {
        Integer i = service.save(request);
        return ResponseEntity.status(200).body(i);
    }

    @DeleteMapping("/cart")
    public ResponseEntity<Integer> delete(Integer itemId) {
        Integer i = service.delete(itemId);
        return ResponseEntity.status(200).body(i);
    }

    @GetMapping("/cart")
    public ResponseEntity<List<Item>> select() {
        List<Item> list = service.select();

        return ResponseEntity.status(200).body(list);
    }
}
