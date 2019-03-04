package com.wei.service;

import com.wei.bo.User;
import com.wei.bo.UserExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//指定服务者的服务id
@FeignClient(name = "server-provider")
public interface FeignService {

    //把微服务的controller原封不动的抄过来
    @RequestMapping("/getAll")
    List<User> selectByExample(UserExample example);

}
