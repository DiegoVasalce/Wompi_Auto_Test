package Reto.Tecnico.stepdefinitions;

import Reto.Tecnico.models.Data_Test;
import Reto.Tecnico.questions.ValidacionPSE;
import Reto.Tecnico.tasks.*;
import Reto.Tecnico.utils.Constantes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TRANSStepDefinitions {

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Diego");
    }
    @Given("^que el usuario ingresa a la pagina Wompi registrando valor inicial tx$")
    public void queElUsuarioIngresaALaPaginaWompiRegistrandoValorInicialTx(List<Data_Test> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url(Constantes.URL_HOME));
        OnStage.theActorInTheSpotlight().attemptsTo(IngresoMontoInicial.montoAPagar(data));
    }
    @When("^el usuario Selecciona metodo de pago e ingresa datos transferencia$")
    public void elUsuarioSeleccionaMetodoDePagoEIngresaDatosTransferencia(List<Data_Test> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarTRANSFER.medio());
        OnStage.theActorInTheSpotlight().attemptsTo(DatosUsuario.datos(data));
        OnStage.theActorInTheSpotlight().attemptsTo(DatosBancoTX.datos(data));

    }
    @Then("^el usuario vera el siguiente mensaje tx$")
    public void ElUsuarioVeraElSiguienteMensajeTx(List<Data_Test> validacion) {
        theActorInTheSpotlight().should(seeThat(ValidacionPSE.aprobado(validacion.get(0))));
    }
}
