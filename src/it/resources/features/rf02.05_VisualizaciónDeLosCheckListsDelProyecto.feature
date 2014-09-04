#language: es
Característica: Visualización de los checkLists del proyecto.
  Se visualizarán por orden de fabricación, que se pasará desde calidad.

  Se mantendrá el código de colores utilizado. La “Fecha de Cierre” se asignará manualmente, pero si existiendo una “Fecha de Cierre” se realiza alguna modificación en la situación de los checkpoints, la fecha de cierre se actualizará con la actual de ese momento.

  Antecedentes:
    Dado el proyecto "ProyectoPrueba" existe


  Escenario:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"
    Y se navega hasta "unidadPrueba"


    Cuando se gestionan los checklists
    Entonces se cargarán en el listado "ChecklistsActuales" los checklists asociados a "ProyectoPrueba"
    Y se cargará el detalle de los checklists asociados




  #TODO
  # Añadir datos de checklists
  # Añadir checks de Códigos de colores


