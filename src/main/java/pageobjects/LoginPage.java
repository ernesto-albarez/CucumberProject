package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import dataproviders.ConfigFileReader;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "user_id")
    private WebElement usernameField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@type='submit']")
    private WebElement submitUsernameButton;

    @FindBy(how = How.ID, using = "action-complete")
    private WebElement submitPasswordButton;

    public void enter_username(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
        submitUsernameButton.click();
    }

    public void enter_password(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        submitPasswordButton.click();
    }
}
