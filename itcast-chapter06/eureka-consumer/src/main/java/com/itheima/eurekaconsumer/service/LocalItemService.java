package com.itheima.eurekaconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class LocalItemService {

    @Autowired
    RestTemplate restTemplate;


    public String hi(@RequestParam(value = "id")String id) {
        return restTemplate.getForObject("http://eureka-provider/hi?id=" + id, String.class);
    }

}
