package com.example.marketplace_cake.controller;

import com.example.marketplace_cake.domain.Cake;
import com.example.marketplace_cake.dto.CreateCakeDto;
import com.example.marketplace_cake.service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cakes")
@CrossOrigin("http://localhost:4200")
public class CakeController {
    @Autowired
    private CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping
    public List<Cake> findAll() {
        return cakeService.findAll();
    }

    @GetMapping("/{id}")
    public Cake findById(@PathVariable Long id) {
        return cakeService.findById(id);
    }

    @PostMapping
    public Cake create(@RequestBody CreateCakeDto createCakeDto) {
        return cakeService.create(createCakeDto);
    }

    @PutMapping("/{id}")
    public Cake edit(@PathVariable Long id, @RequestBody CreateCakeDto createCakeDto) {
        return cakeService.edit(id, createCakeDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cakeService.delete(id);
    }
}
