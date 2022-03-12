package com.Hackathon2022.demo.data;

import com.Hackathon2022.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDA extends JpaRepository<User, Integer> {
    User findByEmail(int nationalId);
}
