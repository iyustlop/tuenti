package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook {


    By userFacebookField = By.id("user");
    By passwordFacebookField = By.id("password");
    private String user;
    private String password;
    WebDriver driver;
    public Facebook(WebDriver driver, String user, String password) {
        this.driver = driver;
        this.user = user;
        this.password = password;
    }

    public void setFacebookAndPassword() {
        driver.findElement(userFacebookField).sendKeys(user);
        driver.findElement(passwordFacebookField).sendKeys(password);
    }
}
