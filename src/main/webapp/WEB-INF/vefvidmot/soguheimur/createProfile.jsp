<!DOCTYPE html>

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
            <input type="text" name="name" id="name" placeholder="Hrafnhildur Olga Hjaltad�ttir" required="Ver�ur a� setja inn nafn">
          </div>
          <div class="field">
            <label for="nafn">Notendanafn:</label>
            <input type="text" name="nafn" id="nafn" placeholder="Notendanafn" required="Ver�ur a� setja inn nafn">
          </div>
          <div class="field">
            <label for="email">Netfang:
            <input type="email" name="email" id="email" placeholder="hoh44@hi.is" required> <em>Netfang ver�ur a� innihalda "@" merki</em>
            </label>
          </div>
          <div class="field">
            <label for="lykilord">Lykilor�:</label>
            <input type="text" name="lykilord" id="lykilord" required>
          </div>
          <div class="field">
            <label for="lykilordb">Lykilor�, aftur:
            <input type="text" name="lykilordb" required id="lykilordb"> <em>Lykilor�in ver�a a� vera �au s�mu</em>
            </label>
          </div>
          <div class="field">
            <label for="age">Aldur:</label>
            <input type="text" name="age" id="age" placeholder="23" required="Ver�ur a� setja inn aldur">
          </div>
          <div class="field">
            <label for="school">Sk�li:</label>
            <input type="text" name="school" id="school" placeholder="H�sk�li �slands">
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
