package com.example.atulbrewery.service;

import com.example.atulbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

}
