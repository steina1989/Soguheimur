<!DOCTYPE html>

<!-- 
 * Authors:
 * Ásgerður Inna aia11@hi.is
 * Hrafnhildur Olga hoh44@hi.is
 * Ólafur Konráð oka4@hi.is
 * Steina Dögg sdv6@hi.is
 
 This page is used to create a new profile.
 -->

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Skapa aðgang</title>
  </head>
  <body>
    <h1>Búa til aðgang</h1>
    <main>
      <form method="POST" action="/soguheimur/newUser">
        <fieldset>
          <legend>Nýr Notandi</legend>
          <div class="field">
            <label for="name">Nafn:</label>
            <input type="text" name="name" id="name" placeholder="Fullt Nafn" required="Verður að setja inn nafn">
          </div>
          <div class="field">
            <label for="username">Notendanafn:</label>
            <input type="text" name="username" id="username" placeholder="Notendanafn" required="Verður að setja inn nafn">
          </div>
          <div class="field">
            <label for="email">Netfang:
            <input type="email" name="email" id="email" placeholder="Netfang" required> <em>Netfang verður að innihalda "@" merki</em>
            </label>
          </div>
          <div class="field">
            <label for="lykilord">Lykilorð:</label>
            <input type="password" name="lykilord" id="lykilord" placeholder="Lykilorð" required>
          </div>
          <div class="field">
            <label for="lykilordb">Lykilorð, aftur:
            <input type="password" name="lykilordb" id="lykilordb" placeholder="Lykilorð aftur" required> <em>Lykilorðin verða að vera þau sömu</em>
            </label>
          </div>
          <div class="field">
            <label for="bday">Fæðingardagur:</label>
            <input type="date" name="bday" required="Verður að setja inn aldur">
          </div>
          <div class="field">
            <label for="school">Skóli:</label>
            <input type="text" name="school" id="school" placeholder="Skólinn þinn">
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
          
          <input type="submit" value="Nýskráning"/>
        </fieldset>
      </form>
    </main>
  </body>
</html>
