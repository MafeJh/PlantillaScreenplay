package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Stepdefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^the user is on the web page demoblaze$")
    public void theUserIsOnTheWebPageDemoblaze() {
        theActorCalled("Mafe").wasAbleTo(Open.url("https://www.demoblaze.com/"));
    }
}
