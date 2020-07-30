package com.itheima.eurekahystrixclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocalItemService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String id) {
        return restTemplate.getForObject("http://hystrix-provider/hi?id=" + id, String.class);
    }

    public String hiError(String id) {
        return String.format("Hi, your message is : %s but request bad.", id);
    }

}
