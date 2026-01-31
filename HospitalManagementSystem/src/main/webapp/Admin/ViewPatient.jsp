<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comEntity.AppointmentDetails"%>
<%@ page import="comEntity.Appointment"%>
<%@ page import="comEntity.AddDoctor"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Details</title>

<%@ include file="../component/Allcss.jsp"%>

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style type="text/css">

/* 🌈 Background */
body {
	background-image: url("bg3.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: "Segoe UI", Arial, sans-serif;
}

/* 💎 Glass Card */
.paint-card {
	background: rgba(255, 255, 255, 0.85);
	backdrop-filter: blur(10px);
	border-radius: 16px;
	box-shadow: 0 15px 40px rgba(0,0,0,0.3);
	animation: fadeSlide 0.9s ease;
}

/* 🎬 Animation */
@keyframes fadeSlide {
	from {
		opacity: 0;
		transform: translateY(40px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

/* 📊 Table Style */
.table {
	border-radius: 12px;
	overflow: hidden;
}

.table thead {
	background: linear-gradient(45deg, #0dcaf0, #0a58ca);
	color: white;
}

.table thead th {
	vertical-align: middle;
	font-weight: 600;
}

.table tbody tr {
	transition: all 0.3s ease;
}

.table tbody tr:hover {
	background-color: rgba(13, 202, 240, 0.15);
	transform: scale(1.01);
}

/* 🟢 Status Badges */
.badge-status {
	padding: 6px 12px;
	border-radius: 20px;
	font-size: 14px;
	font-weight: 600;
}

.badge-pending {
	background-color: #dc3545;
	color: white;
}

.badge-done {
	background-color: #28a745;
	color: white;
}

/* 📌 Icons spacing */
td i {
	margin-right: 6px;
	color: #0a58ca;
}

</style>
</head>

<body>

<%@ include file="navbar.jsp"%>

<div class="container-fluid p-4">
	<div class="row">
		<div class="col-md-12">
			<div class="card paint-card">
				<div class="card-body">

					<h3 class="text-center mb-4">
						<i class="fa-solid fa-hospital-user"></i> Patient Details
					</h3>

					<div class="table-responsive">
						<table class="table table-bordered table-hover align-middle text-center">
							<thead>
								<tr>
									<th><i class="fa fa-user"></i> Name</th>
									<th><i class="fa fa-venus-mars"></i> Gender</th>
									<th><i class="fa fa-calendar"></i> Age</th>
									<th><i class="fa fa-clock"></i> Date</th>
									<th><i class="fa fa-envelope"></i> Email</th>
									<th><i class="fa fa-phone"></i> Mobile</th>
									<th><i class="fa fa-virus"></i> Disease</th>
									<th><i class="fa fa-user-doctor"></i> Doctor</th>
									<th><i class="fa fa-location-dot"></i> Address</th>
									<th><i class="fa fa-info-circle"></i> Status</th>
								</tr>
							</thead>

							<tbody>
							<%
								ArrayList<AppointmentDetails> li = new ArrayList<>();
								Appointment d = new Appointment();
								AddDoctor a = new AddDoctor();
								li = d.getAllAppointment();

								for (AppointmentDetails ad : li) {
									String docName = a.getDoctorById(ad.getDoctorId());
							%>
								<tr>
									<td><%=ad.getName()%></td>
									<td><%=ad.getGender()%></td>
									<td><%=ad.getAge()%></td>
									<td><%=ad.getAppointdate()%></td>
									<td><%=ad.getEmail()%></td>
									<td><%=ad.getPhone()%></td>
									<td><%=ad.getDiseases()%></td>
									<td><%=docName%></td>
									<td><%=ad.getAddress()%></td>
									<td>
										<span class="badge-status 
										<%="pending".equalsIgnoreCase(ad.getStatus()) 
											? "badge-pending" 
											: "badge-done"%>">
											<%=ad.getStatus()%>
										</span>
									</td>
								</tr>
							<% } %>
							</tbody>

						</table>
					</div>

				</div>
			</div>
		</div>
	</div>
</div>

</body>
</html>
