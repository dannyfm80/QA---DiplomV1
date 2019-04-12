Feature: Funcionalidad de Incidentes

  Scenario: Ver detalle de artefacto
    Given 'SisSecurity' page inventario is loaded
    And choose option one click 'Ver detalles' on page inventario

  Scenario: Eliminar artefacto
    Given 'SisSecurity' page Inventario es ta cargado
    And choose option one click 'Dar de baja' on page inventario


  Scenario Outline: Crear artefacto
    Given crear artefacto
    And agregar artefacto "<nombre>" and "<modelo>" and "<estado>" and <cantidad> on page formulario

    Examples:
    | nombre | modelo | estado | cantidad |
    | Taladro | 2015 | Regular | 8       |


