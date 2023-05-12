package com.example.atulbrewery.service;

import com.example.atulbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerbyId(UUID beerid);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updatedBeer(UUID beerId, BeerDto beerDto);
}
