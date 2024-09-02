package com.example.demo;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor
@Getter
@Builder
public class User {
    @Id

    @Column(name = "ID",nullable = false)
    private String id;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ONE")//음식의 선호순위
    private String one;

    @Column(name = "TWO")
    private String two;

    @Column(name = "THREE")
    private String three;

    @Column(name = "FOUR")
    private String four;

    @Builder
    public User(String id, String password, String one, String two, String three, String four) {
        this.id = id;
        this.password = password;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }
}