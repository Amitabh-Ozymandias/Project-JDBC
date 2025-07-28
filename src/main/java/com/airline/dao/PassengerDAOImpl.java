package com.airline.dao;

import com.airline.model.Passenger;
import com.airline.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAOImpl implements PassengerDAO {

    @Override
    public void addPassenger(Passenger passenger) {
        String sql = "INSERT INTO Passenger (passenger_id, name, email, age, phone) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, passenger.getPassengerId());
            stmt.setString(2, passenger.getName());
            stmt.setString(3, passenger.getEmail());
            stmt.setInt(4, passenger.getAge());
            stmt.setString(5, passenger.getPhone());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Passenger getPassengerById(int id) {
        String sql = "SELECT * FROM Passenger WHERE passenger_id = ?";
        Passenger passenger = null;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                passenger = new Passenger(
                        rs.getInt("passenger_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("phone")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passenger;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        String sql = "SELECT * FROM Passenger";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Passenger passenger = new Passenger(
                        rs.getInt("passenger_id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getInt("age"),
                        rs.getString("phone")
                );
                passengers.add(passenger);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return passengers;
    }

    @Override
    public void updatePassenger(Passenger passenger) {
        String sql = "UPDATE Passenger SET name = ?, email = ?, age = ?, phone = ? WHERE passenger_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, passenger.getName());
            stmt.setString(2, passenger.getEmail());
            stmt.setInt(3, passenger.getAge());
            stmt.setString(4, passenger.getPhone());
            stmt.setInt(5, passenger.getPassengerId());

            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePassenger(int id) {
        String sql = "DELETE FROM Passenger WHERE passenger_id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
