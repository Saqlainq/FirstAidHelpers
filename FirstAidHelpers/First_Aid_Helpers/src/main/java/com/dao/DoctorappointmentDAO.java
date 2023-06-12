package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Doctorappointment;

public class DoctorappointmentDAO {
    private Connection conn;

    public DoctorappointmentDAO(Connection con) {
        super();
        this.conn = con;
    }

    public boolean addAppointment(Doctorappointment ap) {
        boolean f = false;
        try {
            String sql = "INSERT INTO doctorappointment(fullname, appoindate, appointime, email, phno, area, city, state, postcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ap.getFullName());
            ps.setString(2, ap.getAppoinDate());
            ps.setString(3, ap.getAppoinTime());
            ps.setString(4, ap.getEmail());
            ps.setString(5, ap.getPhNo());
            ps.setString(6, ap.getArea());
            ps.setString(7, ap.getCity());
            ps.setString(8, ap.getState());
            ps.setString(9, ap.getPostcode());
            

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