package com.Hackathon2022.demo;

import java.sql.Time;

public class Ride {
    private String driver;
    private int carNumber;
    private String carBrand;
    private Time rideTime;

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

    public Time getRideTime() {
        return rideTime;
    }

    public void setRideTime(Time rideTime) {
        this.rideTime = rideTime;
    }
}
