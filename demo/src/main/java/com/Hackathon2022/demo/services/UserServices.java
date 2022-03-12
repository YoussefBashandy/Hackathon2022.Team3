package com.Hackathon2022.demo.services;

import com.Hackathon2022.demo.data.IUserDA;
import com.Hackathon2022.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServices implements IUserServices {

    @Autowired
    IUserDA userDA;

    @Override
    public Boolean findUser(@RequestParam String email,@RequestParam String password) {
        User user = userDA.findByEmail(email);
        if(user == null){
            return false;
        }else {
            if (user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public Boolean saveUser(User user){
        userDA.save(user);
        return true;
    }
}
