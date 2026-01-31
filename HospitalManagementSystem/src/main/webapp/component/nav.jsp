
<%
String user = (String) session.getAttribute("username");
%>

<nav class="navbar navbar-expand-lg navbar-dark bg-success">
	<div class="container-fluid">
		<a class="navbar-brand" href="Index.jsp"><i
			class="fa-solid fa-house-medical"></i>MEDI HOME</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">

				<%
				if (user == null) {
				%>

				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="Admin.jsp"><i
						class="fa-solid fa-right-to-bracket"></i> ADMIN</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="Doctorlogin.jsp">DOCTOR</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="UserAppointment.jsp">APPOINTMENT</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="Userlogin.jsp">USER</a></li>

				<%
				} else {
				%>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="UserAppointment.jsp">APPOINTMENT</a></li>
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="ViewAppointment.jsp">VIEW APPOINTMENT</a></li>

				<div class="dropdown">
					<button class="btn btn-primary dropdown-toggle" type="button"
						id="dropdownMenuButton1" data-bs-toggle="dropdown"
						aria-expanded="false"><i class="fa-solid fa-circle-user">&nbsp&nbsp</i><%=user%></button>
					<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
						<li><a class="dropdown-item" href="Userlogout">Logout</a></li>
                        <li><a class="dropdown-item" href="ChangeUserPassword.jsp">Change Password</a></li>
					</ul>
				</div>
				<%
				}
				%>
			</ul>
		</div>
	</div>
</nav>