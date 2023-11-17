#Author: Juan Diego Vasquez Salcedo

Feature: Yo como usuario pagador
  Quiero realizar una transaccion a un comercio en modo sandbox por medio de pago
  Donde pueda ver la transaccion realizada y se pueda validar sus estados

  @EscenarioTransfer
  Scenario Outline: Se valida pago aprobado por medio del boton Transferencia
    Given que el usuario ingresa a la pagina Wompi registrando valor inicial tx
      | valormonto   |
      | <valormonto> |
    When el usuario Selecciona metodo de pago e ingresa datos transferencia
      | correo   | nombresyapellidos   | cel   |tipopersona|tipotx|
      | <correo> | <nombresyapellidos> | <cel> |<tipopersona>|<tipotx>|

    Then el usuario vera el siguiente mensaje tx
      |validacion  |
      |<validacion>|

    Examples:
      | valormonto | correo           | nombresyapellidos| cel       |tipopersona| tipotx|  validacion |
      ##@externaldata@./src/test/resources/datadriven/Wompi.xlsx@TX
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3154789654   |Persona natural   |Transacción APROBADA   |aprobada (Transferencia Bancolombia)|
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3154789654   |Persona natural   |Transacción DECLINADA   |declinada (Transferencia Bancolombia)|
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3154789654   |Persona natural   |Transacción ERROR   |Transacción con ERROR|
   

