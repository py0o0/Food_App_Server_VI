package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FoodRepository extends JpaRepository<Food, Long> {
    @Query(value = "SELECT * FROM food WHERE cate1 = :cate1 AND cate2 = :cate2 ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Food findRandomByCate1AndCate2(@Param("cate1") String cate1, @Param("cate2") String cate2);
    //2개의 조건에 맞는 데이터 중 랜덤으로 1개를 뽑아옴.

    List<Food> findByCate1AndCate2(String cate1, String cate2);
}