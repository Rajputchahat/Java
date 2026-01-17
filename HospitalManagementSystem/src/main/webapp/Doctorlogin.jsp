<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor Login</title>

<%@ include file="component/Allcss.jsp" %>

<style type="text/css">
body {
    margin: 0;
    font-family: "Segoe UI", Arial, sans-serif;
    background-image: url("Image/er3.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    background-attachment: fixed;
}

/* 🔽 Wrapper below navbar */
.login-wrapper {
    min-height: calc(100vh - 70px); /* navbar height approx */
    display: flex;
    align-items: center;
    justify-content: center;
}

/* 🌈 Glass Card */
.glass-card {
    background: rgba(255, 255, 255, 0.18);
    backdrop-filter: blur(14px);
    -webkit-backdrop-filter: blur(14px);
    border-radius: 18px;
    border: 1px solid rgba(255, 255, 255, 0.25);
    box-shadow: 0 20px 40px rgba(0, 0, 0, 0.35);
    animation: slideFade 0.9s ease forwards;
    opacity: 0;
}

/* 🔥 Hover effect */
.glass-card:hover {
    transform: translateY(-6px) scale(1.02);
    box-shadow: 0 30px 55px rgba(0,0,0,0.45);
}

/* 🎯 Title */
.login-title {
    font-weight: 700;
    color: #fff;
    letter-spacing: 1px;
}

/* 🧾 Input fields */
.form-control {
    border-radius: 12px;
    padding: 10px 14px;
    background: rgba(255,255,255,0.9);
    border: none;
}

/* 🎨 Button */
.login-btn {
    border-radius: 25px;
    padding: 10px;
    font-weight: 600;
    background: linear-gradient(135deg, #00c853, #64dd17);
    border: none;
    transition: all 0.3s ease;
}

.login-btn:hover {
    background: linear-gradient(135deg, #64dd17, #00c853);
    transform: scale(1.05);
}

/* ✨ Message */
.login-msg {
    font-weight: 600;
}

/* 🩺 Icon */
.doctor-icon {
    font-size: 45px;
    color: #00e676;
    animation: pulse 1.8s infinite;
}

/* 🎬 Entrance Animation */
@keyframes slideFade {
    from {
        opacity: 0;
        transform: translateY(40px) scale(0.95);
    }
    to {
        opacity: 1;
        transform: translateY(0) scale(1);
    }
}

/* 💓 Icon pulse */
@keyframes pulse {
    0% { transform: scale(1); }
    50% { transform: scale(1.15); }
    100% { transform: scale(1); }
}
</style>
</head>

<body>

<%@ include file="component/nav.jsp" %>

<div class="login-wrapper">
    <div class="col-md-4">
        <div class="card glass-card">
            <div class="card-body text-center p-4">

                <!-- Icon -->
                <div class="doctor-icon mb-2">
                    <i class="fa-solid fa-user-doctor"></i>
                </div>

                <p class="fs-4 login-title mb-3">Doctor Login</p>

                <% 
                String msg = (String) request.getAttribute("message");
                String color = (String) request.getAttribute("messageColor");
                if (msg != null) { 
                %>
                    <p class="login-msg" style="color:<%=color%>;"><%=msg%></p>
                    <script>
                        setTimeout(() => {
                            window.location.href = "Doctorlogin.jsp";
                        }, 1500);
                    </script>
                <% } %>

                <form action="DoctorLogin" method="post">
                    <div class="mb-3 text-start">
                        <label class="form-label text-white">Email Address</label>
                        <input type="email" class="form-control" name="email" required>
                    </div>

                    <div class="mb-3 text-start">
                        <label class="form-label text-white">Password</label>
                        <input type="password" class="form-control" name="password" required>
                    </div>

                    <button type="submit" class="btn login-btn w-100 mt-2">
                        Login
                    </button>
                </form>

            </div>
        </div>
    </div>
</div>

</body>
</html>


