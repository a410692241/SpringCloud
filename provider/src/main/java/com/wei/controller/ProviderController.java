package com.wei.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/providerController")
public class ProviderController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/provider/{params}")
    public String provider(@PathVariable("params") String params){
        return "成功调用provider,端口是:" + port;
    }




}
