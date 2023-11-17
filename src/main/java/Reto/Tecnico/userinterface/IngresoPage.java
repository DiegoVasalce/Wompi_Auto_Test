package Reto.Tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresoPage {
    public static final Target TXT_MONTO_A_PAGAR = Target.the("Espacio monto a pagar")
            .located(By.xpath("//*[@class='amount-input']"));
    public static final Target BTN_CONTINUAR = Target.the("Botón Continuar")
            .located(By.xpath("//*[contains(text(),'Continuar')]"));
    public static final Target BTN_CONTINUAR2 = Target.the("Botón Continuar")
            .located(By.xpath("//span[normalize-space()='Continuar con tu pago']"));

}
