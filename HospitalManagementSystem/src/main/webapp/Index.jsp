<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hospital Management System</title>
<%@ include file="component/Allcss.jsp"%>

<style type="text/css">
/* 🌈 General */
body {
    scroll-behavior: smooth;
}

/* 💳 Card Styling */
.paint-card {
    box-shadow: 0 12px 30px rgba(0, 0, 0, 0.25);
    border-radius: 15px;
    transition: all 0.4s ease;
}
.paint-card:hover {
    transform: translateY(-10px) scale(1.02);
    box-shadow: 0 18px 40px rgba(0, 0, 0, 0.4);
}

/* 🎞 Carousel Overlay */
.carousel-caption {
    background: rgba(0,0,0,0.55);
    padding: 30px;
    border-radius: 15px;
    animation: fadeUp 1.5s ease;
}

/* ✨ Animations */
@keyframes fadeUp {
    from { opacity: 0; transform: translateY(30px); }
    to { opacity: 1; transform: translateY(0); }
}

.fade-in {
    animation: fadeUp 1.2s ease;
}

/* 🩺 Feature Icons */
.feature-icon {
    font-size: 40px;
    color: #0d6efd;
    margin-bottom: 10px;
}

/* 👨‍⚕️ Team Image */
.team-img {
    border-radius: 15px;
    transition: 0.4s;
}
.team-img:hover {
    transform: scale(1.05);
}

/* 📢 Quote Section */
.quote-box {
    background: linear-gradient(135deg, #0d6efd, #0dcaf0);
    color: white;
    padding: 50px;
    border-radius: 20px;
    text-align: center;
}
</style>
</head>

<body>
<%@ include file="component/nav.jsp"%>

<!-- 🚑 HERO SLIDER -->
<div id="carouselExample" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">

        <div class="carousel-item active">
            <img src="Image/img5.jpg" class="d-block w-100" height="600px">
            <div class="carousel-caption">
                <h2>Compassion. Care. Cure.</h2>
                <p>Your health is our top priority</p>
            </div>
        </div>

        <div class="carousel-item">
            <img src="Image/img6.jpg" class="d-block w-100" height="600px">
            <div class="carousel-caption">
                <h2>Advanced Medical Technology</h2>
                <p>Because every life matters</p>
            </div>
        </div>
        <div class="carousel-item">
            <img src="Image/img2.jpg" class="d-block w-100" height="600px">
            <div class="carousel-caption">
                <h2>“In safe hands, always.”</h2>
                <p>“Expert doctors. Modern care. Human touch.”</p>
            </div>
        </div>
         <div class="carousel-item">
            <img src="Image/img3.jpg" class="d-block w-100" height="600px">
            <div class="carousel-caption">
                <h2>24×7 Emergency Care</h2>
                <p>Always ready to save lives</p>
            </div>
        </div>
       
        
    </div>

    <button class="carousel-control-prev" type="button"
        data-bs-target="#carouselExample" data-bs-slide="prev">
        <span class="carousel-control-prev-icon"></span>
    </button>
    <button class="carousel-control-next" type="button"
        data-bs-target="#carouselExample" data-bs-slide="next">
        <span class="carousel-control-next-icon"></span>
    </button>
</div>

<!-- ⭐ FEATURES -->
<div class="container p-5 fade-in">
    <p class="text-center fs-2 fw-bold">Key Features of Our Hospital</p>
    <div class="row g-4 mt-4">

        <div class="col-md-3">
            <div class="card paint-card text-center p-4">
                <div class="feature-icon">🛡️</div>
                <h5>100% Safety</h5>
                <p>Strict hygiene & patient safety standards</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-4">
                <div class="feature-icon">🌿</div>
                <h5>Clean Environment</h5>
                <p>Eco-friendly & premium sanitized premises</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-4">
                <div class="feature-icon">👨‍⚕️</div>
                <h5>Expert Doctors</h5>
                <p>Highly qualified & caring professionals</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-4">
                <div class="feature-icon">🔬</div>
                <h5>Medical Research</h5>
                <p>Advanced diagnostics & innovation</p>
            </div>
        </div>

    </div>
</div>

<!-- 💬 QUOTE SECTION -->
<div class="container mb-5 fade-in">
    <div class="quote-box">
        <h2>“Wherever the art of medicine is loved, there is also a love of humanity.”</h2>
        <p class="mt-3">— Hippocrates</p>
    </div>
</div>

<!-- 👨‍⚕️ OUR TEAM -->
<div class="container p-4 fade-in">
    <p class="text-center fs-2 fw-bold">Meet Our Medical Team</p>
    <div class="row mt-4 g-4">

        <div class="col-md-3">
            <div class="card paint-card text-center p-3">
                <img src="Image/doct1.jpg" class="team-img" height="280">
                <h5 class="mt-3">Dr. Samuani Simi</h5>
                <p>(CEO & Chairman)</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-3">
                <img src="Image/doct2.jpg" class="team-img" height="280">
                <h5 class="mt-3">Dr. Niuise Paule</h5>
                <p>(Chief Doctor)</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-3">
                <img src="Image/doct3.jpg" class="team-img" height="280">
                <h5 class="mt-3">Dr. Shreya Rajput</h5>
                <p>(Chief Doctor)</p>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card paint-card text-center p-3">
                <img src="Image/doct4.png" class="team-img" height="280">
                <h5 class="mt-3">Dr. Mathue Samuel</h5>
                <p>(Chief Doctor)</p>
            </div>
        </div>

    </div>
</div>

<%@ include file="component/Footer.jsp"%>
</body>
</html>
