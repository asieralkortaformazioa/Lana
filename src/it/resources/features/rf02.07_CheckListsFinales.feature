#language: es
Característica: CheckLists finales

El Responsable podrá crear Checklists Finales añadiendo errores predefinidos de Base de Datos o de Campos abiertos.
Estos checklists estarán disponibles desde el botón de “ver checklist Final” de cada coche.

Podrán ser exportados a excel.



  Antecedentes:


  Escenario:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"

    Cuando se pulsa "VerChekcListFinal"
    Y se navega a "ProyectoPrueba"
    Y se navega a "Unidad01"
    Y se navega a "M01"
    Y se navega a "AISLAMIENTO"
    Entonces se visualizan los checkpoints asociados
    Y el chekpoint "cpPrueba01" no es un checkpoint predefinido

    Cuando se añade un error "ErrorAñadido"
    Entonces el error "ErrorAñadido" se visualizará en la página

    Cuando se pulsa en "ExportarAExcel"
    Entonces se generará un fichero excel para descargar con el checklist



