package com.example.marketplace_cake.dto;

import lombok.Builder;

@Builder
public record CreateCakeDto(String name, String description, Double price, String image) {
}
