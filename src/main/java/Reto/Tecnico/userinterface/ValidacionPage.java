package Reto.Tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionPage {
    public static final Target LBL_VALIDACION = Target.the("Tx Aprobada")
            .located(By.xpath("//span[@class='title__-7har']"));
    public static final Target LBL_VALIDACION2 = Target.the("Tx Aprobada")
            .located(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]"));
    public static final Target LBL_VALIDACION3 = Target.the("Tx Aprobada")
            .located(By.xpath("//span[@class='src-components-App-__App__title__Y13rn']"));
    public static final Target LBL_VALIDACION4 = Target.the("Tx Aprobada")
            .located(By.xpath("//div[@class='src-components-Summary-__Summary__statusMessage__Y69I7']"));

}
