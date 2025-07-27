package com.airline.dao;

import com.airline.model.Booking;
import java.util.List;

public interface BookingDAO {
    void addBooking(Booking booking);
    Booking getBookingById(int id);
    List<Booking> getAllBookings();
    void deleteBooking(int id);
}
