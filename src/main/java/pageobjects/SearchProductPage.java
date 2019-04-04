package pageobjects;

import dataproviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchProductPage {

    public SearchProductPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@class='nav-search-input']")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//*[@class='nav-icon-search']")
    private WebElement lookupButton;

    @FindBy(how = How.XPATH, using = "//*[@id='searchResults']/li[1]//*[@class='main-title']")
    private WebElement foundProduct;

    public void searchProduct(String product_name){
        searchBox.clear();
        searchBox.sendKeys(product_name);
        lookupButton.click();
    }

    public void openProductProfile(){
        foundProduct.click();
    }
}
