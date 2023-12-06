package LoginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public void browserSetup()
    {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

    }
    @AfterClass
    public void teardown()
    {
        driver.quit();
    }

}
