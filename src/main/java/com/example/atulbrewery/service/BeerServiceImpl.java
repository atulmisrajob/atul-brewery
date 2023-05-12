package com.example.atulbrewery.service;

import com.example.atulbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerbyId(UUID beerid) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("old monk")
                .beerStyle("pale ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(beerDto.getId())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updatedBeer(UUID beerId, BeerDto beerDto) {
        System.out.println(beerDto);
    }
}
