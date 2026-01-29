<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>

<%@ include file="component/Allcss.jsp" %>

<!-- Font Awesome -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style>

/* 🌄 Background */
body {
    margin: 0;
    font-family: "Segoe UI", Arial, sans-serif;
    background: url("Image/er6.jpg") center/cover fixed no-repeat;
}

/* 📌 Center below navbar */
.signup-wrapper {
    min-height: calc(100vh - 80px);
    display: flex;
    align-items: center;
    justify-content: center;
}

/* ✨ Animated Glass Card */
.glass-card {
    position: relative;
    background: rgba(0, 0, 0, 0.6);
    backdrop-filter: blur(16px);
    border-radius: 22px;
    padding: 35px;
    color: #fff;
    box-shadow: 0 30px 60px rgba(0,0,0,0.6);
    animation: floatCard 4s ease-in-out infinite;
    overflow: hidden;
}

/* 🌈 Gradient Glow Border */
.glass-card::before {
    content: "";
    position: absolute;
    inset: 0;
    border-radius: 22px;
    padding: 2px;
    background: linear-gradient(135deg, #00e676, #00bcd4, #7c4dff);
    -webkit-mask:
        linear-gradient(#000 0 0) content-box,
        linear-gradient(#000 0 0);
    -webkit-mask-composite: xor;
    mask-composite: exclude;
    animation: glowMove 6s linear infinite;
}

/* 🎬 Floating animation */
@keyframes floatCard {
    0%,100% { transform: translateY(0); }
    50% { transform: translateY(-10px); }
}

/* 🌈 Glow animation */
@keyframes glowMove {
    0% { filter: hue-rotate(0deg); }
    100% { filter: hue-rotate(360deg); }
}

/* 🧾 Title */
.signup-title {
    font-weight: 700;
    letter-spacing: 1px;
    margin-bottom: 25px;
}

/* 🔄 Header icon animation */
.signup-title i {
    animation: pulseIcon 1.5s infinite;
    margin-right: 8px;
}

@keyframes pulseIcon {
    0% { transform: scale(1); opacity: 1; }
    50% { transform: scale(1.15); opacity: 0.7; }
    100% { transform: scale(1); opacity: 1; }
}

/* 🖊 Input group */
.input-group {
    transition: transform 0.3s ease;
}

.input-group:focus-within {
    transform: scale(1.02);
}

.input-group-text {
    background: rgba(0,0,0,0.15);
    border: none;
    color: #00e676;
    font-size: 18px;
}

.form-control {
    background: rgba(255,255,255,0.12);
    border: none;
    color: #fff;
}

.form-control::placeholder {
    color: #ddd;
}

.form-control:focus {
    background: rgba(255,255,255,0.25);
    box-shadow: 0 0 12px rgba(0, 230, 118, 0.6);
    color: #fff;
}

/* 🚀 Button */
.btn-register {
    background: linear-gradient(135deg, #00e676, #00c853);
    border: none;
    font-weight: 600;
    letter-spacing: 1px;
    padding: 12px;
    position: relative;
    overflow: hidden;
}

.btn-register:hover {
    transform: translateY(-3px);
    box-shadow: 0 12px 30px rgba(0, 230, 118, 0.7);
}

/* 💫 Button ripple */
.btn-register::after {
    content: "";
    position: absolute;
    inset: 0;
    background: rgba(255,255,255,0.2);
    opacity: 0;
    transition: opacity 0.3s;
}

.btn-register:active::after {
    opacity: 1;
}

/* 🧠 Message */
.msg {
    font-weight: bold;
    font-size: 18px;
    margin-bottom: 15px;
}

</style>
</head>

<body>

<%@ include file="component/nav.jsp" %>

<div class="signup-wrapper">
    <div class="col-md-4">

        <div class="glass-card">

            <h4 class="text-center signup-title">
                <i class="fa-solid fa-user-astronaut"></i> Create Account
            </h4>

            <%
            String msg = (String) request.getAttribute("message");
            String color = (String) request.getAttribute("messageColor");
            if (msg != null) {
            %>
                <p class="text-center msg" style="color:<%=color%>;"><%=msg%></p>
                <script>
                    setTimeout(() => {
                        window.location.href = "Userlogin.jsp";
                    }, 2000);
                </script>
            <%
            }
            %>

            <form action="go" method="post">

                <div class="mb-3 input-group">
                    <span class="input-group-text">
                        <i class="fa-solid fa-user"></i>
                    </span>
                    <input type="text" name="fullname" class="form-control"
                           placeholder="Full Name" required>
                </div>

                <div class="mb-3 input-group">
                    <span class="input-group-text">
                        <i class="fa-solid fa-envelope"></i>
                    </span>
                    <input type="email" name="email" class="form-control"
                           placeholder="Email Address" required>
                </div>

                <div class="mb-3 input-group">
                    <span class="input-group-text">
                        <i class="fa-solid fa-lock"></i>
                    </span>
                    <input type="password" name="password" class="form-control"
                           placeholder="Password" required>
                </div>

                <button type="submit"
                        class="btn btn-register text-white col-md-12">
                    <i class="fa-solid fa-user-check"></i> Register
                </button>

            </form>

        </div>
    </div>
</div>

</body>
</html>