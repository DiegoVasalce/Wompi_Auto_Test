package Reto.Tecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosBancoPage {

    public static final Target OPT_APROBADO = Target.the("Opcion que aprueba")
            .located(By.xpath("//*[contains(text(),'Banco que aprueba')]"));
    public static final Target OPT_DECLINADO = Target.the("Opcion que declina")
            .located(By.xpath("//*[contains(text(),'Banco que declina')]"));
    public static final Target OPT_ERROR = Target.the("Opcion de error")
            .located(By.xpath("//*[contains(text(),'Banco que simula un error')]"));
    public static final Target DRP_LST_TIPO_DOCUMENTO = Target.the("Desplegable Tipo de documento")
            .located(By.id("userLegalIdType"));
    public static final Target OPT_TIPO_DOCUMENTO = Target.the("Desplegable Tipo de documento")
            .located(By.xpath("//*[contains(text(),'CC')]"));
    public static final Target TXT_NUM_DOC = Target.the("Campo Numero de documento")
            .located(By.id("userLegalId"));
    public static final Target CHK_ACEPTO = Target.the("Check Acepto haber leido los reglamentos")
            .located(By.id("acceptance"));
    public static final Target CHK_MISMONUM = Target.the("Check Acepto haber leido los reglamentos")
            .located(By.id("phoneNumber"));
    public static final Target LBL_TIPOPERSONA = Target.the("Check Acepto haber leido los reglamentos")
            .located(By.xpath("//select[@id='userType']"));
    public static final Target LBL_TIPOPERSONA2 = Target.the("Check Acepto haber leido los reglamentos")
            .located(By.xpath("//*[contains(text(),'Persona natural')]"));
    public static final Target TX_APROBADO = Target.the("Transaccion Aprobada")
            .located(By.xpath("//select[@id='sandboxStatus']"));
    public static final Target TX_APROBADO2 = Target.the("Transaccion Aprobada")
            .located(By.xpath("//*[contains(text(),'APROBADA')]"));
    public static final Target TX_DECLINADO = Target.the("Transaccion Declinada")
            .located(By.xpath("//*[contains(text(),'DECLINADA')]"));
    public static final Target TX_ERROR2 = Target.the("Transaccion Error")
            .located(By.xpath("//*[contains(text(),'ERROR')]"));


}
