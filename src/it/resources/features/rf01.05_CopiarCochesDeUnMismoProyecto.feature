#language: es
Característica: Copiar coches de un mismo proyecto
  Podrá copiar coches dentro de un mismo proyecto

  Antecedentes:
    Dado un proyecto llamado "proyecto ejemplo"
    Y estando logados como Responsable

  Escenario: modificando la estructura del proyecto
    Cuando vamos a la página principal
    Entonces se deberían ver el árbol de proyectos

    Cuando se navega hasta "proyecto ejemplo"
    Y mostramos los coches de "unidad01"
    Entonces deberíamos ver el coche "M01"
    Y deberíamos ver el coche "M02"



