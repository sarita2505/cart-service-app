package com.spring.controller;

import com.spring.model.Address;
import com.spring.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private IAddressService service;
    @PostMapping("/address")
    public ResponseEntity<Integer> save(@RequestBody Address address){
        Integer i=service.save(address);
        return ResponseEntity.status(200).body(i);
    }
    @GetMapping("/address")
    public ResponseEntity<List<Address>> selectAll(){
        List<Address> list=service.selectAll();
        return ResponseEntity.status(200).body(list);
    }
}
