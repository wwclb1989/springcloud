package com.itheima.eurekafeignclient.service;

import com.itheima.eurekafeignclient.config.LogConfiguration;
import com.itheima.eurekafeignclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@FeignClient(name = "eureka-provider", configuration = LogConfiguration.class)
public interface FeignService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestParam("name") String name, @RequestHeader("age") int age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
