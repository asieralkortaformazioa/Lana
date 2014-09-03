#language: es
Característica: Propagar modificaciones en Coches posteriores

  Al modificar las propiedades de los coches se puede seleccionar la opción “Reproducir cambios en Unidades posteriores”, con lo
  que las modificaciones que se realicen se propagarán a los siguientes coches, siendo estos los siguientes en orden alfabético
  según la descripción y dentro del mismo proyecto, propagándose también a las unidades posteriores.


  Antecedentes:
    Dado estando en la página principal
    Y se navega hasta "ProyectoPrueba"
    Y de la lista "ListaUnidades" se selecciona "Unidad01"


  Escenario:
    #Modificar Tipo
    Cuando se selecciona el coche "M3"
    Y se activa "ReproducirCambiosEnUnidadesPosteriores"
    Y se modifica el campo "Tipo" por "TipoPrueba2"
    Y se pulsa en "Guardar"

    Entonces se selecciona el coche "M3"
    Y en el campo "Tipo" se visualizará "TipoPrueba2"

    Y se selecciona el coche "M4"
    Y en el campo "Tipo" se visualizará "TipoPrueba2"

    Y se selecciona el coche "M5"
    Y en el campo "Tipo" se visualizará "TipoPrueba2"


    #Modificar Fecha
    Cuando se selecciona el coche "M3"
    Y se activa "ReproducirCambiosEnUnidadesPosteriores"
    Y se modifica el campo "Fecha" por "2014/12/29"
    Y se pulsa en "Guardar"

    Entonces se selecciona el coche "M3"
    Y en el campo "Fecha" se visualizará "2014/12/29"

    Y se selecciona el coche "M4"
    Y en el campo "Fecha" se visualizará "2014/12/29"

    Y se selecciona el coche "M5"
    Y en el campo "Fecha" se visualizará "2014/12/29"

    #Modificar Código
    Cuando se selecciona el coche "M3"
    Y se activa "ReproducirCambiosEnUnidadesPosteriores"
    Y se modifica el campo "Código" por "CódigoPrueba2"
    Y se pulsa en "Guardar"

    Entonces se selecciona el coche "M3"
    Y en el campo "Código" se visualizará "CódigoPrueba2"

    Y se selecciona el coche "M4"
    Y en el campo "Código" se visualizará "CódigoPrueba2"

    Y se selecciona el coche "M5"
    Y en el campo "Código" se visualizará "CódigoPrueba2"

    #Modificar Descripción
    Cuando se selecciona el coche "M3"
    Y se activa "ReproducirCambiosEnUnidadesPosteriores"
    Y se modifica el campo "Descripción" por "DescripciónPrueba2"
    Y se pulsa en "Guardar"

    Entonces se selecciona el coche "M3"
    Y en el campo "Descripción" se visualizará "DescripciónPrueba2"

    Y se selecciona el coche "M4"
    Y en el campo "Descripción" se visualizará "DescripciónPrueba2"

    Y se selecciona el coche "M5"
    Y en el campo "Descripción" se visualizará "DescripciónPrueba2"


    TODO añadir Cambios en Checklists


