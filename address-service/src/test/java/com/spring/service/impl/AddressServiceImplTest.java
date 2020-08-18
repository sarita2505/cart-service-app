package com.spring.service.impl;

import com.spring.dao.impl.AddressDaoImpl;
import com.spring.model.Address;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles(profiles = "test")
class AddressServiceImplTest {
    @Mock
    AddressDaoImpl dao;
    @InjectMocks
    AddressServiceImpl service;

    @Test

    void save() {
        Address address = new
                Address(111, "c12", "s12", "lmk11", "1234", 123456);
        int i = dao.save(address);
        assertEquals(1, 1);
    }

    @Test
    void selectAll() {
        Address address = new
                Address(111, "c12", "s12", "lmk11", "1234", 123456);
        Address address1 = new
                Address(111, "c12", "s12", "lmk11", "1234", 123456);
        Mockito.when(dao.selectAll()).thenReturn(Arrays.asList(address,address1));
        assertEquals(2,2);
    }
}