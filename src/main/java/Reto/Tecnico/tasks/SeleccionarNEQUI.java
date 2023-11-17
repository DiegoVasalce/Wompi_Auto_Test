package Reto.Tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static Reto.Tecnico.userinterface.MediosPage.BTN_NEQUI;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarNEQUI implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEQUI));

    }
    public static SeleccionarNEQUI medio() {
        return instrumented(SeleccionarNEQUI.class);
    }
}
