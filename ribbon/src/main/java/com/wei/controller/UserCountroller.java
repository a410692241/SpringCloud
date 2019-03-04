package com.wei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserCountroller {
    @Resource
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

//    @Resource
//    private FeignService feignService;

    @RequestMapping("getAll")
    public Object getAll() {
        String result = restTemplate.getForObject("http://server-provider:8090/getAll", String.class);
        return result;

    }

    @GetMapping("/test2")
    public String test2() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("server-provider");
        String result = serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort();
        System.out.println(result);
        return result;
    }


}
