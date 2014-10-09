#language: es
Característica: Modificación de fecha de aceptación

  El Inspector deberá de tener la posibilidad de modificar la fecha de aceptación de los checkpoints y el checklist  después de que el Ok ya se haya dado, para poder presentar datos con una mayor coherencia.


  Antecedentes:

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como inspector
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"

    Cuando en la tabla "Detalle" fila "1" se visualiza el valor "OK" en el campo "Estado"
    Entonces en la tabla "Detalle" fila "1" se visualiza el valor "TODAY" en el campo "Fecha"
    Y en la tabla "Detalle" fila "1" el campo "Fecha" será editable
    #TODO establecer todos los estados de los checkpoints a OK

    Cuando para el proyecto "proyecto ejemplo" y checklist "AISLAMIENTO" el campo "Fecha" no sea vacío
      Y en la tabla "Detalle" fila "1" se modifica el campo "Fecha" a "2014/11/30"
    Entonces en la tabla "Detalle" fila "1" el campo "Fecha" tendrá el valor "2014/11/30"






