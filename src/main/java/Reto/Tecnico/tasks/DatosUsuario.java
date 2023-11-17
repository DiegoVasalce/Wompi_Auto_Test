package Reto.Tecnico.tasks;

import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static Reto.Tecnico.userinterface.DatosUsuarioPage.*;
import static Reto.Tecnico.userinterface.IngresoPage.BTN_CONTINUAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosUsuario implements Task {

    private String correo;
    private String nombresyapellidos;
    private String cel;


    public DatosUsuario(List<Data_Test> data) {

        this.correo = data.get(0).getCorreo();
        this.nombresyapellidos = data.get(0).getNombresyapellidos();
        this.cel = data.get(0).getCel();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(correo).into(TXT_CORREO),
                Enter.theValue(nombresyapellidos).into(TXT_NOMB_Y_APELL),
                Enter.theValue(cel).into(TXT_CELULAR),
                Click.on(BTN_CONTINUAR2)
        );

    }
    public static DatosUsuario datos(List<Data_Test> data) {
        return instrumented(DatosUsuario.class, data);
    }
}
