#language: es
@GenericCrud @active
Característica: Crud de portlet genérico - Update

  Se comprueba la LECTURA  ACTUALIZACIÓN  de las CategoríasCaf

  Antecedentes:

    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario:


  ###########################
  # Edición
  ###########################
    Dado estando en la página "TestGenericCrud"
    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
    Y se modifica el campo "DESCRIPCIONvalue" por "TestCreatedDesc Upd"
    Y se modifica el campo "NOMBREvalue" por "TestCreated Nombre upd"
    Y se modifica el campo "IDvalue" por "TestCreatedUpd"
    Y se pulsa "btnUpdateElement"

    Entonces el campo "DELETEDvalue" deberá tener el valor "0"
    Y el campo "DESCRIPCIONvalue" deberá tener el valor "TestCreatedDesc Upd"
    Y el campo "IDvalue" deberá tener el valor "TestCreatedUpd"
    Y el campo "NOMBREvalue" deberá tener el valor "TestCreated Nombre upd"




