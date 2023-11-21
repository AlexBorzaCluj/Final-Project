package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormPage extends BasePage {

    public SimpleFormPage (WebDriver driver) {
        super(driver); //The super() function is used to give access to methods and properties of a parent or sibling class. The super() function returns an object that represents the parent class.
        PageFactory.initElements(driver, this);
        //PageFactory.initElements() static method takes the driver instance of the given class and the class type, and returns a Page Object with its fields fully initialized.
    }

    @FindBy(css = "input[placeholder='Please enter your Message']")
    private WebElement textField;

    public void enterTextInTextField(String text) {
        textField.sendKeys(text);
    }

    @FindBy(id = "showInput")
    private WebElement getCheckedValueButton;

    public void clickOnGetCheckedValueButton() {
        getCheckedValueButton.click();
    }

    @FindBy (id = "message")
    private WebElement checkMessage;
    public void checkYourMessage() {
        checkMessage.getText();
    }



    @FindBy (id = "sum1")
    private WebElement firstValueField;
    public void enterValueInFirstValueField (String x) { firstValueField.sendKeys(x); }

    @FindBy (id = "sum2")
    private WebElement secondValueField;
    public void enterValueInSecondValueField (String y) { secondValueField.sendKeys(y); }

    @FindBy (css = "#gettotal > button")
    private WebElement getSumButton;
    public void clickOnGetSumButton () { getSumButton.click(); }


}

