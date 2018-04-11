package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Google {
    By userGoogleField = By.id("user");
    By nextButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/content");
    By nextFinishButton = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/div[2]");
    By passwordGoogleField = By.id("password");
    WebDriver driver;
    private String user;
    private String password;
    public Google(WebDriver driver, String user, String password) {
        this.driver = driver;
        this.user = user;
        this.password = password;
    }

    public void setGoogleAndPassword() {
        driver.findElement(userGoogleField).sendKeys(user);
        driver.findElement(nextButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(passwordGoogleField).sendKeys(password);
        driver.findElement(nextFinishButton).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
