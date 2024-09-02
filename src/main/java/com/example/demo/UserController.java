package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/preferences") // 아이디를 수신받아 데이터베이스에 등록된 사용자 정보 송신
    public List<User> findById(String id) {
        return userRepository.findById(id);
    }

    @GetMapping("/existsId") // 아이디를 수신받아 이미 데이터베이스에 등록된 아이디인지 확인
    public Boolean checkUserExists(String id) {
        return  userRepository.existsById(id);
    }

    @GetMapping("/Login") // 아이디와 비밀번호를 수신받아 로그인 정보 확인
    public boolean checkLogin(String id,String password) {
        return  userRepository.existsByIdAndPassword(id,password);
    }

    @PostMapping("/create") // User 객체를 송신받아 데이터베이스에 등록
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
