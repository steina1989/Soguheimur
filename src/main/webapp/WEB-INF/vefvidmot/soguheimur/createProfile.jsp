<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Skapa aðgang</title>
  </head>
  <body>
    <h1>Skapa aðgang</h1>
    <main>
      <form method="post" action="">
        <fieldset>
          <legend>Notandi</legend>
          <div class="field">
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" id="username" placeholder="hoh44" required="Verður að setja inn nafn">
          </div>
          <div class="field">
            <label for="email">Netfang:
            <input type="email" name="email" id="email" placeholder="hoh44@hi.is" required> <em>Netfang verður að innihalda "@" merki</em>
            </label>
          </div>
          <div class="field">
            <label for="passworda">Lykilorð:</label>
            <input type="text" name="passworda" id="passworda" required>
          </div>
          <div class="field">
            <label for="passwordb">Lykilorð, aftur:
            <input type="text" name="passwordb" required id="passwordb"> <em>Lykilorðin verða að vera þau sömu</em>
            </label>
          </div>
          <button>Senda inn</button>
        </fieldset>
      </form>
    </main>
  </body>
</html>
