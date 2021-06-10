package com.microservice.contact_service.service;

import com.microservice.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ContactService implements ContactServiceInterface{
    List<Contact> list = List.of(
            new Contact(4,"Mr Doberman","dob@123","123212",1),
            new Contact(5,"Mr Labrador","Lab@123","232222",3),
            new Contact(6,"Mr Hound","hound@123","890122",1)
    );
    @Override
    public List getContact(int uid){
        List<Contact> res = new ArrayList();
        for(Contact each:list){
            if(each.getUid() == uid){
                res.add(each);
            }
        }
        return res;
    }
}
