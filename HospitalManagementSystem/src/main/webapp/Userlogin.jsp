<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>

<%@ include file="component/Allcss.jsp" %>

<!-- Font Awesome Icons -->
<link rel="stylesheet"
 href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

<style>
/* 🌌 Background */
body {
    margin: 0;
    font-family: "Segoe UI", Arial, sans-serif;
    background: url("Image/er5.jpg") center/cover fixed no-repeat;
}

/* 📍 Center below navbar */
.login-wrapper {
    min-height: calc(100vh - 70px);
    display: flex;
    justify-content: center;
    align-items: center;
}

/* 💎 Glass Card */
.glass-card {
    background: rgba(255, 255, 255, 0.2);
    backdrop-filter: blur(18px);
    border-radius: 20px;
    border: 1px solid rgba(255, 255, 255, 0.35);
    box-shadow: 0 30px 60px rgba(0,0,0,0.5);
    animation: zoomFade 1s ease;
    transition: 0.4s;
}
.glass-card:hover {
    transform: translateY(-6px);
}

/* 🎬 Entry animation */
@keyframes zoomFade {
    from {opacity: 0; transform: scale(0.9);}
    to {opacity: 1; transform: scale(1);}
}

/* 👤 Avatar */
.avatar {
    width: 90px;
    height: 90px;
    background: #198754;
    border-radius: 50%;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #fff;
    font-size: 38px;
    margin: -70px auto 15px;
    box-shadow: 0 10px 25px rgba(0,0,0,0.4);
    animation: pulse 2s infinite;
}
@keyframes pulse {
    0% {box-shadow: 0 0 0 0 rgba(25,135,84,.7);}
    70% {box-shadow: 0 0 0 20px rgba(25,135,84,0);}
    100% {box-shadow: 0 0 0 0 rgba(25,135,84,0);}
}

/* ✍ Input with icon */
.input-group {
    position: relative;
}
.input-group i {
    position: absolute;
    top: 50%;
    left: 15px;
    transform: translateY(-50%);
    color: #198754;
    font-size: 18px;
}
.form-control {
    padding-left: 45px;
    border-radius: 30px;
    background: rgba(255,255,255,0.85);
}
.form-control:focus {
    box-shadow: 0 0 12px rgba(25,135,84,0.6);
    border-color: #198754;
}

/* 🚀 Button */
.login-btn {
    border-radius: 30px;
    font-weight: 600;
    letter-spacing: 1px;
    transition: 0.3s;
}
.login-btn:hover {
    transform: scale(1.05);
}

/* 🔗 Links */
.clink {
    font-weight: 600;
    text-decoration: none;
}
.clink:hover {
    text-decoration: underline;
}
</style>

</head>
<body>

<%@ include file="component/nav.jsp" %>

<div class="login-wrapper">
<div class="col-md-4">

    <div class="card glass-card">
        <div class="card-body p-4 text-center">

            <!-- Avatar -->
            <div class="avatar">
                <i class="fa-solid fa-user"></i>
            </div>

            <h4 class="fw-bold mb-3">User Login</h4>

            <% 
            String msg = (String)request.getAttribute("message");
            String color = (String)request.getAttribute("messageColor");
            if(msg != null){
            %>
                <p style="color:<%=color%>;"><%=msg%></p>
                <script>
                    setTimeout(()=>window.location.href="Userlogin.jsp",2000);
                </script>
            <% } %>

            <form action="forward" method="post">

                <!-- Email -->
                <div class="mb-3 input-group">
                    <i class="fa-solid fa-envelope"></i>
                    <input type="email" name="email"
                        class="form-control" placeholder="Email Address" required>
                </div>

                <!-- Password -->
                <div class="mb-3 input-group">
                    <i class="fa-solid fa-lock"></i>
                    <input type="password" name="password"
                        class="form-control" placeholder="Password" required>
                </div>

                <button class="btn btn-success col-12 login-btn">
                    <i class="fa-solid fa-right-to-bracket me-1"></i> Login
                </button>
            </form>

            <div class="mt-3">
                Don't have an account?
                <a href="Signup.jsp" class="clink">Create account</a>
            </div>

        </div>
    </div>

</div>
</div>

</body>
</html>

