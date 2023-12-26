import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxPage;
import pages.FormDemoPage;

public class CheckboxTests extends BasePage {

    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
        //testbranch
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() {
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnSingleCheckbox();

        String actualResult = driver.findElement(By.cssSelector("#txtAge")).getText();
        Assert.assertEquals(actualResult, "Checked");
    }

    @Test
public void clickOnTheMultipleCheckboxButton() {
        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxPage.clickOnTheCheckAllButton();
        String actualResult = driver.findElement(By.id("box")).getAccessibleName();
        System.out.println(actualResult);
Assert.assertEquals(actualResult, "Uncheck All");
    }
}
