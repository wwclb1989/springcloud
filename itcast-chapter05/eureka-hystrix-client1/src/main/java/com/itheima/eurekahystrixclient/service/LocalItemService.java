package com.itheima.eurekahystrixclient.service;

import com.itheima.eurekahystrixclient.config.HystrixConfig;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

//@Service
@FeignClient(value = "hystrix-provider1", configuration = HystrixConfig.class, fallback = LocalItemServiceImpl.class)
public interface LocalItemService {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "hiError")
//    public String hi(String id) {
//        return restTemplate.getForObject("http://hystrix-provider/hi?id=" + id, String.class);
//    }
//
//    public String hiError(String id) {
//        return String.format("Hi, your message is : %s but request bad.", id);
//    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi(@RequestParam(value = "id") String id);

}
