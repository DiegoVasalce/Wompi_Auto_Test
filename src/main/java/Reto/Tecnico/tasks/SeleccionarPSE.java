package Reto.Tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static Reto.Tecnico.userinterface.MediosPage.BTN_PSE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarPSE implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_PSE));

    }
    public static SeleccionarPSE medio() {
        return instrumented(SeleccionarPSE.class);
    }
}
