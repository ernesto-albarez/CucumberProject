package pageobjects;

import dataproviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import testdatatypes.Customer;

public class CheckoutPage {

    public CheckoutPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id='BidButtonTop']")
    private WebElement buyButton;

    @FindBy(how = How.XPATH, using = "//*[@value='nextStepSendToMyAddress']")
    private WebElement sendToMyAdrressButton;

    @FindBy(how = How.XPATH, using = "//*[@for='contactName']")
    private WebElement nameAndLastName;

    @FindBy(how = How.XPATH, using = "//*[@for='docNumber']")
    private WebElement docNumber;

    @FindBy(how = How.XPATH, using = "//*[@for='zipCode']")
    private WebElement codigoPostal;

    @FindBy(how = How.XPATH, using = "//*[@for='city']")
    private WebElement localidad;

    @FindBy(how = How.XPATH, using = "//*[@for='street']")
    private WebElement calle;

    @FindBy(how = How.XPATH, using = "//*[@for='streetNumber']")
    private WebElement alturaCalle;

    @FindBy(how = How.XPATH, using = "//*[@for='internalNumber']")
    private WebElement pisoDepartamento;

    @FindBy(how = How.XPATH, using = "//*[@for='contactPhoneNumber']")
    private WebElement telefonoDeContacto;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement submitButton;

    @FindBy(how = How.XPATH, using = "//*[@data-js='shipping-options-group-0']//button[@type='submit']")
    private WebElement rapidoDomicilio;

    @FindBy(how = How.XPATH, using = "//ul[@class='badge-type-selection__list']/li[3]//button")
    private WebElement paymentMethodButton;

    @FindBy(how = How.XPATH, using = "//button[@data-id='payment-method-pagofacil']")
    private WebElement paymenTypeButton;

    public void clickBuyButton(){
        buyButton.click();
    }

    public void addMyAddress(){
        sendToMyAdrressButton.click();
    }

    public void fillAddressInformation(Customer customerAddress){
        nameAndLastName.clear();
        nameAndLastName.sendKeys(customerAddress.getDomicilioDeFacturaccion().getNombreApellido());

        codigoPostal.clear();
        codigoPostal.sendKeys(customerAddress.getDomicilioDeFacturaccion().getCodigoPostal());

        localidad.clear();
        localidad.sendKeys(customerAddress.getDomicilioDeFacturaccion().getLocalidadBarrio());

        calle.clear();
        calle.sendKeys(customerAddress.getDomicilioDeFacturaccion().getCalle());

        alturaCalle.clear();
        alturaCalle.sendKeys(customerAddress.getDomicilioDeFacturaccion().getNumero());

        pisoDepartamento.clear();
        pisoDepartamento.sendKeys(customerAddress.getDomicilioDeFacturaccion().getPisoDepartamento());

        telefonoDeContacto.clear();
        telefonoDeContacto.sendKeys(customerAddress.getDomicilioDeFacturaccion().getTelefonoDeContacto());

        submitButton.click();
    }

    public void selectShippingAddress() {
        rapidoDomicilio.click();
    }

    public void selectPaymentMethod() {
        paymentMethodButton.click();
        paymenTypeButton.click();

        docNumber.clear();
        docNumber.sendKeys("134532563");
    }
}
