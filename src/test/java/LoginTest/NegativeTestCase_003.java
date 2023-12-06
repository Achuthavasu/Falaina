package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NegativeTestCase_003 extends BaseClass {
    @Test(priority = 1)
    public void login()
    {   driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("student");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("incorrectPassword");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

    @Test(priority = 2)
    public void errorMessageVerification()
    {
        WebElement error = driver.findElement(By.xpath("//div[@id='error']"));
        if(error.isDisplayed())
        {
            System.out.println("Error message is displayed as Your password is invalid!");
        }
        else{
            System.out.println("Error message is not displayed as Your password is invalid!");
        }
    }

}
