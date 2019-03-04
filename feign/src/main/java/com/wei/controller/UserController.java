package com.wei.controller;

import com.wei.bo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("getAll")
    public Object getAll() {
        return feignService.getAll(new UserExample());
    }
}
