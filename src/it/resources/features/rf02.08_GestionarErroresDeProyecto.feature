#language: es
Característica: Gestionar Errores de Proyecto

  Podrá gestionar las propiedades de cada error del proyecto, crearlos y borrarlos


  Antecedentes:
    Dado vamos a la página "Login"

  Escenario:
    Dado estando en la página "GestionDeErrores"
    Y se pulsa "CrearError"
    Y se modifica el campo "Categoría" por "AISLAMIENTO"
    Y se modifica el campo "Fecha" por "2014/12/31"
    Y se modifica el campo "Descripción" por "ErrorPrueba"
    Y se modifica el campo "TipoPrueba" por "TipoPrueba"
    Y se modifica el campo "Código" por "CodigoPrueba"
    Y se pulsa "Guardar"
    Entonces en el listado "ListadoErrores" no se visualizará "ErrorPrueba"

    #Visualización
    Dado estando en la página "GestiónDeErrores"
    Y se navega hasta "ErrorPrueba"
    Entonces en el campo "Categoría" se visualizará "AISLAMIENTO"
    Y en el campo "Fecha" se visualizará "2014/12/31"
    Y en el campo "Descripción" se visualizará "ErrorPrueba"
    Y en el campo "TipoPrueba" se visualizará "TipoPrueba"
    Y en el campo "Código" se visualizará "CodigoPrueba"

    #Edición
    Dado estando en la página "GestiónDeErrores"
    Y se navega hasta "ErrorPrueba"
    Y se modifica el campo "Categoría" por "COMPRAS"
    Y se modifica el campo "Fecha" por "2015/01/01"
    Y se modifica el campo "Descripción" por "ErrorPrueba2"
    Y se modifica el campo "TipoPrueba" por "TipoPrueba2"
    Y se modifica el campo "Código" por "CodigoPrueba2"
    Entonces en el campo "Categoría" se visualizará "AISLAMIENTO"
    Y en el campo "Fecha" se visualizará "2015/01/01"
    Y en el campo "Descripción" se visualizará "ErrorPrueba2"
    Y en el campo "TipoPrueba" se visualizará "TipoPrueba2"
    Y en el campo "Código" se visualizará "CodigoPrueba2"

    #Eliminación
    Dado estando en la página "GestiónDeErrores"
    Y se pulsa "EliminarError"
    Entonces en el listado "ListadoErrores" no se visualizará "ErrorPrueba"
