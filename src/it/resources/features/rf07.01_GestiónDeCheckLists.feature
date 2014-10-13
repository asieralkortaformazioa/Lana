#language: es
@gestionDatos @gestionCheckLists @active
Característica: Gestión de Checklists

  Se podrán crear, editar y borrar los checklists.
  Las inspecciones, errores o checkpoints se refieren a lo mismo, se recogen en la tabla de erroresCaf de la BBDD.


  Antecedentes:
    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario: Podrá gestionar las inspecciones o checkpoints de cada Checklists

    ######################
    # Creación
    ######################
    Dado estando en la página "GestionDeChecklists"
    Y se pulsa "btnCrear"
    Entonces el listado "lstCheckpointsActuales" está vacío
    Y se modifica el campo "txtNombre" por "ChecklistPrueba"
    Y se modifica el campo "txtDescripcion" por "DescripciónChecklistPrueba"
    Y se modifica el campo "txtCodigo" por "CodigoChecklistPrueba"

    Y se selecciona "ErrorPrueba" en el listado "lstCheckpointsGenerales"
    Y se pulsa "btnAnyadirCheckpoint"
    Entonces el listado "lstCheckpointsGenerales" no contiene el valor "ErrorPrueba"
    Y el listado "lstCheckpointsActuales" contiene el valor "ErrorPrueba"

    Y se selecciona "ErrorPrueba2" en el listado "lstCheckpointsGenerales"
    Y se pulsa "btnAnyadirCheckpoint"
    Entonces el listado "lstCheckpointsGenerales" no contiene el valor "ErrorPrueba2"
    Y el listado "lstCheckpointsActuales" contiene el valor "ErrorPrueba2"

    Y se selecciona "ErrorPrueba2" en el listado "lstCheckpointsActuales"
    Y se pulsa "btnQuitarCheckpoint"
    Entonces el listado "lstCheckpointsGenerales" contiene el valor "ErrorPrueba2"
    Y el listado "lstCheckpointsActuales" no contiene el valor "ErrorPrueba2"


    Entonces en el campo "txtNombre" se visualizará "ChecklistPrueba"
    Y en el campo "txtDescripcion" se visualizará "DescripciónChecklistPrueba"
    Y en el campo "txtCodigo" se visualizará "CodigoChecklistPrueba"
    Entonces el listado "lstCheckpointsActuales" contiene el valor "ErrorPrueba"
    Y el listado "lstCheckpointsActuales" contiene 1 valor




    ######################
    #Visualización
    ######################
    Dado estando en la página "GestionDeChecklists"
    Y se selecciona "ChecklistPrueba" en el listado "lstCategorias"

    Entonces en el campo "txtNombre" se visualizará "ChecklistPrueba"
    Y en el campo "txtDescripcion" se visualizará "DescripciónChecklistPrueba"
    Y en el campo "txtCodigo" se visualizará "CodigoChecklistPrueba"
    Entonces el listado "lstCheckpointsActuales" contiene el valor "ErrorPrueba"
    Y el listado "lstCheckpointsActuales" contiene 1 valor





    ######################
    #Edición
    ######################
    Dado estando en la página "GestionDeCategorias"
    Y se selecciona "ChecklistPrueba" en el listado "lstChecklists"
    Y se modifica el campo "txtNombre" por "ChecklistPruebaUpd"
    Y se modifica el campo "txtDescripcion" por "DescripciónChecklistPruebaUpd"
    Y se modifica el campo "txtCodigo" por "CodigoChecklistPruebaUpd"

    Y se selecciona "ErrorPrueba" en el listado "lstCheckpointsActuales"
    Y se pulsa "btnQuitarCheckpoint"
    Y se selecciona "ErrorPrueba2" en el listado "lstCheckpointsGenerales"
    Y se pulsa "btnAnyadirCheckpoint"
    Y se pulsa "btnGuardar"


    Entonces en el campo "txtNombre" se visualizará "ChecklistPruebaUpd"
    Y en el campo "txtDescripcion" se visualizará "DescripciónChecklistPruebaUpd"
    Y en el campo "txtCodigo" se visualizará "CodigoChecklistPruebaUpd"
    Entonces el listado "lstCheckpointsActuales" contiene el valor "ErrorPrueba2"
    Y el listado "lstCheckpointsActuales" contiene 1 valor




    ######################
    #Eliminación
    ######################
    Dado estando en la página "GestionDeErrores"
    Y se selecciona "ChecklistPruebaUpd" en el listado "lstChecklists"
    Y se pulsa "btnEliminar"

    Entonces en el listado "lstChecklists" no se visualizará "ChecklistPruebaUpd"





