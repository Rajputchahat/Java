<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="comEntity.Appointment"%>
<%@ page import="comEntity.AppointmentDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Patient Status</title>

<%@ include file="../component/Allcss.jsp"%>

<!-- Font Awesome -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

<style type="text/css">
/* 🌈 Background */
body {
	background-image: url("../Image/cmtbackground.jpg");
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	font-family: "Segoe UI", Arial, sans-serif;
}

/* 🧊 Glass Card */
.glass-card {
	background: rgba(255, 255, 255, 0.85);
	backdrop-filter: blur(10px);
	border-radius: 18px;
	box-shadow: 0 20px 40px rgba(0, 0, 0, 0.35);
	border: none;
	animation: fadeIn 0.7s ease-in-out;
}

/* ✨ Title */
.card-title {
	font-weight: 600;
	letter-spacing: 0.5px;
}

/* ✍ Input Icons */
.input-group-text {
	background-color: #198754;
	color: #fff;
	border: none;
}

/* 🎯 Center Area Below Navbar */
.center-area {
	min-height: calc(100vh - 90px);
	display: flex;
	align-items: center;
	justify-content: center;
}

/* 🎥 Animation */
@keyframes fadeIn {
	from {
		opacity: 0;
		transform: translateY(30px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}
</style>
</head>

<body>

	<%@ include file="navbar.jsp"%>

	<div class="container-fluid center-area">
		<div class="row w-100 justify-content-center">
			<div class="col-md-6 col-lg-5">

				<div class="card glass-card">
					<div class="card-body p-4">

						<p class="text-center fs-4 card-title">
							<i class="fa-solid fa-user-doctor text-success"></i>
							Update Patient Status
						</p>

						<%
						String msg = (String) request.getAttribute("msg");
						String color = (String) request.getAttribute("color");

						if (msg != null) {
						%>
						<p class="text-center fs-5" style="color:<%=color%>;"><%=msg%></p>
						<script type="text/javascript">
							setTimeout(function() {
								window.location.href = "Doctor/Homepage.jsp";
							}, 3000);
						</script>
						<%
						}
						%>

						<%
						String a = request.getParameter("id");
						Appointment obj = new Appointment();
						AppointmentDetails ad = obj.getDetails(a);
						%>

						<form action="../Comment" method="post" class="row g-3">

							<div class="col-md-6">
								<label>Patient Name</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-user"></i>
									</span>
									<input type="text" class="form-control"
										value="<%=ad.getName()%>" readonly>
								</div>
							</div>

							<div class="col-md-6">
								<label>Age</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-calendar"></i>
									</span>
									<input type="text" class="form-control"
										value="<%=ad.getAge()%>" readonly>
								</div>
							</div>

							<div class="col-md-6">
								<label>Mobile</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-phone"></i>
									</span>
									<input type="text" class="form-control"
										value="<%=ad.getPhone()%>" readonly>
								</div>
							</div>

							<div class="col-md-6">
								<label>Disease</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-virus"></i>
									</span>
									<input type="text" class="form-control"
										value="<%=ad.getDiseases()%>" readonly>
								</div>
							</div>

							<div class="col-md-12">
								<label>Doctor Comment</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-comment-medical"></i>
									</span>
									<textarea name="comment" class="form-control" rows="3"
										required></textarea>
								</div>
							</div>

							<input type="hidden" name="a_id" value="<%=ad.getId()%>">
							<input type="hidden" name="d_id" value="<%=ad.getDoctorId()%>">

							<button class="btn btn-success mt-4">
								<i class="fa-solid fa-paper-plane"></i> Submit Comment
							</button>

						</form>

					</div>
				</div>

			</div>
		</div>
	</div>

</body>
</html>
