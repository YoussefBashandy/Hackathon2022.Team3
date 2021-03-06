package com.Hackathon2022.demo.models;

import javax.persistence.*;
import java.util.Set;
//import java.util.Set;

@Entity(name = "center")
public class VaccinationCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "City")
    private String city;
    @Column(name = "capacity")
    private int capacity;

    @OneToMany(mappedBy = "center")
    private Set<User> users;

    @OneToMany(mappedBy = "center")
    private Set<Ride> rides;

    @OneToMany(mappedBy = "center")
    private Set<Applicants> applicants;

    public Set<Ride> getRides() {
        return rides;
    }

    public void setRides(Set<Ride> rides) {
        this.rides = rides;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


}
