package com.example.lastprojectspringboot.controller;
import com.example.lastprojectspringboot.bussines.abstracts.UserService;
import com.example.lastprojectspringboot.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<User> GetAll(){
        return userService.getAll();
    }
}
