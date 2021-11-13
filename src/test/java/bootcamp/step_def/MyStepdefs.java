package bootcamp.step_def;

import bootcamp.pages.Homepage;
import bootcamp.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
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

    @When("I search for {string}")
    public void iSearchFor(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @Then("search result should be seen")
    public void searchResultShouldBeSeen() {
        searchResultPage.verifySearchResult();

    }
}
