#language: es
Característica: Consultar Información de Consulta

  Consultar  informes técnicos que se necesiten para el entendimiento de las tareas del proyecto.


  Antecedentes:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"

  Escenario:

    Cuando se selecciona el "DocumentoPrueba" de "listaDocumentaciónProyecto"
    Entonces se cargará el documento en el visualizador


    # Documentación de unidad
    Cuando se selecciona el "DocumentoPrueba" de "listaDocumentaciónUnidad"
    Y se pulsa en "Visualizar"
    Entonces se cargará el documento en el visualizador



