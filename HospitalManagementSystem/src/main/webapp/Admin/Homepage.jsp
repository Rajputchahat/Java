<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="comEntity.Count"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<%@ include file="../component/Allcss.jsp"%>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style>
body {
	margin: 0;
	font-family: "Segoe UI", Arial, sans-serif;
	background-image: url("../Image/er9.jpg");
	background-size: cover;
	background-position: center;
	background-repeat: no-repeat;
	background-attachment: fixed;
}

/* Heading */
.dashboard-title {
	font-weight: 700;
	letter-spacing: 1px;
	text-shadow: 0 4px 10px rgba(0,0,0,0.3);
}

/* Card */
.paint-card {
	background: #ffffff;
	border-radius: 12px;
	box-shadow: 0 8px 18px rgba(0,0,0,0.25);
	transition: all 0.3s ease;
	cursor: pointer;
}

.paint-card:hover {
	transform: translateY(-8px);
	box-shadow: 0 18px 40px rgba(0,0,0,0.35);
}

/* Icon */
.card-icon {
	font-size: 40px;
	margin-bottom: 10px;
	color: #0d6efd;
}

/* Card text */
.card-heading {
	font-size: 20px;
	font-weight: 600;
	color: #333;
}

.card-count {
	font-size: 26px;
	font-weight: bold;
	color: #198754;
}

/* Modal */
.modal-content {
	border-radius: 12px;
}
</style>
</head>

<body>
<%@ include file="navbar.jsp"%>

<div class="container p-5">
	<h1 class="text-center text-warning dashboard-title mb-5">
		<i class="fa-solid fa-user-shield"></i> Admin Dashboard
	</h1>

	<%
	String msg = (String) request.getAttribute("msg");
	String color = (String) request.getAttribute("color");
	if (msg != null) {
	%>
	<p class="text-center fs-4 fw-bold" style="color:<%=color%>"><%=msg%></p>
	<script>
		setTimeout(() => {
			window.location.href = "Admin/Homepage.jsp";
		}, 3000);
	</script>
	<%
	}
	%>

	<% Count obj = new Count(); %>

	<div class="row">

		<!-- Department -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center"
				data-bs-toggle="modal" data-bs-target="#exampleModal">
				<div class="card-body">
					<i class="fa-solid fa-stethoscope card-icon"></i>
					<p class="card-heading">Add Department / Specialization</p>
					<p class="card-count"><%=obj.countSpecialist()%></p>
				</div>
			</div>
		</div>

		<!-- Doctor -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center">
				<div class="card-body">
					<i class="fa-solid fa-user-doctor card-icon"></i>
					<p class="card-heading">Doctors</p>
					<p class="card-count"><%=obj.countDoctor()%></p>
				</div>
			</div>
		</div>

		<!-- User -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center">
				<div class="card-body">
					<i class="fa-solid fa-users card-icon"></i>
					<p class="card-heading">Users / Patients</p>
					<p class="card-count"><%=obj.countUser()%></p>
				</div>
			</div>
		</div>

		<!-- Appointment -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center">
				<div class="card-body">
					<i class="fa-solid fa-calendar-check card-icon"></i>
					<p class="card-heading">Total Appointments</p>
					<p class="card-count"><%=obj.countAppointment()%></p>
				</div>
			</div>
		</div>

		<!-- Bed -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center">
				<div class="card-body">
					<i class="fa-solid fa-bed card-icon"></i>
					<p class="card-heading">Beds Available</p>
					<p class="card-count">20</p>
				</div>
			</div>
		</div>

		<!-- Insurance -->
		<div class="col-md-4 p-4">
			<div class="card paint-card text-center">
				<div class="card-body">
					<i class="fa-solid fa-file-shield card-icon"></i>
					<p class="card-heading">Insurance Validity</p>
					<p class="card-count">Check</p>
				</div>
			</div>
		</div>

	</div>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h5 class="modal-title text-primary">
					Add Doctor Specialization
				</h5>
				<button type="button" class="btn-close"
					data-bs-dismiss="modal"></button>
			</div>
			<div class="modal-body">
				<form action="../AddSpecialist" method="post">
					<div class="mb-3">
						<label class="form-label">Specialization Name</label>
						<input type="text" class="form-control" name="name" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-success">
							Add
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

</body>
</html>

