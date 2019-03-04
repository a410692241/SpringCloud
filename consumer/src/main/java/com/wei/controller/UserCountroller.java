package com.wei.controller;

import com.wei.bo.UserExample;
import com.wei.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCountroller {

    @Autowired
    private FeignService feignService;

    @RequestMapping("getAll")
    public Object getAll() {
        return feignService.selectByExample(new UserExample());
    }


}
