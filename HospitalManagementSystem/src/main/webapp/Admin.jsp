<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>

<%@ include file="component/Allcss.jsp"%>

<!-- Font Awesome for Admin Icon -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">

<style>
/* 🌄 Clear Full Background */
body {
    margin: 0;
    font-family: "Segoe UI", Arial, sans-serif;
    background-image: url("Image/admbg.jpg");
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    background-attachment: fixed;
}

/* 📍 Center wrapper */
.login-wrapper {
    min-height: calc(100vh - 70px);
    display: flex;
    align-items: center;
    justify-content: center;
}

/* 🧊 Glassmorphism Card */
.login-card {
    width: 100%;
    max-width: 520px;
    padding: 32px;
    border-radius: 18px;
    background: rgba(255, 255, 255, 0.18);
    backdrop-filter: blur(14px);
    -webkit-backdrop-filter: blur(14px);
    border: 1px solid rgba(255,255,255,0.25);
    box-shadow: 0 20px 40px rgba(0,0,0,0.35);
    animation: slideFade 1s ease forwards, floating 5s ease-in-out infinite;
}

/* Hover effect */
.login-card:hover {
    transform: translateY(-6px) scale(1.02);
    box-shadow: 0 30px 55px rgba(0,0,0,0.45);
}

/* Animations */
@keyframes slideFade {
    from { opacity: 0; transform: translateY(40px) scale(0.95); }
    to { opacity: 1; transform: translateY(0) scale(1); }
}

@keyframes floating {
    0% { transform: translateY(0); }
    50% { transform: translateY(-6px); }
    100% { transform: translateY(0); }
}

/* 👤 Admin Icon */
.admin-icon {
    width: 90px;
    height: 90px;
    margin: 0 auto 15px;
    border-radius: 50%;
    background: linear-gradient(135deg, #198754, #2ecc71);
    display: flex;
    align-items: center;
    justify-content: center;
    box-shadow: 0 10px 25px rgba(25,135,84,0.6);
    animation: popIn 1.2s ease;
}

.admin-icon i {
    font-size: 40px;
    color: #fff;
}

@keyframes popIn {
    from { opacity: 0; transform: scale(0.6); }
    to { opacity: 1; transform: scale(1); }
}

/* Title */
.login-card h4 {
    text-align: center;
    margin-bottom: 25px;
    font-weight: 700;
    color: #ffffff;
    letter-spacing: 1px;
}

/* Inputs */
.form-control {
    height: 45px;
    border-radius: 12px;
    background: rgba(255,255,255,0.95);
    border: none;
    transition: all 0.3s ease;
}

.form-control:focus {
    box-shadow: 0 0 0 3px rgba(25,135,84,0.4);
    transform: scale(1.02);
}

/* ✅ GREEN Login Button */
.login-btn {
    height: 45px;
    border-radius: 25px;
    font-weight: 600;
    background: linear-gradient(135deg, #198754, #2ecc71);
    border: none;
    color: #fff;
    transition: all 0.3s ease;
}

.login-btn:hover {
    background: linear-gradient(135deg, #2ecc71, #198754);
    transform: translateY(-2px) scale(1.03);
    box-shadow: 0 8px 20px rgba(25,135,84,0.6);
}

/* Message */
.login-msg {
    font-weight: 600;
}
</style>
</head>

<body>

<%@ include file="component/nav.jsp"%>

<div class="login-wrapper">
    <div class="login-card">

        <!-- 👤 Admin Icon -->
        <div class="admin-icon">
            <i class="fa-solid fa-user-shield"></i>
        </div>

        <h4>Admin Login</h4>

        <% 
        String msg = (String) request.getAttribute("message");
        String color = (String) request.getAttribute("messageColor");
        if (msg != null) {
        %>
            <p class="text-center login-msg" style="color:<%=color%>;">
                <%=msg%>
            </p>
            <script>
                setTimeout(() => {
                    window.location.href = "Admin.jsp";
                }, 1200);
            </script>
        <% } %>

        <form action="submit" method="post">

            <div class="mb-3">
                <label class="form-label text-white">Email address</label>
                <input type="email" name="email" class="form-control" required>
            </div>

            <div class="mb-3">
                <label class="form-label text-white">Password</label>
                <input type="password" name="password" class="form-control" required>
            </div>

            <button type="submit" class="btn login-btn w-100 mt-2">
                Login
            </button>

        </form>

    </div>
</div>

</body>
</html>

