package com.Hackathon2022.demo.controllers;

import com.Hackathon2022.demo.models.User;
import com.Hackathon2022.demo.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    IUserServices userServices;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Boolean login(@RequestParam int id, @RequestParam String pass) {
        return userServices.findUser(id, pass);
    }

    @PostMapping(value = "/register")
    public Boolean register(@RequestBody User user) {
        return userServices.saveUser(user);
    }
}
