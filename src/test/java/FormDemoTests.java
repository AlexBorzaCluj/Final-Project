import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.FormDemoPage;

public class FormDemoTests extends BasePage {

    private FormDemoPage formDemoPage;
    private final By formDemoLink = By.linkText("Input Form Submit");

    @BeforeMethod
    public void setUp() {
        super.setUp();
        formDemoPage = new FormDemoPage(driver);
    }

    @Test
    public void inputFormValidations() {
        driver.findElement(formDemoLink).click();
        formDemoPage.enterNameInNameField("Alexandru");
        formDemoPage.enterEmailInEmailField("alexandru@gmail.com");
        formDemoPage.enterPasswordInPasswordField("alexandru#$%");
        formDemoPage.enterCompanyInCompanyField("Teximp");
        formDemoPage.enterWebsiteInWebsiteField("www.teximp.com");
        Select countrySelect = new Select(driver.findElement(By.cssSelector("#seleniumform > div:nth-child(3) > div:nth-child(1) > .w-full")));
        countrySelect.selectByVisibleText("Romania");
        formDemoPage.enterCityInCityField("Cluj-Napoca");
        formDemoPage.enterAddress1InAddress1Field("Strada Buna ziua");
        formDemoPage.enterAddress2InAddress2Field("nr.43F");
        formDemoPage.enterStateInStateField("Cluj");
        formDemoPage.enterZipInZipField("12345");
        formDemoPage.clickSubmitButton();

        String actualResult = driver.findElement(By.cssSelector(".success-msg.hidden")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));

    }
}
