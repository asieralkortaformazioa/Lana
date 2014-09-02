#language: es
Característica: Copiar unidades de un mismo proyecto
  Podrá copiar unidades dentro de un mismo proyecto coches incluidos.

  Antecedentes:
    Dado un proyecto llamado "proyecto ejemplo"
    Y estando logados como Responsable

  Escenario: modificando la estructura del proyecto
    Cuando vamos a la página principal
    Entonces se deberían ver el árbol de proyectos

    Cuando se navega hasta "proyecto ejemplo"
    Y mostramos las unidades
    Entonces debería ver la unidad "unidad01"
    Y debería ver la unidad "unidad02"



