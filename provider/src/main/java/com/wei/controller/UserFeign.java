package com.wei.controller;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import com.wei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFeign {
    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/getAll")
    public List<User> provider(UserExample userExample){
        return userService.selectByExample(userExample);
    }

    @RequestMapping("/getAll2")
    public String provider2(){
        return "成功调用provider,端口是:" + port;
    }



}
