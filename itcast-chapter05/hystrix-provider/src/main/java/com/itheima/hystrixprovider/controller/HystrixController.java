package com.itheima.hystrixprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @RequestMapping("/hi")
    public String hi(String id) {
        return "Hello World, I'm from hystrix!" + id;
    }

}
