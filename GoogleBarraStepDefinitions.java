package com.bank.steps;

import com.google.Tasks.IngresoDatosBusquedaGoogle;
import com.google.userinterface.GoogleHome;
import com.google.userinterface.GoogleSchear;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class GoogleBarraStepDefinitions {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("^Ingresa a la pagina y visualiza la barra$")
    public void ingresaALaPagina() {
        theActorCalled("usuario").wasAbleTo((Open.browserOn(new GoogleHome())));
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^realiza una busqueda \"([^\"]*)\"$")
    public void realizaUnaBusqueda(String datos) {
        theActorInTheSpotlight().attemptsTo(IngresoDatosBusquedaGoogle.realizaBusqueda(datos));
        // Write code here that turns the phrase above into concrete actions

    }


    @When("^realiza cualquier busqueda$")
    public void realizaCualquierBusqueda() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(IngresoDatosBusquedaGoogle.realizaBusqueda("cualquiercosa"));

    }


    @When("^realiza una busqueda erronea$")
    public void realizaUnaBusquedaErronea() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().attemptsTo(IngresoDatosBusquedaGoogle.realizaBusqueda("asdasdkjljfsodjf"));

    }

    @Then("^vizualiza la cantidad de resustaldos y el enlace a herramienta$")
    public void vizualizaLaCantidadDeResustaldosYElEnlaceAHerramienta() {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GoogleSchear.RESULTADOS),
                WebElementStateMatchers.isVisible()));

    }

    @Then("^valida el tiempo que tardo la busqueda y el enlace a herramienta$")
    public void validaElTiempoQueTardoLaBusquedaYElEnlaceAHerramienta() {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GoogleSchear.RESULTADOS),
                WebElementStateMatchers.isVisible()));

    }

    @Then("^vizualiza mensaje de error y el enlace a herramienta$")
    public void vizualizaMensajeDeErrorYElEnlaceAHerramienta() {
        theActorInTheSpotlight().should(seeThat(WebElementQuestion.the(GoogleSchear.NO_ENCONTRADO),
                WebElementStateMatchers.isVisible()));

    }

}
