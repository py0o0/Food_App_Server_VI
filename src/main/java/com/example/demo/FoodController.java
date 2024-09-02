package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;


    @GetMapping("/foodsRandomByCategory") //query로 cate1, cate2를 수신 받아 Food 객체를 송신함
    public Food getRandomFoodByCategory(String cate1, String cate2) {
        return foodRepository.findRandomByCate1AndCate2(cate1, cate2);
    }



}