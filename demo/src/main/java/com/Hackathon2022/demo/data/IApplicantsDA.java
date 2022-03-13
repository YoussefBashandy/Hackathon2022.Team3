package com.Hackathon2022.demo.data;


import com.Hackathon2022.demo.models.Applicants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IApplicantsDA extends JpaRepository<Applicants, Integer> {
}
