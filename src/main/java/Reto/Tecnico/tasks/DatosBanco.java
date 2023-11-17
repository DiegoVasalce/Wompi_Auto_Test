package Reto.Tecnico.tasks;

import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static Reto.Tecnico.userinterface.DatosBancoPage.*;
import static Reto.Tecnico.userinterface.IngresoPage.BTN_CONTINUAR;
import static Reto.Tecnico.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosBanco implements Task {
    private String tipobanco;
    private String numdoc;

    public DatosBanco(List<Data_Test> data) {

        this.tipobanco = data.get(0).getTipobanco();
        this.numdoc = data.get(0).getNumdoc();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (tipobanco) {
            case OP_APROBADO:
                actor.attemptsTo(
                        Click.on(OPT_APROBADO));
                break;
            case OP_DECLINADO:
                actor.attemptsTo(
                        Click.on(OPT_DECLINADO));
                break;
            case OP_ERROR:
                actor.attemptsTo(
                        Click.on(OPT_ERROR));
                break;
            default:

                System.out.println("no existe");
        }
        actor.attemptsTo(Click.on(DRP_LST_TIPO_DOCUMENTO),
                Click.on(OPT_TIPO_DOCUMENTO),
                Enter.theValue(numdoc).into(TXT_NUM_DOC),
                Click.on(CHK_ACEPTO),
                Click.on(BTN_CONTINUAR));

    }

    public static DatosBanco datos(List<Data_Test> data) {
        return instrumented(DatosBanco.class, data);
    }
}
