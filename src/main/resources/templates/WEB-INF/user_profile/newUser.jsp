<!DOCTYPE html>

<!-- 
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 
 Dynamic page showing previously submitted name string.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Velkomin!</title>
</head>
<body>

<h1>Takk fyrir nýskráninguna ${username}</h1>

<div>
	<p>Má bjóða þér að halda áfram á <a href="/soguheimur/homePage">heimasvæðið þitt</a>?</p>
</div>

</body>

</html>