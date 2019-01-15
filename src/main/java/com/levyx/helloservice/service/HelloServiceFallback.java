package com.levyx.helloservice.service;

import com.levyx.helloservice.model.User;
import org.springframework.web.bind.annotation.*;


public class HelloServiceFallback implements HelloService{


    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("未知",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
