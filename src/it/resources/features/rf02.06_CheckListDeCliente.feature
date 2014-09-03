#language: es
Característica: CheckLists de cliente

  Los checklists de cliente no cargarán ningún checkpoint definido, sino que se comenzará con uno vacío y se irán añadiendo las
  faltas que se vayan encontrando mediante campos abiertos. Estos checklists podrán ser añadidos desde el botón de
  “Ver checklist de cliente”


  Antecedentes:


  Escenario:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"

    Cuando se pulse en "VerChekcListDeCliente"
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




