package com.example.atulbrewery.web.controller;

import com.example.atulbrewery.service.CustomerService;
import com.example.atulbrewery.web.model.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;


@RequestMapping("/api/v1/customer")
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping({"{id}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable ("id") UUID id){
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }


}
