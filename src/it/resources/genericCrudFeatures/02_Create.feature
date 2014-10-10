#language: es
@GenericCrud @active
Característica: Crud de portlet genérico

  Se comprueba la LECTURA CREACIÓN de las CategoríasCaf

  Antecedentes:

    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario:


    ###########################
    # Creación valores antiguos
    ###########################
    Dado estando en la página "TestGenericCrud"
    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
    Y se modifica el campo "DELETEDvalue" por "0"
    Y se modifica el campo "DESCRIPCIONvalue" por "TestCreatedDesc"
    Y se modifica el campo "IDvalue" por "TestCreated"
    Y se modifica el campo "NOMBREvalue" por "TestCreated Nombre"
    Y se pulsa "btnCreate"

  #No se podrán hacer las comprobaciones hasta no montar el portlet de navegación

#    Entonces el campo "DESCRIPCIONvalue" deberá tener el valor "TestCreatedDesc"
#    Y el campo "IDvalue" deberá tener el valor "TestCreated"
#    Y el campo "NOMBREvalue" deberá tener el valor "TestCreated Nombre"
#    Y el campo "DELETEDvalue" deberá tener el valor "0"



  ###########################
  # Edición
  ###########################
#    Dado estando en la página "TestGenericCrud"
#    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
#    Y se modifica el campo "DESCRIPCIONvalue" por "TestCreatedDesc Upd"
#    Y se modifica el campo "NOMBREvalue" por "TestCreated Nombre upd"
#    Y se modifica el campo "IDvalue" por "TestCreatedUpd"
#    Y se pulsa "btnUpdateElement"
#
#    Entonces el campo "DELETEDvalue" deberá tener el valor "0"
#    Y el campo "DESCRIPCIONvalue" deberá tener el valor "TestCreatedDesc Upd"
#    Y el campo "IDvalue" deberá tener el valor "TestCreatedUpd"
#    Y el campo "NOMBREvalue" deberá tener el valor "TestCreated Nombre upd"


  ###########################
  # Borrado
  ###########################
#    Dado estando en la página "TestGenericCrud"
#    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
#    Y se pulsa "btnDelete"


