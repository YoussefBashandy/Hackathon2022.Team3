package com.Hackathon2022.demo.data;

import com.Hackathon2022.demo.models.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRideDA extends JpaRepository<Ride, Integer> {
}
