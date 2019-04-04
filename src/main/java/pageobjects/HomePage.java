package pageobjects;

import dataproviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private ConfigFileReader configFileReader;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        configFileReader= new ConfigFileReader();
    }

    @FindBy(how = How.XPATH, using = "//*[@class='option-login']")
    private WebElement loginLink;

    @FindBy(how = How.XPATH, using = "//*[@class='nav-header-username']")
    private WebElement usernameHeader;

    @FindBy(how = How.XPATH, using = "//*[@data-id='logout']")
    private WebElement logoutButton;

    public void navigateToHomePage() {
        driver.get(configFileReader.getApplicationUrl());
    }

    public void goToLoginPage(){
        loginLink.click();
    }

    public void logoutPage(){
        usernameHeader.click();
        logoutButton.click();
    }
}
