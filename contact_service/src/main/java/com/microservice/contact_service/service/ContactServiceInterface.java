package com.microservice.contact_service.service;

import com.microservice.contact_service.entity.Contact;

import java.util.List;

public interface ContactServiceInterface {
    public List<Contact> getContact(int uid);
}
