package com.wei.controller;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "server-provider")
public interface FeignService {

    @RequestMapping("/getAll")
    List<User> getAll(UserExample userExample);

}
