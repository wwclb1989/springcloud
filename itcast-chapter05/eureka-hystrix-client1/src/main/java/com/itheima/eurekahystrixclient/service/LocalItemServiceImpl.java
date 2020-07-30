package com.itheima.eurekahystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class LocalItemServiceImpl implements LocalItemService{

    @Override
    public String hi(String id) {
        return String.format("Hi, your message is : %s but request bad.", id);
    }
}
