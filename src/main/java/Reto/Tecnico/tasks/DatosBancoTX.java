package Reto.Tecnico.tasks;

import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import java.util.List;

import static Reto.Tecnico.userinterface.DatosBancoPage.*;
import static Reto.Tecnico.userinterface.IngresoPage.BTN_CONTINUAR;
import static Reto.Tecnico.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DatosBancoTX implements Task {
    private String tipopersona;

    private String tipotx;

    public DatosBancoTX(List<Data_Test> data) {

        this.tipopersona = data.get(0).getTipopersona();
        this.tipotx = data.get(0).getTipotx();

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (tipotx) {
            case TX_APROBADA:
                actor.attemptsTo(
                        Click.on(TX_APROBADO),
                        Click.on(TX_APROBADO2));
                break;
            case TX_DECLINADA:
                actor.attemptsTo(
                        Click.on(TX_DECLINADO));
                break;
            case TX_ERROR:
                actor.attemptsTo(
                        Click.on(TX_ERROR2));
                break;
            default:

                System.out.println("no existe");
        }

        actor.attemptsTo(
                Click.on(LBL_TIPOPERSONA),
                Click.on(LBL_TIPOPERSONA2),
                Click.on(CHK_ACEPTO),
                Click.on(BTN_CONTINUAR));
    }

    public static DatosBancoTX datos(List<Data_Test> data) {
        return instrumented(DatosBancoTX.class, data);
    }
}
