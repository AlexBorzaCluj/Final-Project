package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsPage extends BasePage {

    public RadioButtonsPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Radio Buttons Demo")
    private WebElement radioButtonsDemoLink;

    public void clickOnRadioButtonsDemo() {
        radioButtonsDemoLink.click();
    }


    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]/input")
    private WebElement maleRadio;

    public void selectMaleRadio () {
        maleRadio.click();
    }


    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]/input")
    private WebElement femaleRadio;

    public void selectFemaleRadio () {
        femaleRadio.click();
    }


    @FindBy (css = "#buttoncheck")
    private WebElement getValue;

    public void checkGetValue () {
        getValue.click();
    }


    @FindBy (css = "input[value='Male'][name='gender']")
    private WebElement multipleSelectionGenderMaleRadio;

    public void selectMultipleSelectionGenderMaleRadio() {
        multipleSelectionGenderMaleRadio.click();
    }

    @FindBy (css = "input[value='0 - 5']")
    private WebElement multipleSelectionAge0To5Radio;

    public void selectMultipleSelectionAge0To5Radio () {
        multipleSelectionAge0To5Radio.click();
    }


    @FindBy (xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[3]/div/div/div[1]/button")
    private WebElement getValuesButton;

    public void clickOnGetValuesButton () {
        getValuesButton.click();
    }



}
