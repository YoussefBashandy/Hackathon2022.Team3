package com.Hackathon2022.demo.services;



import com.Hackathon2022.demo.models.Ride;
import org.springframework.stereotype.Service;

@Service
public interface IRideService {
    public Boolean saveRide(Ride ride);

}
