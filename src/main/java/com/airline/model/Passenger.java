package com.airline.model;

public class Passenger {
    private int passengerId;
    private String name;
    private String email;
    private int age;
    private String phone;

    public Passenger(int passengerId, String name, String email, int age, String phone) {
        this.passengerId = passengerId;
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
