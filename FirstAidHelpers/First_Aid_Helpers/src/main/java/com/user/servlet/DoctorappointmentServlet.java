package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorappointmentDAO;
import com.db.DBConnect;
import com.entity.Doctorappointment;



public class DoctorappointmentServlet extends HttpServlet
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String fullname = req.getParameter("fullname");
		    String appoindate = req.getParameter("appoindate");
		    String appointime = req.getParameter("appointime");
		    String email = req.getParameter("email");
		    String phno = req.getParameter("phno");
		    String area = req.getParameter("area");
		    String city= req.getParameter("city");
		    String state = req.getParameter("state");
		    String postcode = req.getParameter("postcode");

		    Doctorappointment ap = new Doctorappointment(fullname, appoindate, appointime, email, phno, area, city, state, postcode);
		    DoctorappointmentDAO dao = new DoctorappointmentDAO(DBConnect.getConn());
		    boolean f = dao.addAppointment(ap);

		    if (f) {
		        System.out.println("Data inserted successfully");
		    } else {
		    }

		}
}