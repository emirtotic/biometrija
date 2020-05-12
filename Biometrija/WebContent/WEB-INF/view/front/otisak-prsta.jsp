<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<!--
	Introspect by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>Otisak prsta - Biometrija</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body>

		<!-- Header -->
			<header id="header">
				<div class="inner">
					<a href="index-page" class="logo">Biometrija</a>
					<nav id="nav">
						<a href="index-page">Pocetna</a>
						<a href="otisak-prsta">Otisak Prsta</a>
						<a href="iris-oka">Iris Oka</a>
						<a href="otisak-dlana">Dlan</a>
					</nav>
				</div>
			</header>
			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Main -->
			<section id="main" >
				<div class="inner">
					<header class="major special">
						<h1>${vrsta.name}</h1>
						<p style="text-align: justify;">${vrsta.description}</p>
					</header>
					<a href="#" class="image fit"><img src="${vrsta.image }" alt="" /></a>
					<p style="text-align: justify;">${vrsta.text}</p>
					</div>
			</section>

		<!-- Footer -->
			<section id="footer">
				<div class="inner">
					<header>
						<h2>Kontaktirajte me ukoliko zelite jos informacija</h2>
					</header>
					
					
					<form:form modelAttribute="contact" method="post" action="contact-save">
						<div class="field half first">
							<label for="name">Ime i Prezime</label>
							<form:input path="name" type="text" name="name" id="name" />
						</div>
						<div class="field half">
							<label for="email">E-mail</label>
							<form:input path="email" type="text" name="email" id="email" />
						</div>
						<div class="field">
							<label for="message">Poruka</label>
							<form:textarea path="message" name="message" id="message" rows="6"/>
						</div>
						<ul class="actions">
							<li><input type="submit" value="Posalji poruku" class="alt" /></li>
						</ul>
					</form:form>
					<div class="copyright">
						&copy; Design by: <a href="http://emirtotic.com/" target="_blank">Emir Totic</a>.
					</div>
				</div>
			</section>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>