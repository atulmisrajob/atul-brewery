package com.example.atulbrewery.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl {

    private final MyService myService;

    public MyServiceImpl(@Qualifier("myServiceA") MyService myService) {
        this.myService = myService;
    }


    public String getMyService() {
        return myService.getMyService();
    }
}
