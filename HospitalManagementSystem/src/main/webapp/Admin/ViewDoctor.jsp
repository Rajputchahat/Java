<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="comEntity.DoctorDetails"%>
<%@ page import="comEntity.AddDoctor"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Details</title>

<%@ include file="../component/Allcss.jsp"%>

<style>
body {
	background: #f4f6f9;
}

/* Card */
.paint-card {
	background: #ffffff;
	border-radius: 12px;
	box-shadow: 0 8px 20px rgba(0, 0, 0, 0.15);
}

/* Title */
.page-title {
	color: #0d6efd;
	font-weight: 700;
}

/* Table */
.table thead {
	background-color: #0d6efd;
	color: white;
}

.table-hover tbody tr:hover {
	background-color: rgba(13, 110, 253, 0.07);
}

/* Buttons */
.btn-success {
	background-color: #28a745;
	border: none;
}

.btn-danger {
	background-color: #dc3545;
	border: none;
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

						<h3 class="text-center page-title mb-4">
							<i class="fa-solid fa-user-doctor me-2"></i>
							Doctor Details
						</h3>

						<%
						String msg = (String) request.getAttribute("msg");
						String color = (String) request.getAttribute("color");
						if (msg != null) {
						%>
						<p class="text-center fw-bold" style="color:<%=color%>;">
							<i class="fa-solid fa-circle-info me-1"></i>
							<%=msg%>
						</p>
						<%
						}
						%>

						<table class="table table-hover align-middle text-center">
							<thead>
								<tr>
									<th><i class="fa-solid fa-hashtag"></i></th>
									<th><i class="fa-solid fa-user"></i> Name</th>
									<th><i class="fa-solid fa-cake-candles"></i> DOB</th>
									<th><i class="fa-solid fa-graduation-cap"></i> Qualification</th>
									<th><i class="fa-solid fa-stethoscope"></i> Specialization</th>
									<th><i class="fa-solid fa-envelope"></i> Email</th>
									<th><i class="fa-solid fa-phone"></i> Mobile</th>
									<th><i class="fa-solid fa-gear"></i> Action</th>
								</tr>
							</thead>

							<tbody>
								<%
								AddDoctor d = new AddDoctor();
								ArrayList<DoctorDetails> li = d.getDoctorDetails();

								for (DoctorDetails dd : li) {
								%>
								<tr>
									<td><%=dd.getId()%></td>
									<td><%=dd.getName()%></td>
									<td><%=dd.getDob()%></td>
									<td><%=dd.getQli()%></td>
									<td>
										<span class="badge bg-info text-dark">
											<i class="fa-solid fa-user-doctor"></i>
											<%=dd.getSpc()%>
										</span>
									</td>
									<td><%=dd.getEmail()%></td>
									<td><%=dd.getMobile()%></td>
									<td>
										<a href="EditDoctorDetail.jsp?id=<%=dd.getId()%>"
											class="btn btn-sm btn-success me-1"
											title="Edit Doctor">
											<i class="fa-solid fa-pen"></i>
										</a>

										<a href="../delete_doctor?id=<%=dd.getId()%>"
											class="btn btn-sm btn-danger"
											title="Delete Doctor"
											onclick="return confirm('Are you sure?');">
											<i class="fa-solid fa-trash"></i>
										</a>
									</td>
								</tr>
								<%
								}
								%>
							</tbody>
						</table>

					</div>
				</div>

			</div>
		</div>
	</div>

</body>
</html>
