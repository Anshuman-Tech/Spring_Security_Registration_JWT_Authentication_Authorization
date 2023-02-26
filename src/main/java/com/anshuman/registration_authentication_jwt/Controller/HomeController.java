package com.anshuman.registration_authentication_jwt.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String home(){
        return "This is the homepage or all users";
    }


    @GetMapping("/auth")
    public String authorizedPage(){
        return "This page is for authorized users";
    }
}
