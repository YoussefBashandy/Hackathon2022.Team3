package com.Hackathon2022.demo.controllers;

import com.Hackathon2022.demo.UberAPI;
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

    @RequestMapping(value = "/bookRide")
    public Boolean bookARide(@RequestParam String destination,@RequestParam User user){
        UberAPI uber = new UberAPI();
        if(user.getAge() >= 60){
            System.out.println("Your ride is for free");
            System.out.println("We will email to you the ride details");
            uber.confirmRide(user);
        }else{
            System.out.println("You will get a discount for your ride within 50% to 75%");
            System.out.println("We will email to you the ride details");
            uber.confirmRide(user);
        }
        return true;
    }
}
