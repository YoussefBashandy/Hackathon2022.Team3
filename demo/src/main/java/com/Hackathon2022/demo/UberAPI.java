package com.Hackathon2022.demo;

import com.Hackathon2022.demo.models.Ride;
import com.Hackathon2022.demo.models.User;

import java.time.LocalDateTime;
import java.util.Random;

public class UberAPI {
    public Ride confirmRide(User user, LocalDateTime rideTime){
        String[] driver = {"Ahmed", "Mohamed", "Adel", "Omar", "Hassan", "Youssef", "Ashraf", "Amr"};
        String[] carBrands = {"Hyundai", "BMW", "BYD", "Suzuki", "Mazda", "FIAT", "KIA", "Nissan"};
        Random rand = new Random();
        int randInt = rand.nextInt(8);
        Random rand2 = new Random();
        int randomInt = rand2.nextInt(9999);
        Ride ride = new Ride();
        ride.setDriver(driver[randInt]);
        ride.setCarBrand(carBrands[randInt]);
        ride.setCarNumber(randomInt);
        ride.setRideTime(rideTime);
        ride.setCenter(user.getCenter());

        return ride;
    }
}
