<!DOCTYPE html>

<!-- 
 * Authors:
 * �sger�ur Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * �lafur Konr�� oka4@hi.is
 * Steina D�gg sdv6@hi.is
 
 The login page.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Innskr�ning</title>
  </head>
  <body>
    <h1>Innskr�ning</h1>
    <main>
      <form method="POST" action="/soguheimur/welcome">
        <fieldset>
          <legend>Innskr�ning</legend>
          <div>
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" placeholder="Notendanafn" required="Ver�ur a� setja inn nafn">
          </div>
          <div>
            <label for="lykilord">Lykilor�:</label>
            <input type="password" name="lykilord" placeholder="Lykilor�" required="Ver�ur a� setja inn lykilor�">
          </div>
          <input type="submit" value="Innskr�ning"/>
        </fieldset>
      </form>
    </main>
  </body>
</html>
