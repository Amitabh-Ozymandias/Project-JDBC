package com.airline.dao;

import com.airline.model.Passenger;
import java.util.List;

public interface PassengerDAO {
    void addPassenger(Passenger passenger);
    Passenger getPassengerById(int id);
    List<Passenger> getAllPassengers();
    void updatePassenger(Passenger passenger);
    void deletePassenger(int id);
}
