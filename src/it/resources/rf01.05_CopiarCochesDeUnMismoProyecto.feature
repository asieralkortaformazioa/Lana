#language: es
Característica: Podrá modificarse la estructura de los proyectos
  Aunque la información obtenida de los sistemas de Caf no podrá modificarse, se podrá  editar el resto de opciones como unidades, coches etc.
  Como Responsable
  Se quiere modificar la estructura del proyecto añadiendo y quitando unidades y coches.

  Antecedentes:
    Dado un proyecto llamado proyecto ejemplo
    Y estamos logados Responsable

  Escenario: modificando la estructura del proyecto
    Cuando vamos a la página principal
    Entonces se deberían ver el árbol de proyectos

    Cuando se navegue hasta el proyecto
    Entonces debería ver "proyecto ejemplo"



