package com.Hackathon2022.demo.data;

import com.Hackathon2022.demo.models.result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IResultDA extends JpaRepository<result, Integer> {
    result findByNationalID(int nationalId);
}
