package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertboxPage extends BasePage{

    public AlertboxPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Javascript Alerts")
    private WebElement javaScriptAlertsLink;

    public void clickOnJavaScriptAlertsLink() {
        javaScriptAlertsLink.click();
    }

    @FindBy (css = "#__next > section.mt-50 > div > div > div > div:nth-child(2) > div > p.text-gray-900.text-size-16.mt-10.text-black.font-bold > button")
    private WebElement confirmBox;

    public void clickConfirmBox() {
        confirmBox.click();
    }

}
