<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comEntity.AddSpecialist"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Doctor</title>

<%@ include file="../component/Allcss.jsp"%>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />

<style>
html, body {
	height: 100%;
	margin: 0;
	overflow: hidden;
	background: #f4f6f9;
}

/* Space below navbar */
.page-wrapper {
	height: calc(100vh - 70px);
	padding: 15px;
}

/* Card */
.paint-card {
	background: #fff;
	border-radius: 18px;
	box-shadow: 0 15px 40px rgba(0, 0, 0, 0.25);
	height: 100%;
}

/* Image */
.image-card img {
	width: 100%;
	height: 100%;
	object-fit: cover;
	border-radius: 15px;
}

/* Card Body FLEX FIX */
.card-body {
	display: flex;
	flex-direction: column;
	height: 100%;
}

/* Form FLEX */
form {
	flex: 1;
	display: flex;
	flex-direction: column;
}

/* Header */
.form-header {
	text-align: center;
	color: #198754;
	font-weight: 700;
	margin-bottom: 10px;
}

/* Label */
.form-label {
	font-size: 13px;
	font-weight: 600;
	color: #444;
	margin-bottom: 4px;
}

/* Input box */
.input-box {
	display: flex;
	align-items: center;
	border: 1px solid #ddd;
	border-radius: 10px;
	margin-bottom: 8px;
	background: #fff;
}

.input-box i {
	background: #198754;
	color: #fff;
	padding: 11px;
	min-width: 45px;
	text-align: center;
}

.input-box input,
.input-box select {
	border: none;
	outline: none;
	padding: 9px;
	width: 100%;
	font-size: 14px;
}

/* Button FIX */
.submit-btn {
	margin-top: auto;
	background: #198754;
	color: #fff;
	border: none;
	width: 100%;
	padding: 12px;
	border-radius: 30px;
	font-size: 16px;
	font-weight: 600;
	transition: 0.3s;
}

.submit-btn:hover {
	background: #157347;
	transform: scale(1.03);
}
</style>
</head>

<body>

	<%@ include file="navbar.jsp"%>

	<div class="page-wrapper">
		<div class="row g-3 h-100">

			<!-- LEFT IMAGE -->
			<div class="col-md-8 h-100">
				<div class="card paint-card image-card h-100">
					<div class="card-body p-2">
						<img src="../Image/er2.jpg" alt="Doctor Image">
					</div>
				</div>
			</div>

			<!-- RIGHT FORM -->
			<div class="col-md-4 h-100">
				<div class="card paint-card h-100">
					<div class="card-body">

						<h4 class="form-header">
							<i class="fa-solid fa-user-doctor"></i> Add Doctor
						</h4>

						<%
						String msg = (String) request.getAttribute("msg");
						String color = (String) request.getAttribute("color");
						if (msg != null) {
						%>
						<p class="text-center fw-bold" style="color:<%=color%>;"><%=msg%></p>
						<script>
							setTimeout(() => {
								window.location.href = "Admin/Homepage.jsp";
							}, 2000);
						</script>
						<%
						}
						%>

						<form action="../add_doctor" method="post">

							<label class="form-label">Full Name</label>
							<div class="input-box">
								<i class="fa fa-user"></i>
								<input type="text" name="name" required>
							</div>

							<label class="form-label">Date of Birth</label>
							<div class="input-box">
								<i class="fa fa-calendar"></i>
								<input type="date" name="dob" required>
							</div>

							<label class="form-label">Qualification</label>
							<div class="input-box">
								<i class="fa fa-graduation-cap"></i>
								<input type="text" name="edu" required>
							</div>

							<label class="form-label">Specialization</label>
							<div class="input-box">
								<i class="fa fa-stethoscope"></i>
								<select name="pro" required>
									<option>--- Select ---</option>
									<%
									AddSpecialist As = new AddSpecialist();
									ArrayList list = As.getAllSpecialist();
									for (Object s : list) {
									%>
									<option><%=s%></option>
									<%
									}
									%>
								</select>
							</div>

							<label class="form-label">Email</label>
							<div class="input-box">
								<i class="fa fa-envelope"></i>
								<input type="email" name="email" required>
							</div>

							<label class="form-label">Mobile</label>
							<div class="input-box">
								<i class="fa fa-phone"></i>
								<input type="number" name="mobno" required>
							</div>

							<label class="form-label">Password</label>
							<div class="input-box">
								<i class="fa fa-lock"></i>
								<input type="password" name="password" required>
							</div>

							<button class="submit-btn">
								<i class="fa fa-paper-plane"></i> Submit
							</button>

						</form>

					</div>
				</div>
			</div>

		</div>
	</div>

</body>
</html>
