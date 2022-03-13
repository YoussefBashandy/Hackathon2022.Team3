package com.Hackathon2022.demo.services;
import com.Hackathon2022.demo.UberAPI;
import com.Hackathon2022.demo.data.IApplicantsDA;
import com.Hackathon2022.demo.data.IRideDA;
import com.Hackathon2022.demo.data.IUserDA;
import com.Hackathon2022.demo.models.Ride;
import com.Hackathon2022.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Service
public class UserServices implements IUserServices {

    @Autowired
    IUserDA userDA;
    @Autowired
    IRideDA rideDA;

    @Override
    public Boolean findUser(@RequestParam int id,@RequestParam String password) {
        User user = userDA.findByNationalID(id);
        if(user == null){
            return false;
        }else {
            if (user.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public Boolean saveUser(User user){
        userDA.save(user);
        return true;
    }

    @Override
    public void bookARide(User user, LocalDateTime rideTime){
        UberAPI uber = new UberAPI();
        Ride ride = uber.confirmRide(user, rideTime);
        rideDA.save(ride);
        if(ride != null){
            System.out.println("Your ride has been successfully booked");
            System.out.println("Your ride details..");
            System.out.println("Driver's name:" + ride.getDriver());
            System.out.println("Car Number:" + ride.getCarNumber());
            System.out.println("Car brand:" + ride.getCarBrand());
            System.out.println("Time:" + ride.getRideTime());
        }else{
            System.out.println("We are facing a problem right now booking your ride. Please try again later");
        }
    }

    @Override
    public User getUser(int id){
        User user = userDA.findByNationalID(id);

        return user;
    }
}
