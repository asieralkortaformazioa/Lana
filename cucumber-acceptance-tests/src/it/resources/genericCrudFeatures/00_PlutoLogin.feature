#language: es
@init
Característica: Test de Login en Pluto

  Test de Login en Pluto

  Antecedentes:

  Escenario:
    Dado estando en la página "Login"
    Y se modifica el campo "j_username" por "tomcat"
    Y se modifica el campo "j_password" por "tomcat"
    Y se pulsa "j_login"
    Y vamos a la página "AboutPluto"

    Entonces se tiene que ver el texto "About Pluto Portal Driver"


