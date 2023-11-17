package Reto.Tecnico.tasks;

import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DriverTask;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static Reto.Tecnico.userinterface.DatosBancoPage.*;
import static Reto.Tecnico.userinterface.IngresoPage.BTN_CONTINUAR2;

import static Reto.Tecnico.userinterface.ValidacionPage.LBL_VALIDACION2;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosNequi implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CHK_MISMONUM),
                Click.on(CHK_ACEPTO),
                Click.on(BTN_CONTINUAR2));

        }
    public static DatosNequi datos(List<Data_Test> data) {
        return instrumented(DatosNequi.class, data);
    }
}
