#language: es
@GenericCrud
Característica: Crud de portlet genérico - Delete

  Se comprueba el BORRADO de las CategoríasCaf

  Antecedentes:

    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario:

  ###########################
  # Borrado
  ###########################
    Dado estando en la página "TestGenericCrud"
    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
    Y se pulsa "btnDelete"


