<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">
  <head>
    <meta charset="utf-8">
    <title>Skrá sig inn</title>
  </head>
  <body>
    <h1>Skrá sig inn</h1>
    <main>
      <form method="post" action="">
        <fieldset>
          <legend>Notandi</legend>
          <div class="field">
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" id="username" placeholder="hoh44" required="Verður að setja inn nafn">
          </div>
          <div class="field">
            <label for="passworda">Lykilorð:</label>
            <input type="text" name="passworda" id="passworda" required>
          </div>
          <button>Skrá inn</button>
        </fieldset>
      </form>
    </main>
  </body>
</html>
