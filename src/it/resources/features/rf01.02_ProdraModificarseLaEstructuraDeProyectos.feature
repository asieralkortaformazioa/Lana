#language: es
Característica: Podrá modificarse la estructura de los proyectos
  Aunque la información obtenida de los sistemas de Caf no podrá modificarse, se podrá  editar el resto de opciones como unidades, coches etc.
  Como Responsable
  Se quiere modificar la estructura del proyecto añadiendo y quitando unidades y coches.

  Antecedentes:
    Dado un proyecto llamado proyecto ejemplo
    Y estando logados como Responsable

  Escenario: modificando la estructura del proyecto
    Cuando vamos a la página principal
    Entonces se deberían ver el árbol de proyectos


    Cuando se navega hasta "proyecto ejemplo"
    Entonces debería ver "proyecto ejemplo"
    Y se visualizarán las unidades asociadas
    Y se visualizarán los CheckLists asociados


    Cuando se añada una unidad
    Entonces debería ver la nueva unidad en el listado de unidades
    Y deberá ver los coches de cada unidad con el tipo especificado




    Cuando se modifica el campo "Nombre" por "ProyectoPrueba"
    Entonces en el campo "Nombre" se visualizará "ProyectoPrueba"

    Cuando se modifica el campo "Fecha" por "31/12/2014"
    Entonces en el campo "Fecha" se visualizará "31/12/2014"

    Cuando se modifica el campo "Código" por "CodigoPrueba"
    Entonces en el campo "Código" se visualizará "CodigoPrueba"

    Cuando se modifica el campo "Descripción" por "DescripciónPrueba"
    Entonces en el campo "Descripción" se visualizará "DescripciónPrueba"
