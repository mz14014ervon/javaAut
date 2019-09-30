package step_def;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleSteps {
    @Given("environment is ready")
    public void iHaveStartedBrowser() {
        System.out.println("READY");
    }

    @When("I navigate to homepage")
    public void iNavigateToHomepage() {
        System.out.println("nav to page home");
    }


    @Then("homepage is opened")
    public void homepageIsOpened() {
        System.out.println("verif homepage openn");
    }

    @And("close browser")
    public void closeBrowser() {
        System.out.println("Close browse");
    }
}
