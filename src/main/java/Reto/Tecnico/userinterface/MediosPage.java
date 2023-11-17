package Reto.Tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MediosPage {
    public static final Target BTN_PSE = Target.the("Medio de pago PSE")
            .located(By.xpath("//*[contains(text(),'cuenta de ahorros o corriente')]"));
    public static final Target BTN_TRANSFER = Target.the("Medio de pago PSE")
            .located(By.xpath("//strong[normalize-space()='(ahorro o corriente Bancolombia)']"));
    public static final Target BTN_NEQUI = Target.the("Medio de pago PSE")
            .located(By.xpath("//div[normalize-space()='Paga con tu cuenta Nequi']"));
}
