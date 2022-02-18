Feature: comprobar funcionamiento gestor de busqueda
  Yo como automatizador
  Necesito realizar busquedas
  Para comprobar la funcionalidad

  Background:
    Given Ingresa a la pagina y visualiza la barra

  Scenario:
    When realiza una busqueda "lo que sea"
    Then  vizualiza la cantidad de resustaldos y el enlace a herramienta

  Scenario:
    When realiza cualquier busqueda
    Then valida el tiempo que tardo la busqueda y el enlace a herramienta

  Scenario:
    When realiza una busqueda erronea
    Then  vizualiza mensaje de error y el enlace a herramienta