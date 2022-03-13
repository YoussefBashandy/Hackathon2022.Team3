package com.Hackathon2022.demo.services;


import com.Hackathon2022.demo.data.IRideDA;
import com.Hackathon2022.demo.models.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RideServices implements IRideService{

    @Autowired
    IRideDA rideDA;

    @Override
    public Boolean saveRide(Ride ride){
        rideDA.save(ride);
        return true;
    }
}
