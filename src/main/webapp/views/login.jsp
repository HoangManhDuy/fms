<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>HD-SIS</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="LoginPage_QuanLySinhVien">
<meta name="author" content="HoangDuy">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link href="<c:url value="/assets/images/png" />" rel="icon"
	type="images/png">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/bootstrap/css/bootstrap.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/fonts/font-awesome-4.7.0/css/font-awesome.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/fonts/iconic/css/material-design-iconic-font.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/animate/animate.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/css-hamburgers/hamburgers.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/animsition/css/animsition.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/select2/select2.min.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/vendor/daterangepicker/daterangepicker.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/css/util.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/css/main.css" />">
<link rel="stylesheet" type="text/css"
	href="<c:url value="/assets/css/login-custom.css" />">
</head>
<body>
	<div class="limiter">
		<div class="container-login100"
			style="background-image: url('<c:url value='/assets/images/bg-01.jpg' />');">
			<div class="wrap-login100 form-custom">
				<div class="row title">
					<h1 class="title-head">Student Information Management System</h1>
					<span class="login100-form-logo"> <i
						class="zmdi zmdi-landscape"></i>
					</span> 
					<span class="hs">|</span>
					<span class="login100-form-title "> HD-SIS </span>
				</div>
				<div class="row form-login-custom">
					<form class="login100-form validate-form" method="post"
						action="/springmvc/">

						<div class="wrap-input100 validate-input"
							data-validate="Enter email">
							<input class="input100" type="text" name="email"
								placeholder="Email"> <span class="focus-input100"
								data-placeholder="&#xf207;"></span>
						</div>

						<div class="wrap-input100 validate-input"
							data-validate="Enter password">
							<input class="input100" type="password" name="password"
								placeholder="Password"> <span class="focus-input100"
								data-placeholder="&#xf191;"></span>
						</div>

						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox"
								name="remember-me"> <label class="label-checkbox100"
								for="ckb1"> Remember me </label>
						</div>

						<div class="container-login100-form-btn">
							<button class="login100-form-btn">Login</button>
						</div>

						<div class="text-center forgot-pass">
							<a class="txt1" href="#"> Forgot Password? </a>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="dropDownSelect1"></div>
	<!--===============================================================================================-->
	<script
		src="<c:url value="/assets/vendor/jquery/jquery-3.2.1.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/animsition/js/animsition.min.js" />"></script>
	<script src="<c:url value="/assets/vendor/bootstrap/js/popper.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/bootstrap/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/assets/vendor/select2/select2.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/daterangepicker/moment.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/daterangepicker/daterangepicker.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/countdowntime/countdowntime.js" />"></script>
	<script src="<c:url value="/assets/js/main.js" />"></script>
</body>
</html>