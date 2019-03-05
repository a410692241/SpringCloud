package com.wei.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.utils.FallbackMethod;
import com.wei.bo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private FeignSerivice feignService;


    //对改方法进行熔断机制
//    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @RequestMapping("getAll")
    public Object getAll() {
        return feignService.getAll(new UserExample());

    }

    //降级方法
    //当服务没有了,或者响应不到了,就会自动调用下面的方法,熔断机制打开
    //当过一段时间,它会再次重连,如果此时启动服务,那么会正常返回
    private String fallbackMethod() {
        return "服务调用出错!";
    }
}
