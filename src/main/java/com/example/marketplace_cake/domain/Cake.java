package com.example.marketplace_cake.domain;

import com.example.marketplace_cake.dto.CreateCakeDto;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Cake")
@Table(name = "cake")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

    public Cake(CreateCakeDto createCakeDto) {
        this.name = createCakeDto.name();
        this.description = createCakeDto.description();
        this.price = createCakeDto.price();
        this.image = createCakeDto.image();
    }
}
