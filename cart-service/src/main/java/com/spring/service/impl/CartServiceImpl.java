package com.spring.service.impl;

import com.java.model.Item;
import com.spring.dao.ICartDao;
import com.spring.error.AppCartException;
import com.spring.model.AppError;
import com.spring.model.CartRequest;
import com.spring.service.ICartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements ICartService {
    private static final Logger LOGGER= LoggerFactory.getLogger(CartServiceImpl.class);
    @Autowired
    ICartDao<CartRequest, Integer> dao;
    Integer i = 0;

    @Autowired
    private DiscoveryClient client;

    @Override
    public Integer save(CartRequest request) {
        try {
            i = dao.save(request);

        } catch (DataAccessException e) {
            AppError error = new AppError("data while saving",111, HttpStatus.INTERNAL_SERVER_ERROR);
            AppCartException exception = new AppCartException(e,error);
            throw exception;
        }
        return i;
    }

    @Override
    public Integer update(CartRequest request, Integer id) {
        try {
            i = dao.update(request, id);

        } catch (DataAccessException e) {
            AppError error = new AppError("data not updated", 112,HttpStatus.INTERNAL_SERVER_ERROR);
            AppCartException exception = new AppCartException(e, error);
            throw exception;
        }
        return i;
    }

    @Override
    public Integer delete(Integer itemId) {
        try {
            i = dao.delete(itemId);

        } catch (DataAccessException e) {
            AppError error = new AppError("data is not deleted", 500);
            AppCartException exception = new AppCartException("exception occured in delete", error);
            throw exception;
        }
        return i;
    }

    @Override
    public List<Item> select() {
        String url = null;
        RestTemplate template = new RestTemplate();
        List<CartRequest> list = dao.select();
        System.out.println(list);
        List<Item> items = new ArrayList<>();
        List<ServiceInstance> instances = client.getInstances("ITEMS-SERVICE");
        for (CartRequest request : list) {
            Integer itemId = request.getItemId();
            if (instances.size() > 0) {
                ServiceInstance instance = instances.get(0);
                url=instance.getUri().toString();
                url = url+"/items/"+ itemId;
                LOGGER.info(url);
                ResponseEntity<Item> item = template.exchange(url, HttpMethod.GET, null, Item.class);
                System.out.println("*****************" + item);
                if (item.getStatusCodeValue() == 200)
                    items.add(item.getBody());
            }
        }
        return items;
    }
}
