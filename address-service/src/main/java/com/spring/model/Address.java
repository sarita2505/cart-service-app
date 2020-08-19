package com.spring.model;

import java.util.HashMap;

public class Address {
private Integer id;
private Integer account_id;
private String city;
private String state;
private String land_mark;
private String house_no;
private Integer pin;

    public Address() {
    }

    public Address( Integer account_id, String city, String state, String land_mark, String house_no, Integer pin) {
        this.account_id = account_id;
        this.city = city;
        this.state = state;
        this.land_mark = land_mark;
        this.house_no = house_no;
        this.pin = pin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLand_mark() {
        return land_mark;
    }

    public void setLand_mark(String land_mark) {
        this.land_mark = land_mark;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", account_id=" + account_id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", land_mark='" + land_mark + '\'' +
                ", house_no='" + house_no + '\'' +
                ", pin=" + pin +
                '}';
    }
}
