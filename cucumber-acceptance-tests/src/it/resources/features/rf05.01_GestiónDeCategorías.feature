#language: es
@gestionDatos @gestionCategorias @active
Característica: Gestión de categorías

  Se podrán crear, editar y borrar las categorías


  Antecedentes:
    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario: Podrá gestionar los miembros o responsables de cada categoría

    # Creación
    Dado estando en la página "GestionDeCategorias"
    Y se pulsa "btnCrear"
    Entonces el listado "lstUsuariosActuales" está vacío
    Y se modifica el campo "txtNombre" por "CategoríaPrueba"
    Y se modifica el campo "txtDescripcion" por "DescripciónCategoríaPrueba"
    Y se selecciona "UsuarioPrueba" en el listado "lstUsuariosGenerales"
    Y se pulsa "btnAnyadirUsuario"

    Entonces en el campo "txtNombre" se visualizará "CategoríaPrueba"
    Y en el campo "txtDescripcion" se visualizará "DescripciónCategoríaPrueba"
    Y el listado "lstUsuariosActuales" contiene el valor "UsuarioPrueba"


    #Visualización
    Dado estando en la página "GestionDeCategorias"
    Y se selecciona "CategoríaPrueba" en el listado "lstCategorias"

    Entonces en el campo "txtNombre" se visualizará "CategoríaPrueba"
    Y en el campo "txtDescripcion" se visualizará "DescripciónCategoríaPrueba"
    Y el listado "lstUsuariosActuales" contiene el valor "UsuarioPrueba"

    #Edición
    Dado estando en la página "GestionDeCategorias"
    Y se selecciona "CategoríaPrueba" en el listado "lstCategorias"
    Y se modifica el campo "txtNombre" por "CategoríaPruebaUpd"
    Y se modifica el campo "txtDescripcion" por "DescripciónCategoríaPruebaUpd"
    Y se selecciona "UsuarioPrueba2" en el listado "lstUsuariosGenerales"
    Y se pulsa "btnAnyadirUsuario"
    Y se selecciona "UsuarioPrueba" en el listado "lstUsuariosActuales"
    Y se pulsa "btnQuitarUsuario"
    Y se pulsa "btnGuardar"


    Entonces se selecciona "CategoríaPrueba2" en el listado "lstCategorias"
    Y en el campo "txtNombre" se visualizará "CategoríaPruebaUpd"
    Y en el campo "txtDescripcion" se visualizará "DescripciónCategoríaPruebaUpd"
    Y el listado "lstUsuariosActuales" contiene el valor "UsuarioPrueba2"
    Y el listado "lstUsuariosActuales" no contiene el valor "UsuarioPrueba"


    #Eliminación
    Dado estando en la página "GestionDeErrores"
    Y se selecciona "CategoríaPrueba2" en el listado "lstCategorias"

    Entonces en el listado "lstCategorias" no se visualizará "CategoríaPrueba2"





