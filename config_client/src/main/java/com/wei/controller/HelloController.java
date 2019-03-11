package com.wei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${spring.application.name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name);
        return name;
    }
}
