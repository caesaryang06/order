package com.yxm.order.controller;

import com.yxm.order.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

  @Autowired
  private ProductClient productClient;


    @GetMapping("/getProductMsg")
    public String getMsg(){
        String result = productClient.msg();
        return  result;
    }
}
