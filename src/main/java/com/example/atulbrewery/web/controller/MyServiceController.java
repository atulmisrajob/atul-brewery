package com.example.atulbrewery.web.controller;


import com.example.atulbrewery.service.MyService;
import com.example.atulbrewery.service.MyServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/myService")
public class MyServiceController {

    private final MyServiceImpl myService;


    @GetMapping("/service")
    public String getMyService() {
        return myService.getMyService();
    }


}
