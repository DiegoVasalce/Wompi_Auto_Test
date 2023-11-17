package Reto.Tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosUsuarioPage {
    public static final Target TXT_CORREO = Target.the("Campo Correo")
            .located(By.id("email"));
    public static final Target TXT_NOMB_Y_APELL = Target.the("Campo Nombres y apellidos")
            .located(By.id("fullName"));
    public static final Target TXT_CELULAR = Target.the("Campo Celular")
            .located(By.id("number"));
    public static final Target BTN_CONTINUAR2 = Target.the("Botón Continuar")
            .located(By.xpath("//span[@class='src-components-CustomerData-__CustomerData__boxButton__VMGvU']"));
}
