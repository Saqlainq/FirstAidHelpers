package com.entity;

public class Psychoappoinment {
	 private int id;
	    private String fullName;
	    private String appoinDate;
	    private String appoinTime;
	    private String email;
	    private String phNo;
	    private String area;
	    private String city;
	    private String state;
	    private String postcode;
		public Psychoappoinment(String fullName, String appoinDate, String appoinTime, String email, String phNo,
				String area, String city, String state, String postcode) {
			super();
			this.fullName = fullName;
			this.appoinDate = appoinDate;
			this.appoinTime = appoinTime;
			this.email = email;
			this.phNo = phNo;
			this.area = area;
			this.city = city;
			this.state = state;
			this.postcode = postcode;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getAppoinDate() {
			return appoinDate;
		}
		public void setAppoinDate(String appoinDate) {
			this.appoinDate = appoinDate;
		}
		public String getAppoinTime() {
			return appoinTime;
		}
		public void setAppoinTime(String appoinTime) {
			this.appoinTime = appoinTime;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhNo() {
			return phNo;
		}
		public void setPhNo(String phNo) {
			this.phNo = phNo;
		}
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostcode() {
			return postcode;
		}
		public void setPostcode(String postcode) {
			this.postcode = postcode;
		}
	    
	    

}
