<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Skapa a�gang</title>
  </head>
  <body>
    <h1>Skapa a�gang</h1>
    <main>
      <form method="post" action="">
        <fieldset>
          <legend>Notandi</legend>
          <div class="field">
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" id="username" placeholder="hoh44" required="Ver�ur a� setja inn nafn">
          </div>
          <div class="field">
            <label for="email">Netfang:
            <input type="email" name="email" id="email" placeholder="hoh44@hi.is" required> <em>Netfang ver�ur a� innihalda "@" merki</em>
            </label>
          </div>
          <div class="field">
            <label for="passworda">Lykilor�:</label>
            <input type="text" name="passworda" id="passworda" required>
          </div>
          <div class="field">
            <label for="passwordb">Lykilor�, aftur:
            <input type="text" name="passwordb" required id="passwordb"> <em>Lykilor�in ver�a a� vera �au s�mu</em>
            </label>
          </div>
          <button>Senda inn</button>
        </fieldset>
      </form>
    </main>
  </body>
</html>
