package stepdefinition;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import pageobjects.SearchProductPage;

import java.util.List;

public class SearchProductPageSteps {

    private SearchProductPage searchProductPage;
    private TestContext testContext;
    private final static Logger logger = Logger.getLogger(SearchProductPageSteps.class);

    public SearchProductPageSteps(TestContext context) {
        testContext = context;
        searchProductPage = testContext.getPageObjectManager().getSearchProductPage();
    }

    @When("^User searches for a product$")
    public void user_searches_for_Products(List<Products> searchProducts) {
        for (Products products : searchProducts) {
            searchProductPage.searchProduct(products.getProduct());
        }
    }

    @Then("^The result list is displayed$")
    public void the_result_list_is_displayed() {
        logger.info("SearchResults are displayed Successfully");
    }

    @When("^User select product profile$")
    public void user_select_the_firs_product() {
        searchProductPage.openProductProfile();
    }

    @Then("^Product profile is displayed$")
    public void product_profile_is_displayed() {
        logger.info("Product profile is displayed Successfully");
    }
}
