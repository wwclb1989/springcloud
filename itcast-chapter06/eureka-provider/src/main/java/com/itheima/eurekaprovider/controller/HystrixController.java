package com.itheima.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

    @RequestMapping("/hi")
    public String hi(String id) {
        return "hi，访问成功！" + id;
    }

}
