package com.microservice.user_service.entity;

import java.util.ArrayList;
import java.util.List;

public class user {
    private int id;
    private  String name;
    private String phone;

    List<Contact> list = new ArrayList<>();

    public user(int id, String name, String phone, List<Contact> list) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.list = list;
    }

    public user(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }


    public user() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Contact> getList() {
        return list;
    }

    public void setList(List<Contact> list) {
        this.list = list;
    }

}
