package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By userField = By.id("user");
    By passwordField = By.id("password");
    By submitButton = By.id("submit");
    By googleIcon = By.CssSelector("ul.global-sign__social li:nth-child(2)");
    By facebookIcon = By.CssSelector("ul.global-sign__social li:nth-child(1)");
    By twitterIcon = By.CssSelector("ul.global-sign__social li:nth-child(3)");

    private String user;
    private String password;

    Google google;
    Twitter twitter;
    Facebook facebook;

    public LoginPage(WebDriver driver, String user, String password) {
        this.driver = driver;
        this.user = user;
        this.password = password;
    }

    public void setPhoneAndPassword() {
        driver.findElement(userField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickAccessButton() {
        driver.findElement(submitButton).click();
    }

    public void clickGoogleIcon(){
        driver.findElement(googleIcon).click();
    }

    public void clickFacebookIcon(){
        driver.findElement(facebookIcon).click();
    }

    public void clickTwitterIcon(){
        driver.findElement(twitterIcon).click();
    }

    public void setGoogleAndPassword() {
        google = new Google(driver,user,password);
        google.setGoogleAndPassword();
    }

    public void setFacebookAndPassword() {
      facebook = new Facebook(driver,user,password);
      facebook.setFacebookAndPassword();
    }

    public void setTwitterAndPassword() {
      twitter = new Twitter(driver,user,password);
      twitter.setTwitterAndPassword();
    }
}
