package com.yxm.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;



    @GetMapping("/getProductMsg")
    public String getMsg(){
//        第一种调用方式
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject("http://localhost:8080/msg", String.class);

//        第二种调用方式
        String result = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        return  result;
    }
}
