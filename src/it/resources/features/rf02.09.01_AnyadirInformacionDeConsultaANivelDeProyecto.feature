#language: es
Característica: Añadir Información de Consulta a nivel de Proyecto

  Añadirá informes técnicos que se necesiten para el entendimiento de las tareas del proyecto. Esta documentación se añadirá
  a nivel de proyecto, y a medida que se vayan creando unidades, estos documentos comunes se irán copiando en las mismas.


  Antecedentes:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"

  Escenario:
    Cuando se pulsa en "GestionarDocumentosUnidad"
    Y se añade el documento "DocumentoPrueba"
    Entonces el documento "DocumentoPrueba" se podrá ver en el detalle

    #Modificación
    Cuando se pulsa en "GestionarDocumentosUnidad"
    Y se añade el documento "DocumentoPrueba2"
    Entonces el documento "DocumentoPrueba2" se podrá ver en el detalle


    #Eliminación
    Cuando se pulsa en "EliminarDocumento" de "DocumentoPrueba2"
    Entonces el documento "DocumentoPrueba2" no se podrá ver en el detalle


