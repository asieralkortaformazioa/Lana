#language: es
Característica: Revisar CheckList

  El encargado Revisará los CheckList que el inspector haya pasado para poder corregir los errores encontrados

  Antecedentes:

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como responsable
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"

    Cuando en la tabla "Detalle" fila "1" se modifica el campo "Estado" a "REPARADO"
    Entonces en la tabla "Detalle" fila "1" el campo "Estado" tendrá el valor "REPARADO"
    Y no existirá el botón "AñadirError"
    Y no existirá el botón "Eliminar"
    Y el campo "Lugar" no será editable
    Y el campo "Foto" no será editable
    Y el campo "Urgente" no será editable

