package stepdefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageobjects.LoginPage;

import java.util.List;

public class LoginPageSteps {

    private LoginPage loginPage;
    private final static Logger logger = Logger.getLogger(LoginPageSteps.class);
    TestContext testContext;

    public LoginPageSteps(TestContext context) {
        testContext = context;
        loginPage = testContext.getPageObjectManager().getLoginPage();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() {
        logger.info("Login Successfully");
    }

    @When("^User enters Credentials to LogIn$")
    public void user_enters_testUser_and_Test(List<Credentials> userCredentials) {
        for (Credentials credentials : userCredentials) {
            loginPage.enter_username(credentials.getUsername());
            loginPage.enter_password(credentials.getPassword());
        }
    }
}
