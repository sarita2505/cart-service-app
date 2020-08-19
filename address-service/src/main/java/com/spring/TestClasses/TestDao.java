package com.spring.TestClasses;

import com.spring.dao.IAddressDao;
import com.spring.dao.impl.AddressDaoImpl;
import com.spring.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class TestDao implements CommandLineRunner {
//    @Autowired
//   private IAddressDao<Address,Integer> dao;

    @Override
    public void run(String... args) throws Exception {
//        Address address = new Address(1119, "c3", "s3", "lmk001", "hn1", 111);
//        dao.save(address);
//        List<Address> list = new ArrayList<>();
//        list = dao.selectAll();
//        System.out.println("*********" + list);
    }
}
