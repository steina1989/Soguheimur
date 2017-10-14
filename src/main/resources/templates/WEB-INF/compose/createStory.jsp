<!DOCTYPE html>

<!-- 
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 
 Displayed after following the link from the user's home page to submit a story.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<head>
    <title>Senda inn Sögu</title>
</head>
<body>

<h1>Söguheimur</h1>

<h2>Hér getur þú sent inn söguna þína</h2>

	<form method="POST" action="submit">
        <div class="form-group">
          <label class="" for="title">Titill:</label>
          <input class="form-control" type="text" name="title" id="title" placeholder="Titill" required>
        </div>
        <div class="form-group">
          <div>
            <label class="" for="new-entry-text">Texti:</label>
          </div>
          <textarea id="new-entry" name="text" class="form-control" rows="10" cols="40" placeholder="Sagan þín..."></textarea>
        </div>
        <input type="submit" value="Senda Inn"/>
      </form>


</body>

</html>