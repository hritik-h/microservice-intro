package com.microservice.user_service.entity;

public class Contact {
    private int cId;
    private String name;
    private String email;
    private  int uid;

    public Contact(int cId, String name, String email, int uid) {
        this.cId = cId;
        this.name = name;
        this.email = email;
        this.uid = uid;
    }

    public Contact() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }
}
