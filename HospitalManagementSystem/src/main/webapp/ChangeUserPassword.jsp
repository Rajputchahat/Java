<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>

<%@ include file="component/Allcss.jsp"%>

<!-- Font Awesome for icons -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style type="text/css">
body {
	background: linear-gradient(135deg, #e3f2fd, #f1f8ff);
	min-height: 100vh;
}

/* Card Design */
.paint-card {
	box-shadow: 0 15px 35px rgba(0, 0, 0, 0.25);
	border-radius: 15px;
	border: none;
	animation: fadeUp 0.8s ease;
}
.dropdown-toggle{
   min-width:160px;
}

/* Animation */
@keyframes fadeUp {
	from {
		opacity: 0;
		transform: translateY(30px);
	}
	to {
		opacity: 1;
		transform: translateY(0);
	}
}

/* Heading */
.card-title {
	font-weight: 600;
	color: #2e7d32;
}

/* Input group */
.input-group-text {
	background: #2e7d32;
	color: white;
	border: none;
}

/* Button */
.btn-success {
	border-radius: 25px;
	font-size: 18px;
	font-weight: 500;
	transition: all 0.3s ease;
}

.btn-success:hover {
	background: #1b5e20;
	transform: scale(1.03);
}

/* Center below navbar */
.main-container {
	margin-top: 180px;
}
</style>
</head>

<body>

	<%@ include file="component/nav.jsp"%>

	<div class="container main-container">
		<div class="row justify-content-center">
			<div class="col-md-4">
				<div class="card paint-card">
					<div class="card-body p-4">

						<p class="text-center fs-3 card-title">
							<i class="fa-solid fa-lock"></i> Change Password
						</p>

						<%
						String msg = (String) request.getAttribute("message");
						String color = (String) request.getAttribute("Color");

						if (msg != null) {
						%>
						<p class="text-center fs-5" style="color:<%=color%>;">
							<i class="fa-solid fa-circle-info"></i> <%=msg%>
						</p>
						<script>
							setTimeout(function() {
								window.location.href = "ChangeUserPassword.jsp";
							}, 2500);
						</script>
						<%
						}
						%>

						<form action="CUP" method="post">
							<% String id = (String) session.getAttribute("id"); %>

							<!-- Old Password -->
							<div class="mb-3">
								<label class="form-label fw-semibold">Old Password</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-key"></i>
									</span>
									<input type="password" name="oldpass"
										class="form-control" placeholder="Enter old password" required>
								</div>
							</div>

							<!-- New Password -->
							<div class="mb-4">
								<label class="form-label fw-semibold">New Password</label>
								<div class="input-group">
									<span class="input-group-text">
										<i class="fa-solid fa-lock"></i>
									</span>
									<input type="password" name="newpass"
										class="form-control" placeholder="Enter new password" required>
								</div>
							</div>

							<input type="hidden" value="<%=id%>" name="u_id">

							<button class="btn btn-success w-100">
								<i class="fa-solid fa-floppy-disk"></i> Update Password
							</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>

