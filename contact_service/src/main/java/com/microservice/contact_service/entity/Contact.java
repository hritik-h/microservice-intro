package com.microservice.contact_service.entity;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String phone;
    private int uid;

    public Contact(int id, String name, String email, String phone, int uid) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.uid = uid;
    }

    public Contact() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
