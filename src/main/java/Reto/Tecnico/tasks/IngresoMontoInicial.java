package Reto.Tecnico.tasks;

import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static Reto.Tecnico.userinterface.IngresoPage.BTN_CONTINUAR;
import static Reto.Tecnico.userinterface.IngresoPage.TXT_MONTO_A_PAGAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoMontoInicial implements Task {

    private String valormonto;

    public IngresoMontoInicial(List<Data_Test> data) {
        this.valormonto = data.get(0).getValormonto();
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(valormonto).into(TXT_MONTO_A_PAGAR),
                Click.on(BTN_CONTINUAR));

    }

    public static IngresoMontoInicial montoAPagar(List<Data_Test> data) {
        return instrumented(IngresoMontoInicial.class, data);
    }
}
