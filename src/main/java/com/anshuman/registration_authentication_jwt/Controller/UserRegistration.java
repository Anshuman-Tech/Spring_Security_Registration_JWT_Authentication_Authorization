package com.anshuman.registration_authentication_jwt.Controller;

import com.anshuman.registration_authentication_jwt.DAO.UserDAO;
import com.anshuman.registration_authentication_jwt.Entity.User;
import com.anshuman.registration_authentication_jwt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class UserRegistration {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User registerUser(@RequestBody UserDAO userDAO){
        return userService.registerUser(userDAO);
    }
}
