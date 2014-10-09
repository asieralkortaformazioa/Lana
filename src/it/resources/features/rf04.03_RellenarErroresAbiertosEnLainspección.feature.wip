#language: es
Característica: Rellenar Errores abiertos en la inspección

  Puede que al realizar la inspección el inspector, se encuentren errores que no estén registrados como tal en el sistema por lo que se podrá añadir campos abiertos para la descripción y lugar y un combo para los responsables.

  Antecedentes:

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como inspector
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"


    #Añadir Error Abierto
  Cuando se pulsa en "AñadirError"
  Y se modifica el campo "Descripción" por "NuevoErrorAbierto"
  Y se modifica el campo "Fecha" por "2014/12/31"
  Y se modifica el campo "Posición" por "NuevaPosición"
  Y se modifica el campo "Inspección" por "InspecciónPrueba"
  Y se pulsa "Guardar"

    #TODO ver índice última fila según checklists asignados
  Entonces en la tabla "Detalle" fila "10" el campo "Descripción" tendrá el valor "NuevoErrorAbierto"
  Y en la tabla "Detalle" fila "10" el campo "Fecha" tendrá el valor "2014/12/31"
  Y en la tabla "Detalle" fila "10" el campo "Posición" tendrá el valor "NuevaPosición"
  Y en la tabla "Detalle" fila "10" el campo "Inspección" tendrá el valor "InspecciónPrueba"



