package com.Hackathon2022.demo.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;

import com.Hackathon2022.demo.data.IApplicantsDA;
import com.Hackathon2022.demo.data.ICenterDA;
import com.Hackathon2022.demo.models.Applicants;
import com.Hackathon2022.demo.models.Ride;
import com.Hackathon2022.demo.models.User;
import com.Hackathon2022.demo.models.VaccinationCenter;
import com.Hackathon2022.demo.services.IUserServices;

import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    IUserServices userServices;
    @Autowired
    IApplicantsDA applicantsDA;
    @Autowired
    ICenterDA centerDA;


    @RequestMapping(value = "/SignIn",method = RequestMethod.POST)
    public Boolean login(@RequestBody Map<String,String> object ) {
        System.out.println(object.toString());
        String id = object.get("id");
        int I = Integer.parseInt(id);
        String pass = object.get("pass");
        System.out.println(id+"   "+pass);
        return userServices.findUser(I, pass);
    }

    @PostMapping("/SignUp")
    public Boolean register(@RequestBody User user) {
        VaccinationCenter center = centerDA.findById(1);
        user.setCenter(center);
        return userServices.saveUser(user);
    }


    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public void confirmation(@RequestBody Map<String, String> object){
        String strID = object.get("id");
        int id = Integer.parseInt(strID);

        User user = userServices.getUser(id);

        String timeFrom = object.get("from");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime from = LocalDateTime.parse(timeFrom, formatter);

        String timeTo = object.get("to");
        LocalDateTime to = LocalDateTime.parse(timeTo, formatter);

       // result result = new result();
       // if(to.isBefore(from)) {
            System.out.println("Your vaccination center is " + user.getCenter().getName());
            System.out.println("You can go take your vaccine from: " + from.toString() + "to: " + to.toString());

            String ride = object.get("uber");
            Ride rideDetails = new Ride();
            if (ride.equals("true")) {
                rideDetails = userServices.bookARide(user, from);
            } else {
                System.out.println("You choose not to take a ride");
            }

            String pharmCoupon = object.get("pharmacy");
            String uniqueID = "";
            if (pharmCoupon.equals("true")) {
                uniqueID = UUID.randomUUID().toString();
                System.out.println("You can use this coupon at El-Azaby Pharmacies: " + uniqueID);
            }

            Applicants applicant = new Applicants();
            applicant.setNationalId(user.getNationalID());
            applicant.setApplicantName(user.getName());
            applicant.setFrom(from);
            applicant.setTo(to);
            applicant.setCenter(user.getCenter());

            applicantsDA.save(applicant);
     //   }
/*
           // result.setRideDetails(rideDetails);
            result.setCenterName(user.getCenter().getName());
            result.setFrom(from);
            result.setTo(to);
            result.setNationalID(user.getNationalID());
            result.setPromoCode(uniqueID);
        }
        resultDA.save(result);
    }
/*
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public result getResult(int id){
        result result = resultDA.findByNationalID(id);
        return result;
    }
*/
}
}
