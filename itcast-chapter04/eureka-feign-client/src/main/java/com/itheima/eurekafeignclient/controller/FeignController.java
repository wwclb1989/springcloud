package com.itheima.eurekafeignclient.controller;

import com.itheima.eurekafeignclient.entity.User;
import com.itheima.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return feignService.sayHello();
    }

    @RequestMapping(value = "/helloUser", method = RequestMethod.GET)
    public String helloUser() {
        StringBuilder sb = new StringBuilder();
        sb.append(feignService.hello("czbk")).append("<br/>");
        sb.append(feignService.hello(new User("czbk", 30))).append("<br/>");
        sb.append(feignService.hello("czbk", 30)).append("<br/>");

        return sb.toString();
    }
}
