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
          <legend>Nýr Notandi</legend>
          <div class="field">
            <label for="name">Nafn:</label>
            <input type="text" name="name" id="name" placeholder="Hrafnhildur Olga Hjaltadóttir" required="Verður að setja inn nafn">
          </div>
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
          <div class="field">
            <label for="age">Aldur:</label>
            <input type="text" name="age" id="age" placeholder="23" required="Verður að setja inn aldur">
          </div>
          <div class="field">
            <label for="school">Skóli:</label>
            <input type="text" name="school" id="school" placeholder="Háskóli Íslands">
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
          
          <input type="submit" value="Staðfesta" />
        </fieldset>
      </form>
    </main>
  </body>
</html>
