package com.example.marketplace_cake.repository;

import com.example.marketplace_cake.domain.Cake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeRepository extends JpaRepository<Cake, Long> {
}
