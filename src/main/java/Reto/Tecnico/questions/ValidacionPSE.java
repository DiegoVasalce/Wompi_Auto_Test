package Reto.Tecnico.questions;

import Reto.Tecnico.interactions.TakeScreenshot;
import Reto.Tecnico.models.Data_Test;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static Reto.Tecnico.userinterface.ValidacionPage.*;

public class ValidacionPSE implements Question<Boolean> {
    private Data_Test validacion;

    public ValidacionPSE(Data_Test validacion){this.validacion=validacion; }

    public static ValidacionPSE aprobado(Data_Test validacion){return new ValidacionPSE((validacion));}


    @Override
    public Boolean answeredBy(Actor actor) {

        actor.attemptsTo(
                WaitUntil.the(LBL_VALIDACION2, WebElementStateMatchers.isVisible()).forNoMoreThan(360).seconds(),
                TakeScreenshot.asEvidence());

                if (LBL_VALIDACION3.resolveFor(actor).isVisible()) {
                    return Text.of(LBL_VALIDACION4).viewedBy(actor).asString().contains(validacion.getValidacion());
                }
                else {
                    return Text.of(LBL_VALIDACION).viewedBy(actor).asString().contains(validacion.getValidacion());
                }
    }
}
