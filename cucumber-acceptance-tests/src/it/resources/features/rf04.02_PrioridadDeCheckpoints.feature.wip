#language: es
Característica: Prioridad de Checkpoints

  Los errores podrán ser marcados como urgentes para que se pueda priorizar su corrección.

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como inspector
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"


    Cuando en la tabla "Detalle" fila "1" se modifica el campo "Urgente" a "checked"
    Entonces en la tabla "Detalle" fila "1" el campo "Urgente" tendrá el valor "checked"

    Cuando en la tabla "Detalle" fila "1" se modifica el campo "Urgente" a "unchecked"
    Entonces en la tabla "Detalle" fila "1" el campo "Urgente" tendrá el valor "unchecked"
