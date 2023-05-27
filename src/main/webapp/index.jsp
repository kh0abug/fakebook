<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>

<head>
    <title>Login</title>
    <link rel="stylesheet" href="./css/login.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>

<body>
<div class="box">
    <div class="col-md-6 title-box">
        <img src="./image/banner.svg" alt="Facebook">
        <p>Fakebook helps you connect and share <br>with the people in your life.</p>
    </div>
    <div class="col-md-6">
        <div class="form-box ">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <input name="userName" type="text" placeholder="Email address">
                <input name="log-password" type="password" placeholder="Password">
                <button id="log-btn" type="submit">Log In</button>
                <a href="#">Forgotten Password</a>
            </form>
            <hr>
            <div class="create-btn">
                <button type="button" id="create-btn">Create New Account</button>
            </div>
        </div>
    </div>

    <div class="form-box" id="sign-up">
        <form action="${pageContext.request.contextPath}/signup" method="post">
            <div class="row">
                <h1 class="col-md-8 sign-up_title text-start">Sign up</h1>
                <i id="close" class="close bi bi-x-lg col-md-4 text-end"></i>
            </div>
            <div class="row">
                <div class="col-md-6" style="padding: 0 10px 0 0 ;">
                    <input name="firstname" type="text" placeholder="First name">
                </div>
                <div class="col-md-6" style="padding: 0">
                    <input name="lastname" type="text" placeholder="Last name">
                </div>
            </div>
            <input name="sign-email" type="text" placeholder="Email address">
            <input name="sign-password" type="password" placeholder="Password">

            <p>Date of birth</p>
            <div>
                <input name="birth" style="color: #757575;" type="date" placeholder="First name">
            </div>
            <p>Gender</p>
            <div class="row">
                <div class="col-md-6 gender">
                    <label for="gender1">Male</label>
                    <input id="gender1" name="gender" type="radio" value="1">
                </div>

                <div class="col-md-6 gender">
                    <label for="gender2">Female</label>
                    <input id="gender2" name="gender" type="radio" value="0">
                </div>
            </div>
            <button id="sign-btn" type="submit">Sign up</button>
        </form>

    </div>
</div>
<script>
    let createBtn = document.getElementById('create-btn');
    let signUp = document.getElementById('sign-up');
    let logIn = document.getElementById('log-btn');
    createBtn.onclick = function () {
        signUp.style.display = 'block'

    }

    let close = document.getElementById('close');

    close.onclick = function () {
        signUp.style.display = 'none'
    }

    logIn.onclick = function () {

        alert(${messages.get("login")})
    }

</script>
</body>

</html>
