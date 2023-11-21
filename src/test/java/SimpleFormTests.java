import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;

import java.sql.SQLOutput;

public class SimpleFormTests extends BasePage {

    private SimpleFormPage simpleFormPage; // alias

    private final By simpleFormDemoLink = By.linkText("Simple Form Demo");


    @BeforeMethod
    public void setUp() { // actiunea
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }


    @Test
    public void enterMessageAndClickGetCheckedValue() { // actiunea
        driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
        simpleFormPage.enterTextInTextField("Test");
        simpleFormPage.clickOnGetCheckedValueButton();

        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("Test"));
    }

//1. caractere speciale

    @Test
    public void enterMessageAndClickGetCheckedValue1() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("@#");
        simpleFormPage.clickOnGetCheckedValueButton();
        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("@#"));
    }

//2. cifre

    @Test
    public void enterMessageAndClickGetCheckedValue2() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField("12");
        simpleFormPage.clickOnGetCheckedValueButton();
        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains("12"));
    }

    //3. spatii

    @Test
    public void enterMessageAndClickGetCheckedValue3() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterTextInTextField(" ");
        simpleFormPage.clickOnGetCheckedValueButton();
        String actualResult = driver.findElement(By.id("message")).getText();
        Assert.assertTrue(actualResult.contains(""));
    }

    @Test
    public void enterTwoValuesAndClickGetSumValue() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstValueField("1");
        simpleFormPage.enterValueInSecondValueField("2");
        simpleFormPage.clickOnGetSumButton();

        String actualSum = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualSum);
        Assert.assertTrue(actualSum.contains("3"));
    }

    //caractere speciale
    @Test
    public void enterTwoValuesAndClickGetSumValue_1() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstValueField("#");
        simpleFormPage.enterValueInSecondValueField("$");
        simpleFormPage.clickOnGetSumButton();

        String actualSum = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualSum);
        Assert.assertTrue(actualSum.contains("Entered value is not a number"));
    }

    @Test
    public void enterTwoValuesAndClickGetSumValue_2() {
        driver.findElement(simpleFormDemoLink).click();
        simpleFormPage.enterValueInFirstValueField(" ");
        simpleFormPage.enterValueInSecondValueField(" ");
        simpleFormPage.clickOnGetSumButton();

        String actualSum = driver.findElement(By.id("addmessage")).getText();
        System.out.println(actualSum);
        Assert.assertTrue((actualSum.contains("Entered value is not a number")));
    }
}

