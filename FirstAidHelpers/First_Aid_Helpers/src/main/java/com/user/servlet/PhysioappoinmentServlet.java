package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.PhysioappointmentDAO;
import com.db.DBConnect;
import com.entity.Physioappointment;



public class PhysioappoinmentServlet extends HttpServlet
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

		    Physioappointment pa = new Physioappointment(fullname, appoindate, appointime, email, phno, area, city, state, postcode);
		    PhysioappointmentDAO dao = new PhysioappointmentDAO(DBConnect.getConn());
		    boolean f = dao.addAppointment(pa);
		    if (f) {
		        System.out.println("Data inserted successfully");
		    } else {
		   
	}}