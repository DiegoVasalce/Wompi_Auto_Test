#Author: Juan Diego Vasquez Salcedo


Feature: Yo como usuario pagador
  Quiero realizar una transaccion a un comercio en modo sandbox por medio de pago
  Donde pueda ver la transaccion realizada y se pueda validar sus estados

  @EscenarioNequi
  Scenario Outline: Se valida pago aprobado por medio del boton Nequi
    Given que el usuario ingresa a la pagina Wompi registrando valor inicial Nq
      | valormonto   |
      | <valormonto> |
    When el usuario Selecciona metodo de pago e ingresa datos de Nequi
      | correo   | nombresyapellidos   | cel   |
      | <correo> | <nombresyapellidos> | <cel> |

    Then el usuario vera el estado de la operación nequi
      |validacion  |
      |<validacion>|

    Examples:
      | valormonto |     correo       | nombresyapellidos|     cel    |       validacion           |
       ##@externaldata@./src/test/resources/datadriven/Wompi.xlsx@Nequi
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3991111111   |Transacción aprobada (Nequi)|
   |100000   |jdvs@mailsac.com   |Diego Vasalce   |3992222222   |Transacción declinada (Nequi)|
