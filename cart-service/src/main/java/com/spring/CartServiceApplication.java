package com.spring;

import com.java.model.Item;
import com.spring.dao.impl.CartDaoImpl;
import com.spring.model.CartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class CartServiceApplication implements CommandLineRunner {
    @Autowired
    CartDaoImpl dao;

    public static void main(String[] args) {
        SpringApplication.run(CartServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	String url=null;
		RestTemplate template=new RestTemplate();
        List<CartRequest> list = dao.select();
        System.out.println(list);
        for (CartRequest request : list) {
            Integer itemId = request.getItemId();
			url="http://desktop-drfe83d:55582/items/"+itemId;
			ResponseEntity<Item> item=template.exchange(url, HttpMethod.GET,null, Item.class);
			System.out.println("*****************"+item);
        }
    }
}
