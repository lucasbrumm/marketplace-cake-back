package com.example.marketplace_cake.service.impl;

import com.example.marketplace_cake.domain.Cake;
import com.example.marketplace_cake.dto.CreateCakeDto;
import com.example.marketplace_cake.repository.CakeRepository;
import com.example.marketplace_cake.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CakeServiceImpl implements CakeService {

    @Autowired
    private CakeRepository cakeRepository;

    @Override
    public List<Cake> findAll() {
        return cakeRepository.findAll().stream().sorted(Comparator.comparing(Cake::getId)).toList();
    }

    @Override
    public Cake findById(Long id) {
        return cakeRepository.findById(id).orElse(null);
    }

    @Override
    public Cake create(CreateCakeDto createCakeDto) {
        Cake cake = new Cake(createCakeDto);
        cakeRepository.save(cake);
        return cake;
    }

    @Override
    public Cake edit(Long id, CreateCakeDto createCakeDto) {
        Cake cakeEdited = findById(id);

        cakeEdited.setName(createCakeDto.name());
        cakeEdited.setDescription(createCakeDto.description());
        cakeEdited.setPrice(createCakeDto.price());
        cakeEdited.setImage(createCakeDto.image());

        cakeRepository.save(cakeEdited);
        return cakeEdited;
    }

    @Override
    public void delete(Long id) {
        cakeRepository.deleteById(id);
    }
}
