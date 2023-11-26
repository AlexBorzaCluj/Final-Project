import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxPage;
import pages.RadioButtonsPage;

public class RadioButtonsTests extends BasePage {

    private RadioButtonsPage radioButtonsPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonsPage = new RadioButtonsPage(driver);
    }

@Test
    public void clickOnRadioButtonsDemo () {
        radioButtonsPage.clickOnRadioButtonsDemo();

        radioButtonsPage.selectMaleRadio();
        radioButtonsPage.checkGetValue();
    String maleActualResult = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")).getText();
    Assert.assertEquals(maleActualResult, "Radio button 'Male' is checked");

}

@Test
    public void clickOnRadioButtonsGenderAndAge () {
        radioButtonsPage.clickOnRadioButtonsDemo();
        radioButtonsPage.selectMultipleSelectionGenderMaleRadio();
        radioButtonsPage.selectMultipleSelectionAge0To5Radio();
        radioButtonsPage.clickOnGetValuesButton();
        String multipleSelectionGenderResult = driver.findElement(By.cssSelector("span[class='genderbutton']")).getText();
        String multipleSelectionAgeResult = driver.findElement(By.cssSelector(".groupradiobutton")).getText();
    System.out.println(multipleSelectionGenderResult);
    System.out.println(multipleSelectionAgeResult);
        Assert.assertEquals(multipleSelectionGenderResult, "Male");
        Assert.assertEquals(multipleSelectionAgeResult, "0 - 5");
}


}
