package com.jpa.jpatest.service;

import com.jpa.jpatest.command.FoodCommand;
import com.jpa.jpatest.entity.Food;
import com.jpa.jpatest.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    // 새로운 트랜젝션 요청
    @Transactional
    public Food saveFood(FoodCommand foodCommand) {
        Food food = new Food();

        food.setName(foodCommand.getName());
        food.setPrice(foodCommand.getPrice());

        foodRepository.save(food);

        return food;
    }


}
