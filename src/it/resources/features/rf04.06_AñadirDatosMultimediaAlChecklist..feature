#language: es
Característica: Añadir datos multimedia al Checklist.

  Se podrán adjuntar archivos multimedia, imágenes o vídeos que sean de ayuda para los encargados, por cada checkpoint

#language: es
  Característica: Rellenar CheckList

  Se rellenará y validará los CheckList que el responsable haya generado para el proyecto. Al rellenar el checklist, el inspector deberá tener a mano la documentación introducida en la aplicación correspondiente al coche inspeccionado.


  Antecedentes:

  Escenario:
    Dado se navega hasta "proyecto ejemplo"
    Y estando logados como inspector
    Y se navega hasta "Unidad01"
    Y se navega hasta "M1"
    Y se selecciona "AISLAMIENTO"

    # TODO ver cómo se puede integrar el sacar una foto con la tablet al test
    Cuando en la tabla "Detalle" fila "1" se modifica el campo "Foto" a "ImagenDefoto"
    Entonces en la tabla "Detalle" fila "1" el campo "Foto" tendrá el valor "ImagenDefoto"



