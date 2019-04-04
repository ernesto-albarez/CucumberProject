package stepdefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageobjects.HomePage;

public class HomePageSteps {

    private HomePage homePage;
    private TestContext testContext;
    private final static Logger logger = Logger.getLogger(HomePageSteps.class);

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        homePage.navigateToHomePage();
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() {
        homePage.goToLoginPage();
    }

    @When("^User LogOut from the Application$")
    public void user_LogOut_from_the_Application() {
        homePage.logoutPage();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void message_displayed_LogOut_Successfully() {
        logger.info("LogOut Successfully");
    }
}
