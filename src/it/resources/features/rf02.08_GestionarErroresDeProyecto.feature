#language: es
@gestionDatos @gestionErroresProyecto @active
Característica: Gestionar Errores de Proyecto

  Podrá gestionar las propiedades de cada error del proyecto, crearlos y borrarlos


  Antecedentes:

    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"


  Escenario:
    Dado estando en la página "GestionDeErrores"
    Y se pulsa "btnCreate"
    Y se selecciona "AISLAMIENTO" en el combo "cmbCategoria"
    Y se modifica el campo "txtFecha" por "2014/12/31"
    Y se modifica el campo "txtDescripcion" por "ErrorPrueba"
#    Y se modifica el campo "TipoPrueba" por "TipoPrueba"
    Y se modifica el campo "txtCodigo" por "CodigoPrueba"
    Y se pulsa "btnGuardar"
    Entonces en el listado "ListadoErrores" se visualizará "ErrorPrueba"
    # en el listado "(.*?)" (?:no) se visualizará "(.*?)"



    #Visualización
    Dado estando en la página "GestionDeErrores"
    Y se selecciona "ErrorPrueba" en el listado "lstErrores"
    Entonces en el combo "cmbCategoria" el valor seleccionado será "AISLAMIENTO"
    Y en el campo "txtFecha" se visualizará "2014/12/31"
    Y en el campo "txtDescripcion" se visualizará "ErrorPrueba"
#    Y en el campo "TipoPrueba" se visualizará "TipoPrueba"
    Y en el campo "txtCodigo" se visualizará "CodigoPrueba"

    #Edición
    Dado estando en la página "GestionDeErrores"
    Y se navega hasta "ErrorPrueba"
    Y se selecciona "COMPRAS" en el combo "cmbCategoria"
    Y se modifica el campo "txtFecha" por "2015/01/01"
    Y se modifica el campo "txtDescripcion" por "ErrorPrueba2"
#    Y se modifica el campo "TipoPrueba" por "TipoPrueba2"
    Y se modifica el campo "txtCodigo" por "CodigoPrueba2"
    Y se pulsa "btnGuardar"
    Entonces en el combo "cmbCategoria" el valor seleccionado será "AISLAMIENTO"
    Y en el campo "txtFecha" se visualizará "2015/01/01"
    Y en el campo "txtDescripcion" se visualizará "ErrorPrueba2"
#    Y en el campo "TipoPrueba" se visualizará "TipoPrueba2"
    Y en el campo "txtCodigo" se visualizará "CodigoPrueba2"

    #Eliminación
    Dado estando en la página "GestionDeErrores"
    Y se pulsa "EliminarError"
    Entonces en el listado "ListadoErrores" no se visualizará "ErrorPrueba"
