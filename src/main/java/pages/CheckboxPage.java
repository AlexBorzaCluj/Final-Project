package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage extends BasePage {

    public CheckboxPage (WebDriver driver) {
        super(driver); //The super() function is used to give access to methods and properties of a parent or sibling class. The super() function returns an object that represents the parent class.
        PageFactory.initElements(driver, this);
        //PageFactory.initElements() static method takes the driver instance of the given class and the class type, and returns a Page Object with its fields fully initialized.
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckbox;

    public void clickOnSingleCheckbox() {
        singleCheckbox.click();
    }

    @FindBy (css = "#ex1-check1")
    private WebElement multipleCheckboxOption1;

    public void clickOnMultipleCheckboxOption1() {
        multipleCheckboxOption1.click();
    }

    @FindBy (css = "#ex1-check2")
    private WebElement multipleCheckboxOption2;

    public void clickOnMultipleCheckboxOption2() {
        multipleCheckboxOption2.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[3]/input")
    private WebElement multipleCheckboxOption3;

    public void clickOnMultipleCheckboxOption3() {
        multipleCheckboxOption3.click();
    }

    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div[2]/div[1]/div[4]/input")
    private WebElement multipleCheckboxOption4;

    public void clickOnMultipleCheckboxOption4() {
        multipleCheckboxOption4.click();
    }


    @FindBy (id = "box")
    private WebElement checkAllButton;

    public void clickOnTheCheckAllButton() {
        checkAllButton.click();
    }


}
