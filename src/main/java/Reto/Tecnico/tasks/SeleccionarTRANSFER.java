package Reto.Tecnico.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static Reto.Tecnico.userinterface.MediosPage.BTN_TRANSFER;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTRANSFER implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TRANSFER));

    }
    public static SeleccionarTRANSFER medio() {
        return instrumented(SeleccionarTRANSFER.class);
    }
}
