package com.itheima.eurekahystrixclient.controller;

import com.itheima.eurekahystrixclient.service.LocalItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalItemController {

    @Autowired
    LocalItemService localItemService;

    @GetMapping("/hi")
    public String hi(String id) {
        return localItemService.hi(id);
    }

}
