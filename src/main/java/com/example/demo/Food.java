package com.example.demo;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "food")
@NoArgsConstructor
@Getter
@Builder
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FOOD",nullable = false) //컬럼
    private String food; //클라이언트에게 송신 할 데이터
    @Column(name = "CATE1")
    private String cate1;//클라이언트에게 수신 받을 데이터

    @Column(name = "CATE2")
    private String cate2;//클라이언트에게 수신 받을 데이터

    @Builder
    public Food(String food, String cate1, String cate2) {
        this.food = food;
        this.cate1 = cate1;
        this.cate2 = cate2;
    }


}
