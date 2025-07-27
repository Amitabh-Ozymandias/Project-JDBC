package com.airline.model;

public class Passenger {
    private int passengerId;
    private String name;
    private String gender;
    private int age;
    private String passportNumber;

    public Passenger() {}

    public Passenger(int passengerId, String name, String gender, int age, String passportNumber) {
        this.passengerId = passengerId;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
