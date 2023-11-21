package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class BasePage {
    public static WebDriver driver;
    private String BASE_URL = "https://www.lambdatest.com/selenium-playground/";

    public BasePage () {
        // Default constructor
    }

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    @BeforeClass

    public void setUp() {
        WebDriverManager.chromedriver().setup(); //checks for the latest version of the specified WebDriver binary. If the binaries are not present on the machine, then it will download the WebDriver binaries. Next, it instantiates the Selenium WebDriver instance with the ChromeDriver.
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //face full screen
        driver.get(BASE_URL);
    }



    @AfterMethod
    //folosim @AfterMethod daca vrem
    // sa inchidem browserul dupa fiecare test case in parte
    public void tearDown() {
        if (driver != null) {
            driver.quit();
}}}

