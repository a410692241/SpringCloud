package com.wei.controller;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import com.wei.hystrix.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "server-provider",fallback = FeignServiceImpl.class)
public interface FeignSerivice {

    @RequestMapping("/getAll")
    Object getAll(UserExample userExample);

}
