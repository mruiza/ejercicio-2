package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UTestData;
import co.com.choucair.certification.utest.questions.AnswerLabel;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UTestStepDefinition {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^as Pedro want to create a new account at utest page$")
    public void asPedroWantToCreateANewAccountAtUtestPage() {
        theActorCalled("Pedro").wasAbleTo(OpenBrowser.atUTestPage());
    }

    @When("^complete registration form$")
    public void completeRegistrationForm(List<UTestData> data) {
        theActorInTheSpotlight().attemptsTo(
                StartRegistration.withJoinButton(),
                UserInformation.withPersonal(data),
                SitesInformation.withAddress(data),
                GadgetInformation.withDevice(data),
                SecurityInformation.withPrivate(data)
        );
    }

    @Then("^validate label on last step of form$")
    public void validateLabelOnLastStepOfForm(List<UTestData> label) {
        theActorInTheSpotlight().should(seeThat(AnswerLabel.onLastStep(label)));
    }
}
