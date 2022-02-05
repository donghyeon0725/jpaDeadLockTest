package com.jpa.jpatest.controller;

import com.jpa.jpatest.command.FoodCommand;
import com.jpa.jpatest.repository.FoodRepository;
import com.jpa.jpatest.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    private final FoodRepository foodRepository;

    @PostMapping("/food")
    public void createFoodV1(@RequestBody FoodCommand foodCommand) {
        foodService.saveFood(foodCommand);
    }

}
