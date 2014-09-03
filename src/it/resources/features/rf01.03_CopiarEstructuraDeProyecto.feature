#language: es
Característica: Copiar estructura de proyectos
  No habrá que Crear/Editar/Borrar proyectos ya que se cargarán desde las tablas de Caf.
  Como Responsable
  Se quiere crear un proyecto para que se pueda crear la estructura pertinente del mismo.

  Escenario: editando proyectos
    Dado estando en la página principal
    Y estando logados como Responsable
    Y estamos editando un proyecto

    Cuando copiamos la estructura de "ProyectoPrueba"
    Entonces se generará la estructura en el proyecto actual
    Y tendrá las mismas unidades
    Y los mismos coches


