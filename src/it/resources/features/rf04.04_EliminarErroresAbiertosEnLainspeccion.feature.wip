#language: es
Característica: Eliminar Errores abiertos en la inspección

  El inspector podrá eliminar checkpoints abiertos al pasar el checklist. Los checkpoints prefijados por el responsable no podrán ser eliminados.


  Antecedentes:

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como inspector
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"


  # Eliminar error abierto

  Cuando en la tabla "Detalle" fila "1" se pulsa "Eliminar"
  Entonces en la tabla "Detalle" fila "1" no se debe visualizar
  Y el checkpoint se debe de haber borrado para el proyecto "proyecto ejemplo" unidad "Unidad01" coche "M1" e índice "1"

