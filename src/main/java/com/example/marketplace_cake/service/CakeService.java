package com.example.marketplace_cake.service;

import com.example.marketplace_cake.domain.Cake;
import com.example.marketplace_cake.dto.CreateCakeDto;

import java.util.List;

public interface CakeService {
    List<Cake> findAll();
    Cake findById(Long id);
    Cake create(CreateCakeDto createCakeDto);
    Cake edit(Long id, CreateCakeDto createCakeDto);
    void delete(Long id);
}
