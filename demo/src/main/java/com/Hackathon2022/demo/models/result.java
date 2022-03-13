package com.Hackathon2022.demo.models;

import com.Hackathon2022.demo.models.Ride;
import com.Hackathon2022.demo.models.VaccinationCenter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class result {

    @Id
    @Column(name = "nationalID")
    private int nationalID;
    @Column(name = "centerName")
    private String centerName;
    @Column(name = "from")
    private LocalDateTime from;
    @Column(name = "to")
    private LocalDateTime to;
    @Column(name = "promocode")
    private String promoCode;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ride_id", referencedColumnName = "id")
    private Ride rideDetails;


    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public Ride getRideDetails() {
        return rideDetails;
    }

    public void setRideDetails(Ride rideDetails) {
        this.rideDetails = rideDetails;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getTo() {
        return to;
    }

    public void setTo(LocalDateTime to) {
        this.to = to;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }
}
