package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Psychoappoinment;

public class PsychoappointmentDAO {
    private Connection conn;

    public PsychoappointmentDAO(Connection con) {
        super();
        this.conn = con;
    }

    public boolean addAppointment(Psychoappoinment pa) {
        boolean f = false;
        try {
            String sql = "INSERT INTO psychoappointment(fullname, appoindate, appointime, email, phno, area, city, state, postcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pa.getFullName());
            ps.setString(2, pa.getAppoinDate());
            ps.setString(3, pa.getAppoinTime());
            ps.setString(4, pa.getEmail());
            ps.setString(5, pa.getPhNo());
            ps.setString(6, pa.getArea());
            ps.setString(7, pa.getCity());
            ps.setString(8, pa.getState());
            ps.setString(9, pa.getPostcode());

            int i = ps.executeUpdate();
            if (i == 1) {
                f = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return f;
    }
}
