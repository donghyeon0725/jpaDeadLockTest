package com.jpa.jpatest.repository;

import com.jpa.jpatest.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
