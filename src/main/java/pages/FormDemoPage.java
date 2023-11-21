package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormDemoPage extends BasePage {
    public FormDemoPage (WebDriver driver) {
        super (driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "name")
    private WebElement nameField;

    public void enterNameInNameField (String name) { nameField.sendKeys(name); }


    @FindBy (id = "inputEmail4")
    private WebElement emailField;

    public void enterEmailInEmailField (String email) { emailField.sendKeys(email);}


    @FindBy (id = "inputPassword4")
    private WebElement passwordField;

    public void enterPasswordInPasswordField (String password) { passwordField.sendKeys(password);}


    @FindBy (id = "company")
    private WebElement companyField;

    public void enterCompanyInCompanyField (String company) {companyField.sendKeys(company);}


    @FindBy (id ="websitename")
    private WebElement websiteField;

    public void enterWebsiteInWebsiteField (String website) {websiteField.sendKeys(website);}


    @FindBy (id = "inputCity")
    private WebElement cityField;

    public void enterCityInCityField (String city) {cityField.sendKeys(city);}


    @FindBy (id = "inputAddress1")
    private WebElement address1Field;

    public void enterAddress1InAddress1Field (String address1) {address1Field.sendKeys(address1);}


    @FindBy (id = "inputAddress2")
    private WebElement address2Field;

    public void enterAddress2InAddress2Field (String address2) {address2Field.sendKeys(address2);}


    @FindBy (id = "inputState")
    private WebElement stateField;

    public void enterStateInStateField (String state) {stateField.sendKeys(state);}


    @FindBy (id = "inputZip")
    private WebElement zipField;

    public void enterZipInZipField (String zip) {zipField.sendKeys(zip);}


    @FindBy (css = "#seleniumform > .text-right > button")
    private WebElement submitButton;

    public void clickSubmitButton () {submitButton.click();}


















}
