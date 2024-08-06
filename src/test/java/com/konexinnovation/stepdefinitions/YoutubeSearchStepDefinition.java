package com.konexinnovation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.konexinnovation.questions.YoutubeForm.youtubeForm;
import static com.konexinnovation.tasks.BrowseToYoutube.browseToYoutube;
import static com.konexinnovation.tasks.OpenLandingPage.openLandingPage;
import static com.konexinnovation.util.ValidationNames.SONGNAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class YoutubeSearchStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Daniel";

    @Given("estando en la pagina principal de Youtube")
    public void estandoEnLaPaginaPrincipalDeYoutube() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(openLandingPage());
    }

    @When("se realiza la busqueda de la canción Locked out of heaven")
    public void seRealizaLaBusquedaDeLaCanciónLockedOutOfHeaven() {
        theActorInTheSpotlight().attemptsTo(browseToYoutube().setCancion(SONGNAME));
    }

    @Then("se reproduce la canción en Youtube")
    public void seReproduceLaCanciónEnYoutube() {
        theActorInTheSpotlight().should(seeThat(youtubeForm()));
    }
}
