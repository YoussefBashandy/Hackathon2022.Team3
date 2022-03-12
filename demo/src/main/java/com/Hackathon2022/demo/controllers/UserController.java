package com.Hackathon2022.demo.controllers;

import java.util.Map;

import com.Hackathon2022.demo.models.User;
import com.Hackathon2022.demo.services.IUserServices;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    IUserServices userServices;

    @RequestMapping(value = "/SignIn",method = RequestMethod.POST)
    public Boolean login(@RequestBody Map<String,String> object ) {
        System.out.println(object.toString());
        String id = object.get("id");
        int I = Integer.parseInt(id);
        String pass = object.get("pass");
        System.out.println(id+"   "+pass);
        return userServices.findUser(I, pass);
    }

    @PostMapping("/SignUp")
    public Boolean register(@RequestBody User user) {
        return userServices.saveUser(user);
    }
}
