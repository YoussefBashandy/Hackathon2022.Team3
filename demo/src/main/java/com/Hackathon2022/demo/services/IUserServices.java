package com.Hackathon2022.demo.services;

import com.Hackathon2022.demo.models.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserServices {
    public Boolean findUser(int id, String password);
    public Boolean saveUser(User user);
}
