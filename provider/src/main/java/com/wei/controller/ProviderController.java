package com.wei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/getAll")
    public String provider(){
        System.out.println("成功调用provider,端口是:" + port);
        return "成功调用provider,端口是:" + port;
    }

    @RequestMapping("/getAll2")
    public String provider2(){
        return "成功调用provider,端口是:" + port;
    }



}
