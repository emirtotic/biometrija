<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML>

<html>
	<head>
		<title>Biometrijska zaštita</title>
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

		<!-- Banner -->
			<section id="banner">
				<div class="inner">
					<h1>Biometrija: <span>Ovaj sajt je kratak <br />pregled 
					teme Biometrijske zaštite</span></h1>
					<ul class="actions">
						<li><a href="#main" class="button alt">Get Started</a></li>
					</ul>
				</div>
				</section>
    		<div class="tm-main-section light-gray-bg"></div>
      		<div class="container" id="main"></div>
      	  	<section class="tm-section row">
                   
        </section> 
		

		<!-- One -->
			<section id="one">
				<div class="inner">
					<header>
						<h2>Šta je Biometrija?</h2>
					</header>
					<p>Biometrija je nauka i tehnologija o merenju i analiziranju bioloskih podataka. U Informacionim Tehnologijama, 
					biometrija se odnosi na tehnologije koje mere i analiziraju karakteristike ljudskog tela kao što su DNK, otisci prstiju, 
					mreznjace i duzice oka, sabloni glasa, sabloni lica i mere ruke, za potrebe identifikacije.
					Identifikacija putem biometrijske provere postaje sve ucestalija u korporacijskim i javnim bezbednosnim sistemima, 
					potrosackoj elektronici i u POS (“Point of Sale” – prodajno mesto) upotrebi. Osim bezbednosti, pokretacka snaga biometrijskih 
					provera je prakticnost.</p>
						<ul class="actions">
						<li><a href="https://en.wikipedia.org/wiki/Biometrics" class="button alt" target="_blank">Više o biometriji</a></li>
					</ul>
				</div>
			</section>

		<!-- Two -->
		
		
		
			<section id="two">
			
				<div class="inner">
				
					<c:forEach var="vrsta" items="${vrstaList}" >		
					
					<article>
						<div class="content">
							<header>
								<h3>${vrsta.name}</h3>
							</header>
							<div class="image fit">
								<img src="${vrsta.image}" alt=""  height="250" width="250"/>
							</div>
							<p style="justify-content: center;">${vrsta.description}</p>
							</div>
					</article>
				</c:forEach>	
				</div>
				
			</section>

		<!-- Three -->
			<section id="three">
			
				<div class="inner">
			
			<c:forEach var="clanak" items="${clanciList}" >	
			
					<article>
						<div class="content">
							<span class="icon fa-laptop"></span>
							<header>
								<h3>${clanak.name}</h3>
							</header>
							<p>${clanak.description }</p>
							<ul class="actions">
								<li><a href="${clanak.link}" target="_blank" class="button alt">Procitaj</a></li>
							</ul>
						</div>
					</article>
			</c:forEach>		
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