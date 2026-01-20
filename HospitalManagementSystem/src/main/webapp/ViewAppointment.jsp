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
<title>Appointment Details</title>

<%@ include file="component/Allcss.jsp"%>

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<!-- AOS Animation -->
<link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">

<style>
.dropdown-toggle{
   min-width:160px;
}
body {
	background-image: url("Image/er7.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: "Segoe UI", sans-serif;
}

/* 🌟 Glass Container */
.table-container {
	margin: 60px auto;
	width: 90%;
	background: rgba(255, 255, 255, 0.25);
	backdrop-filter: blur(15px);
	border-radius: 15px;
	padding: 30px;
	box-shadow: 0 15px 40px rgba(0,0,0,0.4);
	animation: fadeIn 1.2s ease;
}

/* 🔥 Title */
.table-container h2 {
	text-shadow: 2px 2px 8px rgba(0,0,0,0.3);
}

/* 📊 Table */
table {
	width: 100%;
	border-collapse: collapse;
	text-align: center;
}

th {
	background: linear-gradient(45deg, #28a745, #20c997);
	color: white;
	padding: 12px;
}

td {
	padding: 12px;
	font-weight: 500;
}

/* ✨ Hover Row */
tbody tr {
	transition: all 0.3s ease;
}

tbody tr:hover {
	background: rgba(255,255,255,0.35);
	transform: scale(1.01);
}

/* 🟡 Pending Badge Animation */
.pending-btn {
	animation: pulse 1.5s infinite;
}

/* 🎥 Animations */
@keyframes pulse {
	0% { transform: scale(1); }
	50% { transform: scale(1.08); }
	100% { transform: scale(1); }
}

@keyframes fadeIn {
	from { opacity: 0; transform: translateY(40px); }
	to { opacity: 1; transform: translateY(0); }
}
</style>
</head>

<body>
<%@ include file="component/nav.jsp"%>

<div class="table-container" data-aos="zoom-in">
	<h2 class="text-center text-danger fw-bold mb-4">
		<i class="fa-solid fa-calendar-check"></i> Appointment Details
	</h2>

	<table class="table table-bordered align-middle">
		<thead>
			<tr>
				<th><i class="fa-solid fa-hashtag"></i> ID</th>
				<th><i class="fa-solid fa-user"></i> Patient</th>
				<th><i class="fa-solid fa-venus-mars"></i> Gender</th>
				<th><i class="fa-solid fa-hourglass-half"></i> Age</th>
				<th><i class="fa-solid fa-calendar-days"></i> Date</th>
				<th><i class="fa-solid fa-phone"></i> Phone</th>
				<th><i class="fa-solid fa-virus"></i> Disease</th>
				<th><i class="fa-solid fa-user-doctor"></i> Doctor</th>
				<th><i class="fa-solid fa-info-circle"></i> Status</th>
			</tr>
		</thead>

		<tbody>
		<%
			ArrayList<AppointmentDetails> li = new ArrayList<>();
			Appointment d = new Appointment();
			AddDoctor a = new AddDoctor();
			String userid = (String)session.getAttribute("id");
			li = d.getappointmentDetails(userid);

			for (AppointmentDetails ad : li) {
				String s = a.getDoctorById(ad.getDoctorId());
		%>
			<tr data-aos="fade-up">
				<td><%=ad.getId()%></td>
				<td><%=ad.getName()%></td>
				<td><%=ad.getGender()%></td>
				<td><%=ad.getAge()%></td>
				<td><%=ad.getAppointdate()%></td>
				<td><%=ad.getPhone()%></td>
				<td><%=ad.getDiseases()%></td>
				<td><%=s%></td>
				<td>
				<% if ("pending".equals(ad.getStatus())) { %>
					<span class="btn btn-warning btn-sm pending-btn">
						<i class="fa-solid fa-clock"></i> Pending
					</span>
				<% } else { %>
					<span class="badge bg-success">
						<i class="fa-solid fa-circle-check"></i> <%=ad.getStatus()%>
					</span>
				<% } %>
				</td>
			</tr>
		<% } %>
		</tbody>
	</table>
</div>

<!-- AOS Script -->
<script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
<script>
	AOS.init({
		duration: 900,
		once: true
	});
</script>

</body>
</html>
