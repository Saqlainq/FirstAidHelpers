package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Nurseappointment;

public class NurseappointmentDAO {
    private Connection conn;

    public NurseappointmentDAO(Connection con) 
    {
        super();
        this.conn = con;
    }


	public boolean addAppointment(Nurseappointment na) {
        boolean f = false;
        try {
            String sql = "INSERT INTO nurseappointment(fullname, appoindate, appointime, email, phno, area, city, state, postcode) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, na.getFullName());
            ps.setString(2, na.getAppoinDate());
            ps.setString(3, na.getAppoinTime());
            ps.setString(4, na.getEmail());
            ps.setString(5, na.getPhNo());
            ps.setString(6, na.getArea());
            ps.setString(7, na.getCity());
            ps.setString(8, na.getState());
            ps.setString(9, na.getPostcode());

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
