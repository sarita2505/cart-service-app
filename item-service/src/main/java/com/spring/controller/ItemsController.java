package com.spring.controller;

import com.java.model.Item;
import com.java.model.UserContext;
import com.spring.config.AppConfig;
import com.spring.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemsController {

    @Autowired
   private IItemService service;

    @GetMapping("/active")
    public String active() {
        return "active";
    }

    @PostMapping("/items")
    public ResponseEntity<Integer> save(@RequestBody Item items) {
        int i = service.save(items);
        return ResponseEntity.status(200).body(i);
    }

    @PutMapping("/items/{id}")
    public ResponseEntity<Integer> update(@RequestBody Item items, @PathVariable("id") int id) {
        int i = service.update(items, id);
        return ResponseEntity.status(200).body(i);
    }
    @GetMapping("/items")
    public ResponseEntity<List<Item>> save() {
        List<Item> items= service.selectAll();
        return ResponseEntity.status(200).body(items);
    }
    @GetMapping("/items/{id}")
    public ResponseEntity<Item> save(@PathVariable("id") int id) {
        Item items= service.select(id);
        return ResponseEntity.status(200).body(items);
    }
    @GetMapping("/items/disp")
    public int getAccountId(){
        UserContext userContext= new AppConfig().getUserContext();
        return userContext.getAccountId();
    }
}
