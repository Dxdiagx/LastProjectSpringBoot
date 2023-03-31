package com.example.lastprojectspringboot.bussines.abstracts;

import com.example.lastprojectspringboot.entities.User;
import com.example.lastprojectspringboot.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    List <User> getAll();
    public UserResponse getUserForId(int userId);

}
