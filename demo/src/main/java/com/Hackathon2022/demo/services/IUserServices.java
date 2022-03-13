package com.Hackathon2022.demo.services;

import com.Hackathon2022.demo.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public interface IUserServices {
    public Boolean findUser(int id, String password);
    public Boolean saveUser(User user);
    public void bookARide(User user, LocalDateTime rideTime);
    public User getUser(int id);
}
