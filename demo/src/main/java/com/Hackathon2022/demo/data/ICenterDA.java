package com.Hackathon2022.demo.data;

import com.Hackathon2022.demo.models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICenterDA extends JpaRepository<VaccinationCenter, String> {
    VaccinationCenter findByCity(String city);
    VaccinationCenter findById(int id);
}
