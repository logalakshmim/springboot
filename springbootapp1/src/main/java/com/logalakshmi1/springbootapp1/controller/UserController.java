package com.logalakshmi1.springbootapp1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logalakshmi1.springbootapp1.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{userId}")
    public User getById(@PathVariable String userId) {
        return new User(userId, "Logalakshmi", "M", "logalakshmi@gmail.com");
    }

    @GetMapping("")
    public List<User> getAll() {
        return List.of(
            new User("111", "logalakshmi", "M", "logalakshmi@gmail.com"),
            new User("123", "Loga", "k", "Loga@gmail.com")
        );
    }
}