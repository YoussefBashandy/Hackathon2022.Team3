package com.Hackathon2022.demo.models;

import javax.persistence.*;

@Entity(name="user")
public class User {
    @Id
    @Column(name = "nationalID", unique = true)
    private int nationalID;
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "age")
    private int age;
    @Column(name = "City")
    private String city;


    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private VaccinationCenter center;

    public User (){
    }

    public User(User user){
        this.email = user.email;
        this.name = user.name;
        this.password = user.password;
        this.age = user.age;
        this.city = user.city;
        this.nationalID = user.nationalID;
    }

    public int getNationalID() {
        return nationalID;
    }

    public void setNationalID(int nationalID) {
        this.nationalID = nationalID;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
}
