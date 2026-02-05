<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>

<%@ include file="../component/Allcss.jsp"%>

<!-- Font Awesome -->
<link rel="stylesheet" 
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style type="text/css">

/* Center area below navbar */
.page-wrapper {
    min-height: calc(100vh - 70px); /* navbar height approx */
    display: flex;
    align-items: center;
    justify-content: center;
}

/* Card style */
.paint-card {
    width: 100%;
    max-width: 420px;
    border-radius: 15px;
    box-shadow: 0 20px 40px rgba(0, 0, 0, 0.35);
    background: rgba(255, 255, 255, 0.95);
}

/* Heading */
.card-title {
    font-weight: 600;
    color: #333;
}

/* Input icons */
.input-group-text {
    background-color: #198754;
    color: #fff;
}

/* Button */
.btn-custom {
    font-size: 18px;
    padding: 10px;
    border-radius: 8px;
}
</style>
</head>

<body>

<%@ include file="navbar.jsp"%>

<div class="page-wrapper">
    <div class="paint-card card">
        <div class="card-body p-4">

            <p class="text-center fs-3 card-title">
                <i class="fa-solid fa-key me-2"></i>Change Password
            </p>

            <%
            String msg = (String) request.getAttribute("message");
            String color = (String) request.getAttribute("Color");
            if (msg != null) {
            %>
                <p class="text-center fs-5 fw-bold" style="color:<%=color%>;">
                    <i class="fa-solid fa-circle-info me-1"></i><%=msg%>
                </p>

                <script type="text/javascript">
                    setTimeout(function () {
                        window.location.href = "Doctor/ChangeDoctorPassword.jsp";
                    }, 2500);
                </script>
            <%
            }
            %>

            <form action="../CDP" method="post">
                <% String id = (String)session.getAttribute("doctorid"); %>

                <!-- Old Password -->
                <div class="mb-3">
                    <label class="form-label">Old Password</label>
                    <div class="input-group">
                        <span class="input-group-text">
                            <i class="fa-solid fa-lock"></i>
                        </span>
                        <input type="password" name="oldpass" class="form-control" required>
                    </div>
                </div>

                <!-- New Password -->
                <div class="mb-4">
                    <label class="form-label">New Password</label>
                    <div class="input-group">
                        <span class="input-group-text">
                            <i class="fa-solid fa-lock-open"></i>
                        </span>
                        <input type="password" name="newpass" class="form-control" required>
                    </div>
                </div>

                <input type="hidden" value="<%=id%>" name="d_id">

                <button class="btn btn-success btn-custom w-100">
                    <i class="fa-solid fa-check me-1"></i>Update Password
                </button>
            </form>

        </div>
    </div>
</div>

</body>
</html>
