<!DOCTYPE html>

<!-- 
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 
 Displayed after you follow the link from your log in page.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Heimasvæðið</title>
</head>
<body>

<h1>Heimasvæðið þitt</h1>
<!-- 
*Following the link takes you to the page to submit stories.
 -->
<div>
	<p>Má bjóða þér að senda inn nýja sögu?</p>
	<a href="/soguheimur/story">Senda inn sögu</a>
</div>
<div>
	<p>Má bjóða þér að skoða sögurnar þínar?</p>
</div>

</body>

</html>