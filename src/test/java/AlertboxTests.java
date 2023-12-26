import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertboxPage;
import pages.BasePage;
import pages.CheckboxPage;
import pages.RadioButtonsPage;
import java.util.concurrent.TimeUnit;


public class AlertboxTests extends BasePage {

    private AlertboxPage alertboxPage;

    @BeforeMethod
    public void setUp () {
        super.setUp();
        alertboxPage = new AlertboxPage(driver);
    }


    @Test
public void checkTheConfirmBoxAlertModal () {
        alertboxPage.clickOnJavaScriptAlertsLink();
        alertboxPage.clickConfirmBox();
    }

}
