package com.Hackathon2022.demo.models;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "id", unique = true)
    private int id;
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
    @Column(name = "sex")
    private String sex;
    @Column(name = "phone")
    private String phone;


    @ManyToOne
    @JoinColumn(name = "center_id", nullable = true)
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
        this.age=user.age;
        this.id = user.id;
        this.phone = user.phone;
    }

    public VaccinationCenter getCenter() {
        return center;
    }

    public void setCenter(VaccinationCenter center) {
        this.center = center;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
}
