package bootcamp.step_def;

import bootcamp.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Homepage homepage = new Homepage();

    @Given("homepage is open")
    public void homepageIsOpen() {
        homepage.chooseUS();
    }

    @When("I close the pop up")
    public void iCloseThePopUp() {

        homepage.closePopup();
    }

    @Then("logo should be displayed")
    public void logoShouldBeDisplayed() {
        homepage.verifyLogo();
    }
}
