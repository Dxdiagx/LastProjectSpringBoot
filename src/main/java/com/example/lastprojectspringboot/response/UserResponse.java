package com.example.lastprojectspringboot.response;

import com.example.lastprojectspringboot.entities.User;
import jakarta.persistence.Column;

public class UserResponse {
    int userId;

    String userName;

    String userSurname;

    String userMail;

    String userPhoneNumber;
    String userPassword;

    public UserResponse(User entity) {
        this.userId = entity.getUserId();
        this.userName = entity.getUserName();
        this.userSurname = entity.getUserSurname();
        this.userMail = entity.getUserMail();
        this.userPhoneNumber = entity.getUserPhoneNumber();
        this.userPassword=entity.getUserPassword();
    }
}
