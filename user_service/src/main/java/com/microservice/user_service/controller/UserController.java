package com.microservice.user_service.controller;

import com.microservice.user_service.entity.Contact;
import com.microservice.user_service.entity.user;
import com.microservice.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public user getUser(@PathVariable("userId") int userId){
        user usr= this.userService.getUser(userId);

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/" + userId, List.class);

        usr.setList(contacts);
        return usr;
    }
}
