#Author: Juan Diego Vasquez Salcedo

Feature: Yo como usuario pagador
  Quiero realizar una transaccion a un comercio en modo sandbox por medio de pago
  Donde pueda ver la transaccion realizada y se pueda validar sus estados

  @EscenarioPse
  Scenario Outline: Se valida pago aprobado por medio del boton PSE
    Given que el usuario ingresa a la pagina Wompi registrando valor inicial
      | valormonto   |
      | <valormonto> |
    When el usuario Selecciona metodo de pago e ingresa datos
      | correo   | nombresyapellidos   | cel   | tipobanco   | numdoc   |
      | <correo> | <nombresyapellidos> | <cel> | <tipobanco> | <numdoc> |

    Then el usuario vera el siguiente mensaje
    |validacion  |
    |<validacion>|

    Examples:
      | valormonto | correo           | nombresyapellidos| cel       | tipobanco         | numdoc     |validacion                |
      ##@externaldata@./src/test/resources/datadriven/Wompi.xlsx@PSE
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3182258745   |Banco que aprueba   |1110548796   |Transacción aprobada (PSE)|
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3182258745   |Banco que declina   |1110548796   |Transacción declinada (PSE)|
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3182258745   |Banco que error   |1110548796   |Transacción con ERROR|
