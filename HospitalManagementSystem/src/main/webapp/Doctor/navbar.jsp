
<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">
		<a class="navbar-brand" href=""><i
			class="fa-solid fa-house-medical"></i>MEDI HOME</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">

				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="Homepage.jsp">Home</a></li>

				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="PatientDetails.jsp">Patient</a></li>
			</ul>

			<%
			String doctor = (String) session.getAttribute("doctorname");
			%>

			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						id="dropdownMenuButton1" data-bs-toggle="dropdown"
						aria-expanded="false">
						<i class="fa-solid fa-user-tie">&nbsp&nbsp</i><%=doctor%>
					</button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
						<li><a class="dropdown-item" href="../doctor">Logout</a></li>
						<li><a class="dropdown-item" href="ChangeDoctorPassword.jsp">Change Password</a></li>
					</ul>	
				</div>

			</ul>
		</div>
	</div>
</nav>