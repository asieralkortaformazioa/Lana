#language: es
@GenericCrud
Característica: Edición de configuración de portlet

  Se comprueba que la configuración funciona correctamente.

  Antecedentes:

    Dado estando logado en el entorno "pluto" en la página "Login" como "tomcat" con password "tomcat"

  Escenario:
    Dado estando en la página "TestGenericCrud"
    Y se selecciona el modo de portlet "EDITDEFAULTS" en el combo "//form[@name='modeSelectionForm']/select"
    # borrar valores antiguos
    Y se modifica el campo "schema" por "vacio"
    Y se modifica el campo "table" por "vacio"
    Y se modifica el campo "restServiceUrl" por "vacio"
    Y se pulsa "submit"


    Entonces el campo "schema" deberá tener el valor "vacio"
    Y el campo "table" deberá tener el valor "vacio"
    Y el campo "restServiceUrl" deberá tener el valor "vacio"


    # añadir nuveos valores
    Dado se modifica el campo "schema" por "PORTAL"
    Y se modifica el campo "table" por "GC_CATEGORIACAF"
    Y se modifica el campo "restServiceUrl" por "http://localhost:8080/GenericCrud-restService-1.0-SNAPSHOT/GenericCrud-restService/GenericCrudSvc"
    Y se pulsa "submit"

    # check de valores introducidos
    Entonces el campo "schema" deberá tener el valor "PORTAL"
    Y el campo "table" deberá tener el valor "GC_CATEGORIACAF"
    Y el campo "restServiceUrl" deberá tener el valor "http://localhost:8080/GenericCrud-restService-1.0-SNAPSHOT/GenericCrud-restService/GenericCrudSvc"
    Y capturar Pantalla "FinalTest"

    #Comprobar estructura de CategoríaCaf en View
    Dado estando en la página "TestGenericCrud"
    Y se selecciona el modo de portlet "VIEW" en el combo "//form[@name='modeSelectionForm']/select"
    Entonces se debería ver el texto "DELETED"
    Y se debería ver el texto "DESCRIPCION"
    Y se debería ver el texto "ID:"
    Y se debería ver el texto "NOMBRE:"



