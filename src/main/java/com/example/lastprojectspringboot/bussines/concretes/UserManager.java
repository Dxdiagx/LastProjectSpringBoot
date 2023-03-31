package com.example.lastprojectspringboot.bussines.concretes;

import com.example.lastprojectspringboot.Repository.UserRepository;
import com.example.lastprojectspringboot.bussines.abstracts.UserService;
import com.example.lastprojectspringboot.entities.User;
import com.example.lastprojectspringboot.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements UserService {
    private UserRepository userRepository;

    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }


    @Override
    public UserResponse getUserForId(int userId) {
        User user=userRepository.findByUserId(userId);
        return new UserResponse(user);
    }



}
