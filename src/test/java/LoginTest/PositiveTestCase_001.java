package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTestCase_001 extends BaseClass{



    @Test(priority = 1)
    public void login()
    {   driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("student");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();
    }

    @Test(priority = 2)
    public void logoutButtonVerification()
    {
        WebElement logoutbtn = driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
        Assert.assertTrue(logoutbtn.isDisplayed(),"logo displayed on the new page");
    }

    @Test(priority = 3)
    public void titleVerification()
    {
        System.out.println(driver.getTitle());
        if (driver.getPageSource().contains("Logged In Successfully"))
        {
            System.out.println("Expected text of LOGGED IN SUCCESSFULLY is verified");
        }
        else {
            System.out.println("Expected text of LOGGED IN SUCCESSFULLY is not verified");
        }
    }
    @Test(priority = 4)
    public void Verification()
    {driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        if (driver.getCurrentUrl().equals("https://practicetestautomation.com/logged-in-successfully/"))
        {
            System.out.println("current url is verified");
        }
        else {
            System.out.println("current url is not verified");
        }
    }
}
