package es.tuenti.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;
    By profilesIcon = By.cssSelector("li.c026:nth-child(6) > a:nth-child(1)");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfiles(){
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(profilesIcon).click();
    }

    public void checkName(String name) {
//        Assert.assertEquals(name,driver.findElement());
    }
}
