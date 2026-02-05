<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comEntity.AppointmentDetails"%>
<%@ page import="comEntity.Appointment"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Details</title>

<%@ include file="../component/Allcss.jsp"%>

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

<style>

/* 🌈 Glass Card */
.glass-card {
	background: rgba(255, 255, 255, 0.25);
	backdrop-filter: blur(12px);
	border-radius: 18px;
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.35);
	animation: fadeSlide 1s ease;
}

/* 🎬 Animation */
@keyframes fadeSlide {
	from {
		opacity: 0;
		transform: translateY(30px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

/* 🧾 Table Header */
.table thead {
	background: linear-gradient(135deg, #0d6efd, #0b5ed7);
	color: white;
}

/* 🖱 Row Hover Effect */
.table tbody tr {
	transition: all 0.3s ease;
}
.table tbody tr:hover {
	background-color: rgba(13, 110, 253, 0.1);
	transform: scale(1.01);
}

/* 🟢 Status Badges */
.badge-pending {
	background: #ffc107;
	color: black;
	padding: 6px 12px;
	border-radius: 12px;
	font-weight: 600;
}
.badge-done {
	background: #198754;
	color: white;
	padding: 6px 12px;
	border-radius: 12px;
	font-weight: 600;
}

/* 🔘 Action Button Animation */
.action-btn {
	transition: all 0.3s ease;
}
.action-btn:hover {
	transform: translateY(-3px);
	box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
}
</style>
</head>

<body>

	<%@ include file="navbar.jsp"%>

	<div class="container-fluid p-4">
		<div class="row">
			<div class="col-md-12">
				<div class="card glass-card">
					<div class="card-body">

						<h3 class="text-center text-primary mb-4">
							<i class="fa-solid fa-bed-pulse"></i> Patient Details
						</h3>

						<div class="table-responsive">
							<table
								class="table table-bordered table-hover align-middle text-center">

								<thead>
									<tr>
										<th>#</th>
										<th><i class="fa-solid fa-user"></i> Name</th>
										<th><i class="fa-solid fa-venus-mars"></i> Gender</th>
										<th><i class="fa-solid fa-calendar"></i> Age</th>
										<th><i class="fa-solid fa-calendar-check"></i> Date</th>
										<th><i class="fa-solid fa-envelope"></i> Email</th>
										<th><i class="fa-solid fa-phone"></i> Mobile</th>
										<th><i class="fa-solid fa-virus"></i> Disease</th>
										<th><i class="fa-solid fa-info-circle"></i> Status</th>
										<th><i class="fa-solid fa-gears"></i> Action</th>
									</tr>
								</thead>

								<tbody>
									<%
									String id = (String) session.getAttribute("doctorid");
									ArrayList<AppointmentDetails> li = new ArrayList<>();
									Appointment d = new Appointment();
									li = d.appointmentDetails(id);
									int i = 1;

									for (AppointmentDetails ad : li) {
									%>

									<tr>
										<td><%=i%></td>
										<td><%=ad.getName()%></td>
										<td><%=ad.getGender()%></td>
										<td><%=ad.getAge()%></td>
										<td><%=ad.getAppointdate()%></td>
										<td><%=ad.getEmail()%></td>
										<td><%=ad.getPhone()%></td>
										<td><%=ad.getDiseases()%></td>

										<td>
											<%
											if ("pending".equals(ad.getStatus())) {
											%>
											<span class="badge-pending">Pending</span>
											<%
											} else {
											%>
											<span class="badge-done">Completed</span>
											<%
											}
											%>
										</td>

										<td>
											<%
											if ("pending".equals(ad.getStatus())) {
											%>
											<a href="Comment.jsp?id=<%=ad.getId()%>"
												class="btn btn-danger btn-sm action-btn">
												<i class="fa-solid fa-comment-dots"></i> Comment
											</a>
											<%
											} else {
											%>
											<button class="btn btn-success btn-sm" disabled>
												<i class="fa-solid fa-check"></i> Done
											</button>
											<%
											}
											%>
										</td>
									</tr>

									<%
									i++;
									}
									%>
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
