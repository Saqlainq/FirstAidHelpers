
<%@page import="com.db.DBConnect" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<%@include file="components/allcss.jsp"%>
</head>
<body>
	<%@include file="components/Navbar.jsp"%>
	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>



		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/jpg1.jpg" class="d-block w-100" alt="..."
					height="800px">
			</div>
			<div class="carousel-item">
				<img src="img/jpg2.jpg" class="d-block w-100" alt="..."
					height="800px">
			</div>
			<div class="carousel-item">
				<img src="img/jpg3.jpg" class="d-block w-100" alt="..."
					height="800px">
			</div>
			<div class="carousel-item">
				<img src="img/jpg4.jpg" class="d-block w-100" alt="..."
					height="500px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<div class="container p-3">
		<p class="text-center fs-2 ">We the First Aid Helpers helps you
			with</p>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Experienced Physicians</p>
								<p>If you ever Feel like Fever or Some kind of illness our
									Physicians are there for you 24*7.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Nurses for Body Check-up</p>
								<p>If You ever feel you should do body check-up and know
									better about your Health our Nurses will be there for you.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Physiotherapist</p>
								<p>For your daily Exercises.</p>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Psychologist</p>
								<p>If you ever feel Low or alone our Psychologist will be
									always there to help you.</p>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
	</div>


	<div class="col-md-4">
		<img alt="" src="">
	</div>
	<section class="hmserviceft">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="all-title">
						<h2>We are FIRST AID HELPERS</h2>
					</div>
				</div>
			</div>
			<div class="row crrow">
				<div class="col-md-3">
					<a href="Doctor.jsp">
						<div class="icons-card">
							<div class="image">
								<img src="img/icn1.webp" alt="">
							</div>
							<div class="title">Home doctor visit</div>
						</div>
					</a>
				</div>
				<div class="col-md-3">
					<a href="Nurse.jsp">
						<div class="icons-card">
							<div class="image">
								<img src="img/icn2.webp" alt="">
							</div>
							<div class="title">Home Nurse Visit</div>
						</div>
					</a>
				</div>
				<div class="col-md-3">
					<a href="Physio.jsp">
						<div class="icons-card">
							<div class="image">
								<img src="img/icn7.webp" alt="">
							</div>
							<div class="title">Physiotherapist</div>


						</div>
					</a>
				</div>
				<div class="col-md-3">
					<a href="Psyco.jsp">
						<div class="icons-card">
							<div class="image">
								<img src="img/icn8.webp" alt="">
							</div>
							<div class="title">Psychologist</div>
						</div>
					</a>
				</div>
			</div>
			<div class="row mt-5">
    <div class="col text-center">
      <!-- Add more margin to move the link further down -->
      <div style="margin-top: 50px;">
        <a href="Disease.jsp" style="color: Red; font-size: 20px;">Click Here! if you think you have symptoms of Diabetes,Blood Pressure or Fever</a>
      </div>
    </div>
  </div>
</div>
</div>
<br>
<br>
<br>
<br>
<br>
</body>
</html>