package com.example.atulbrewery.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceA implements MyService {
    @Override
    public String getMyService() {
        return "MyServiceA";
    }
}
