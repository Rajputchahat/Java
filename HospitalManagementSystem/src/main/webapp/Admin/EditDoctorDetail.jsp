<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="comEntity.AddSpecialist"%>
<%@ page import="comEntity.UpdateDoctorDetail"%>
<%@ page import="comEntity.DoctorDetails"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Doctor</title>
<%@ include file="../component/Allcss.jsp"%>

<style>
/* ❌ No scroll */
html, body {
	height: 100%;
	margin: 0;
	overflow: hidden;
}

/* Shadow */
.paint-card {
	box-shadow: 0 0 10px rgba(0,0,0,0.3);
	height: 100%;
}

/* Screen fit */
.main-container {
	height: calc(100vh - 70px); /* navbar height */
}

/* Image fit */
.image-box img {
	width: 100%;
	height: 100%;
	object-fit: cover;
}

/* 🔥 Form full card height */
.form-card {
	height: 100%;
}

.form-card .card-body {
	height: 100%;
	display: flex;
	flex-direction: column;
}

.form-card form {
	flex: 1;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}

/* Input compact */
.form-control {
	padding: 6px 10px;
	font-size: 14px;
}
</style>
</head>

<body>

<%@ include file="navbar.jsp"%>

<div class="container-fluid main-container p-3">
	<div class="row h-100">

		<!-- LEFT IMAGE CARD -->
		<div class="col-md-8 h-100">
			<div class="card paint-card image-box">
				<img src="../Image/er11.png" alt="Doctor Image">
			</div>
		</div>

		<!-- RIGHT FORM CARD -->
		<div class="col-md-4 h-100">
			<div class="card paint-card bg-light form-card">
				<div class="card-body">

					<p class="fs-3 text-center mb-2">Edit Doctor Details</p>

					<%
					String msg = (String) request.getAttribute("msg");
					String color = (String) request.getAttribute("color");
					if (msg != null) {
					%>
					<p class="text-center fw-bold" style="color:<%=color%>;"><%=msg%></p>
					<script>
						setTimeout(function() {
							window.location.href = "Admin/ViewDoctor.jsp";
						}, 3000);
					</script>
					<% } %>

					<%
					int a = Integer.parseInt(request.getParameter("id"));
					UpdateDoctorDetail ed = new UpdateDoctorDetail();
					DoctorDetails dd = ed.getDoctorById(a);
					%>

					<form action="../update_doctor" method="post">

						<div>
							<label class="form-label">Full Name</label>
							<input type="text" class="form-control" name="name"
								value="<%=dd.getName()%>" required>
						</div>

						<div>
							<label class="form-label">DOB</label>
							<input type="date" class="form-control" name="dob"
								value="<%=dd.getDob()%>" required>
						</div>

						<div>
							<label class="form-label">Qualification</label>
							<input type="text" class="form-control" name="edu"
								value="<%=dd.getQli()%>" required>
						</div>

						<div>
							<label class="form-label">Specialization</label>
							<select name="pro" class="form-control" required>
								<option><%=dd.getSpc()%></option>
								<%
								AddSpecialist As = new AddSpecialist();
								ArrayList list = As.getAllSpecialist();
								for (Object s : list) {
								%>
								<option><%=s%></option>
								<% } %>
							</select>
						</div>

						<div>
							<label class="form-label">Email</label>
							<input type="email" class="form-control" name="email"
								value="<%=dd.getEmail()%>" required>
						</div>

						<div>
							<label class="form-label">Mobile No.</label>
							<input type="number" class="form-control" name="mobno"
								value="<%=dd.getMobile()%>" required>
						</div>

						<div>
							<label class="form-label">Password</label>
							<input type="text" class="form-control" name="password"
								value="<%=dd.getPass()%>" required>
						</div>

						<input type="hidden" name="id" value="<%=dd.getId()%>">

						<button type="submit" class="btn btn-success w-100">
							Update
						</button>

					</form>

				</div>
			</div>
		</div>

	</div>
</div>

</body>
</html>
