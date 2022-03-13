package com.Hackathon2022.demo.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "applicants")
public class Applicants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int nationalId;
    @Column(name = "applicantname")
    private String applicantName;
    @Column(name = "fromTime")
    private LocalDateTime from;
    @Column(name = "toTime")
    private LocalDateTime to;

    @ManyToOne
    @JoinColumn(name = "center_id", nullable = true)
    private VaccinationCenter center;


    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
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

    public VaccinationCenter getCenter() {
        return center;
    }

    public void setCenter(VaccinationCenter center) {
        this.center = center;
    }
}
