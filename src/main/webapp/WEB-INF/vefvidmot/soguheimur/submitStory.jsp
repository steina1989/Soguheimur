<!DOCTYPE html>

<!-- 
 * Authors:
 * �sger�ur Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * �lafur Konr�� oka4@hi.is
 * Steina D�gg sdv6@hi.is
 
 Displayed after following the link from the user's home page to submit a story.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
	<meta charset="utf-8">
    <title>Senda inn S�gu</title>
</head>
<body>

<h1>S�guheimur</h1>

<h2>H�r getur �� sent inn s�guna ��na</h2>

	<form method="POST" action="/soguheimur/newStory">
        <div class="form-group">
          <label class="" for="title">Titill:</label>
          <input class="form-control" type="text" name="title" id="title" placeholder="Titill" required>
        </div>
        <div class="form-group">
          <div>
            <label class="" for="new-entry-text">Texti:</label>
          </div>
          <textarea id="new-entry" name="text" class="form-control" rows="10" cols="40" placeholder="Sagan ��n..."></textarea>
        </div>
        <input type="submit" value="Senda Inn"/>
      </form>


</body>

</html>