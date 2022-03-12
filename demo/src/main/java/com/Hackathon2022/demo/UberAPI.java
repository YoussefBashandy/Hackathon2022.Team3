package com.Hackathon2022.demo;

import com.Hackathon2022.demo.models.User;

import java.lang.reflect.Array;
import java.util.Random;

import static java.util.Calendar.PM;

public class UberAPI {
    public Ride confirmRide(User user){
        String[] driver = {"Ahmed", "Mohamed", "Adel", "Omar", "Hassan", "Youssef", "Ashraf", "Amr"};
        String[] carBrands = {"Hyundai", "BMW", "BYD", "Suzuki", "Mazda", "FIAT", "KIA", "Nissan"};
        Random rand = new Random();
        int randInt = rand.nextInt(8);
        Random rand2 = new Random();
        int randomInt = rand.nextInt(9999);
        Ride ride = new Ride();
        ride.setDriver(driver[randInt]);
        ride.setCarBrand(carBrands[randInt]);
        ride.setCarNumber(randomInt);
        ride.setRideTime(null);

        return ride;
    }
}