package stepdefinition;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import managers.FileReaderManager;
import org.apache.log4j.Logger;
import pageobjects.CheckoutPage;
import testdatatypes.Customer;

public class CheckoutPageSteps {

    private CheckoutPage checkoutPage;
    private TestContext testContext;
    private final static Logger logger = Logger.getLogger(CheckoutPageSteps.class);

    public CheckoutPageSteps(TestContext context) {
        testContext = context;
        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
    }

    @And("^User clicks on buy$")
    public void userClicksOnBuy() {
        checkoutPage.clickBuyButton();
    }

    @And("^User adds \"([^\"]*)\" address information$")
    public void userAddsAddressInformation(String streetName) {
        logger.info("Adding address information");
        Customer domicilio = FileReaderManager.getInstance().getJsonReader().getDomiciliobyStreet(streetName);
        checkoutPage.addMyAddress();
        checkoutPage.fillAddressInformation(domicilio);
    }

    @And("^User selects shipping address$")
    public void userSelectsShippingAddress() {
        checkoutPage.selectShippingAddress();
    }

    @And("^User selects payment method$")
    public void userSelectsPaymentMethod() {
        checkoutPage.selectPaymentMethod();
    }
}
