package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{ //확장한 JPA Repository 인터페이스는 Query 매서드 자동으로 제공, 매서드 이름을 신경써서 결정
//<User, Long> User : 엔티티 이름, Long : 기본키 타입
    List<User> findById(String id);

    boolean existsById(String id);

    boolean existsByIdAndPassword(String id, String password);

}