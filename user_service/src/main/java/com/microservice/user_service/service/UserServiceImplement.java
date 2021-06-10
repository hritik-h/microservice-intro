package com.microservice.user_service.service;

import com.microservice.user_service.entity.user;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImplement implements UserService{
    List<user> list = List.of(
            new user(1, "Hritik Singh","123456"),
            new user(2,"Ankit op", "232123"),
            new user(3, "Dr Doggo", "4326421")
    );
    @Override
    public user getUser(int id){
        for(user each: list){
            if(each.getId() == id){
                return each;
            }
        }
        return null;
    };
}
