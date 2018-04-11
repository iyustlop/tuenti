package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By userField = By.id("user");
    By passwordField = By.id("password");
    By submitButton = By.id("submit");
    private String phone;
    private String password;

    public LoginPage(WebDriver driver, String phone, String password) {
        this.driver = driver;
        this.phone = phone;
        this.password = password;
    }

    public void setPhoneAndPassword() {
        driver.findElement(userField).sendKeys(phone);
        driver.findElement(passwordField).sendKeys(password);

    }

    public void clickAccessButton() {
        driver.findElement(submitButton).click();
    }
}
