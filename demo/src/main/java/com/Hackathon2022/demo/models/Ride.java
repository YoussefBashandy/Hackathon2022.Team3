package com.Hackathon2022.demo.models;

import com.Hackathon2022.demo.models.VaccinationCenter;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "driverName")
    private String driver;
    @Column(name = "carNumber")
    private int carNumber;
    @Column(name = "carBrand")
    private String carBrand;
    @Column(name = "rideTime")
    private LocalDateTime rideTime;


    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    private VaccinationCenter center;

    public VaccinationCenter getCenter() {
        return center;
    }

    public void setCenter(VaccinationCenter center) {
        this.center = center;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public LocalDateTime getRideTime() {
        return rideTime;
    }

    public void setRideTime(LocalDateTime rideTime) {
        this.rideTime = rideTime;
    }
}