package com.example.atulbrewery.service;


import org.springframework.stereotype.Service;

@Service
public class MyServiceB  implements MyService {
    @Override
    public String getMyService() {
        return "MyServiceB";
    }
}
