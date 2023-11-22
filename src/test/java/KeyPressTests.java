
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.KeyPressPage;

public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press"); // Define the constant locator

    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);}


    @Description("Write a letter and check the result")
    @Test

    public void writeALetterAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");

        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(actualResult, "You entered: T");}


    @Description ("Press Shift and check the result")
    @Test

    public void pressShiftAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInShiftKey();
        String actualResult = driver.findElement(By.id("result")).getText();
    Assert.assertEquals(actualResult, "You entered: SHIFT");
    }

}
