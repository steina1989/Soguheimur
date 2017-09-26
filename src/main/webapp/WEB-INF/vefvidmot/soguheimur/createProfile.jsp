<!DOCTYPE html>

<!-- 
 * Authors:
 * �sger�ur Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * �lafur Konr�� oka4@hi.is
 * Steina D�gg sdv6@hi.is
 
 This page is used to create a new profile.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Skapa a�gang</title>
  </head>
  <body>
    <h1>B�a til a�gang</h1>
    <main>
      <form method="POST" action="/soguheimur/newUser">
        <fieldset>
          <legend>N�r Notandi</legend>
          <div class="field">
            <label for="name">Nafn:</label>
            <input type="text" name="name" id="name" placeholder="Fullt Nafn" required="Ver�ur a� setja inn nafn">
          </div>
          <div class="field">
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" id="username" placeholder="Notendanafn" required="Ver�ur a� setja inn nafn">
          </div>
          <div class="field">
            <label for="email">Netfang:
            <input type="email" name="email" id="email" placeholder="Netfang" required> <em>Netfang ver�ur a� innihalda "@" merki</em>
            </label>
          </div>
          <div class="field">
            <label for="lykilord">Lykilor�:</label>
            <input type="password" name="lykilord" id="lykilord" placeholder="Lykilor�" required>
          </div>
          <div class="field">
            <label for="lykilordb">Lykilor�, aftur:
            <input type="password" name="lykilordb" id="lykilordb" placeholder="Lykilor� aftur" required> <em>Lykilor�in ver�a a� vera �au s�mu</em>
            </label>
          </div>
          <div class="field">
            <label for="bday">F��ingardagur:</label>
            <input type="date" name="bday" required="Ver�ur a� setja inn aldur">
          </div>
          <div class="field">
            <label for="school">Sk�li:</label>
            <input type="text" name="school" id="school" placeholder="Sk�linn �inn">
          </div>
           <div class="field">
            <label for="radio">Veldu mynd:</label>
          </div>
            <div class="field">
              <label>
                <input type="radio" value="0" name="number"> 1
              </label>
              <label>
                <input type="radio" value="10" name="number" checked>2
              </label>
              <label>
                <input type="radio" value="20" name="number"> 3
              </label>
              <label>
                <input type="radio" value="30" name="number"> 4
              </label>
            </div>
          
          <input type="submit" value="N�skr�ning"/>
        </fieldset>
      </form>
    </main>
  </body>
</html>
