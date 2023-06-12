package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dao.PsychoappointmentDAO;
import com.db.DBConnect;
import com.entity.Psychoappoinment;



public class PsychoappointmentServlet extends HttpServlet
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

		    Psychoappoinment pa = new Psychoappoinment(fullname, appoindate, appointime, email, phno, area, city, state, postcode);
		    PsychoappointmentDAO dao = new PsychoappointmentDAO(DBConnect.getConn());
		    boolean f = dao.addAppointment(pa);

		    if (f) {
		        System.out.println("Data inserted successfully");
		    } else {
		    }

		}
}
