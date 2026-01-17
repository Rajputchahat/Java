<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="comEntity.Count"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Dashboard</title>

<%@ include file="../component/Allcss.jsp"%>

<style>
/* ===== Background ===== */
body {
	margin: 0;
	font-family: "Segoe UI", Arial, sans-serif;
	background-image: url("../Image/er4.jpg");
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	background-attachment: fixed;
}
.dropdown-toggle{
   min-width:160px;
}

/* ===== Glass Card ===== */
.glass-card {
	background: rgba(255, 255, 255, 0.18);
	backdrop-filter: blur(14px);
	-webkit-backdrop-filter: blur(14px);
	border-radius: 18px;
	border: 1px solid rgba(255, 255, 255, 0.3);
	box-shadow: 0 20px 40px rgba(0, 0, 0, 0.35);
	transition: all 0.4s ease;
	color: #fff;
}

.glass-card:hover {
	transform: translateY(-10px) scale(1.03);
	box-shadow: 0 30px 60px rgba(0, 0, 0, 0.6);
}

/* ===== Icons ===== */
.dashboard-icon {
	font-size: 55px;
	margin-bottom: 15px;
}

/* ===== Title Section ===== */
.dashboard-title {
	font-size: 36px;
	font-weight: 700;
	color: #ffffff;
	text-shadow: 2px 2px 10px rgba(0,0,0,0.7);
}

.dashboard-quote {
	font-size: 18px;
	color: #f1f1f1;
	font-style: italic;
	text-shadow: 1px 1px 6px rgba(0,0,0,0.6);
}
</style>

</head>
<body>

<%@ include file="navbar.jsp"%>

<%
	String id = (String) session.getAttribute("doctorid");
	Count obj = new Count();
%>

<!-- ===== Header ===== -->
<div class="container text-center mt-4">
	<p class="dashboard-title">👨‍⚕️ Doctor Dashboard</p>
	<p class="dashboard-quote">
		"Wherever the art of medicine is loved, there is also a love of humanity."
	</p>
</div>

<!-- ===== Dashboard Cards ===== -->
<div class="container mt-5">
	<div class="row justify-content-center g-4">

		<!-- Doctor Count -->
		<div class="col-md-4 text-center">
			<div class="card glass-card p-4">
				<div class="card-body">
					<i class="fas fa-user-md dashboard-icon text-warning"></i>
					<h4 class="mt-3">Total Doctors</h4>
					<h2 class="fw-bold"><%= obj.countDoctor() %></h2>
					<p>Dedicated professionals saving lives</p>
				</div>
			</div>
		</div>

		<!-- Appointment Count -->
		<div class="col-md-4 text-center">
			<div class="card glass-card p-4">
				<div class="card-body">
					<i class="fas fa-calendar-check dashboard-icon text-info"></i>
					<h4 class="mt-3">Your Appointments</h4>
					<h2 class="fw-bold"><%= obj.countAppointmentByDoctorId(id) %></h2>
					<p>Your care makes a difference every day</p>
				</div>
			</div>
		</div>

	</div>
</div>

<!-- ===== Motivation Footer Text ===== -->
<div class="container text-center mt-5 mb-4">
	<p class="dashboard-quote">
		"Saving one life may not change the world, but for that one person, the world changes forever."
	</p>
</div>

</body>
</html>
