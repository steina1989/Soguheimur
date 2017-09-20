<!DOCTYPE html>

<!-- 
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 
 The login page.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">
  <head>
    <meta charset="utf-8">
    <title>Innskráning</title>
  </head>
  <body>
    <h1>Innskráning</h1>
    <main>
      <form method="POST" action="/soguheimur/welcome">
        <fieldset>
          <legend>Innskráning</legend>
          <div>
            <label for="nafn">Notendanafn:</label>
            <input type="text" name="nafn" placeholder="Nafn" required="Verður að setja inn nafn">
          </div>
          <div>
            <label for="lykilord">Lykilorð:</label>
            <input type="text" name="lykilord" placeholder="Lykilorð" required="Verður að setja inn lykilorð">
          </div>
          <input type="submit" value="Innskráning"/>
        </fieldset>
      </form>
    </main>
  </body>
</html>
