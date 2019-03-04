package com.wei.cotroller;

import com.wei.bo.UserExample;
import com.wei.service.UserService;
import javafx.beans.property.ObjectProperty;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("user")
public class UserCountroller {
    @Resource
    private UserService userService;

    @RequestMapping("getAll")
    public Object getAll() {
        return userService.selectByExample(new UserExample());
    }

}
