package es.tuenti.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    By userField = By.id("user");
    By passwordField = By.id("password");
    By submitButton = By.id("submit");
    By errorMessage = By.cssSelector("#errorMessage");
    By googleIcon = By.cssSelector("ul.global-sign__social li:nth-child(2)");
    By facebookIcon = By.cssSelector("ul.global-sign__social li:nth-child(1)");
    By twitterIcon = By.cssSelector("ul.global-sign__social li:nth-child(3)");
    private String user;
    private String password;

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

    public void clickGoogleIcon() {
        driver.findElement(googleIcon).click();
    }

    public void clickFacebookIcon() {
        driver.findElement(facebookIcon).click();
    }

    public void clickTwitterIcon() {
        driver.findElement(twitterIcon).click();
    }

    public void setGoogleAndPassword() {
        Google google = new Google(driver,user,password);
        google.setGoogleAndPassword();
    }

    public void setFacebookAndPassword() {
        Facebook facebook = new Facebook(driver,user,password);
        facebook.setFacebookAndPassword();
    }

    public void setTwitterAndPassword() {
        Twitter twitter = new Twitter(driver, user, password);
        twitter.setTwitterPhoneAndPassword();
    }

    public void checkErrorMessage(String message){
        String messageRecovered = driver.findElement(errorMessage).getText();
        Assert.assertEquals(message,messageRecovered);
    }
}
