package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
    @GetMapping("/active")
    public String active(){
        return "active";
    }
}
