package com.airline.dao;

import com.airline.model.Flight;
import java.util.List;

public interface FlightDAO {
    void addFlight(Flight flight);
    Flight getFlightById(int id);
    List<Flight> getAllFlights();
    void updateFlight(Flight flight);
    void deleteFlight(int id);
}