package com.airline.model;

import java.sql.Date;

public class Booking {
    private int bookingId;
    private int flightId;
    private int passengerId;
    private String seatNumber;
    private Date bookingDate;

    public Booking(int bookingId, int flightId, int passengerId, String seatNumber, Date bookingDate) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.passengerId = passengerId;
        this.seatNumber = seatNumber;
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getFlightId() {
        return flightId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public Date getBookingDate() {
        return bookingDate;
    }
}
