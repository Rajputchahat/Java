<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comEntity.DoctorDetails"%>
<%@ page import="comEntity.AddDoctor"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Appointment</title>

<%@ include file="component/Allcss.jsp"%>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style>
html, body {
	height: 100%;
	margin: 0;
	overflow: hidden;
}

/* area below navbar */
.main-wrapper {
	height: calc(100vh - 75px);
	margin-top: 12px;
	display: flex;
	align-items: stretch;
	overflow: hidden;
}

/* cards */
.paint-card {
	border-radius: 16px;
	box-shadow: 0 10px 30px rgba(0,0,0,0.25);
	animation: fadeUp 0.6s ease;
}

/* image */
.image-card img {
	width: 100%;
	height: 100%;
	object-fit: cover;
	border-radius: 16px;
}

/* form card */
.form-card {
	display: flex;
	flex-direction: column;
}

/* form body */
.form-body {
	flex: 1;
	padding: 12px 18px;
	display: flex;
	flex-direction: column;
}

/* heading */
.form-body h5 {
	margin-bottom: 6px;
	font-weight: 600;
}

/* form layout */
.form-body form {
	flex: 1;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

/* inputs */
.form-label {
	margin-bottom: 3px;
	font-size: 14px;
}

.form-control {
	padding: 7px 10px;
	font-size: 14px;
}

.form-label i {
	color: #198754;
	margin-right: 6px;
}

/* motivational quote */
.appointment-quote {
	font-size: 14px;
	font-style: italic;
	color: #2e7d32;
	text-align: center;
	margin: 10px 0 6px 0;
}

/* button */
.btn-success {
	padding: 11px;
	border-radius: 25px;
	font-size: 16px;
}

/* animation */
@keyframes fadeUp {
	from { opacity: 0; transform: translateY(20px); }
	to { opacity: 1; transform: translateY(0); }
}
</style>
</head>

<body>

<%@ include file="component/nav.jsp"%>

<div class="container-fluid main-wrapper px-3">
	<div class="row w-100 h-100 g-3">

		<!-- LEFT IMAGE CARD -->
		<div class="col-md-6 d-flex">
			<div class="card paint-card image-card w-100">
				<img src="Image/apt.jpg" alt="Appointment">
			</div>
		</div>

		<!-- RIGHT FORM CARD -->
		<div class="col-md-6 d-flex">
			<div class="card paint-card bg-light w-100 form-card">

				<div class="form-body">

					<h5 class="text-center">
						<i class="fa fa-calendar-check"></i> Book Appointment
					</h5>

					<form action="appoint" method="post">
						<% String id = (String) session.getAttribute("id"); %>
						<input type="hidden" name="userid" value="<%=id%>">

						<div class="row g-2">

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-user"></i>Name</label>
								<input type="text" name="name" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-venus-mars"></i>Gender</label>
								<select name="gender" class="form-control" required>
									<option>---</option>
									<option>Male</option>
									<option>Female</option>
									<option>Others</option>
								</select>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-hashtag"></i>Age</label>
								<input type="number" name="age" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-calendar"></i>Date</label>
								<input type="date" name="appointdate" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-envelope"></i>Email</label>
								<input type="email" name="email" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-phone"></i>Phone</label>
								<input type="number" name="phoneno" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-notes-medical"></i>Disease</label>
								<input type="text" name="diseases" class="form-control" required>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-user-doctor"></i>Doctor</label>
								<select name="doctorid" class="form-control" required>
									<option>---</option>
									<%
									ArrayList<DoctorDetails> list = new AddDoctor().getDoctorDetails();
									for (DoctorDetails d : list) {
									%>
									<option value="<%=d.getId()%>">
										<%=d.getName()%> (<%=d.getSpc()%>)
									</option>
									<% } %>
								</select>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-stethoscope"></i>Appointment Type</label>
								<select name="apptype" class="form-control" required>
									<option>---</option>
									<option>Initial Consultation</option>
									<option>Follow-up Visit</option>
								</select>
							</div>

							<div class="col-md-6">
								<label class="form-label"><i class="fa fa-clock"></i>Preferred Time</label>
								<select name="prefertime" class="form-control" required>
									<option>---</option>
									<option>Morning</option>
									<option>Afternoon</option>
									<option>Evening</option>
								</select>
							</div>

							<div class="col-md-12">
								<label class="form-label"><i class="fa fa-location-dot"></i>Address</label>
								<textarea name="address" rows="2" class="form-control" required></textarea>
							</div>

						</div>

						<!-- MOTIVATIONAL QUOTE -->
						<div class="appointment-quote">
							“Your health is our priority — book today for a healthier tomorrow.”
						</div>

						<div class="mt-1">
							<button type="submit" class="btn btn-success w-100">
								<i class="fa fa-paper-plane"></i> Submit Appointment
							</button>
						</div>

					</form>

				</div>
			</div>
		</div>

	</div>
</div>

</body>
</html>
