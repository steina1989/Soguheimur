<!DOCTYPE html>

<!-- 
 * Authors:
 * �sger�ur Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * �lafur Konr�� oka4@hi.is
 * Steina D�gg sdv6@hi.is
 
 Displayed after successful login.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
	<meta charset="utf-8">
    <title>Velkomin!</title>
</head>
<body>

<h1>Velkomin/n aftur ${notandi.getFullName()}</h1>

<div>
	<p>M� bj��a ��r a� halda �fram � <a href="/soguheimur/homePage">heimasv��i�</a> �itt?</p>
</div>

</body>

</html>