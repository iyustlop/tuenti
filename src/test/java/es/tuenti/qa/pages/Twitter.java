package es.tuenti.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Twitter {
  By userTwitterField = By.id("username_or_email");
  By passwordTwitterField = By.id("password");
  private String user;
  private String password;
  WebDriver driver;

  public Twitter(WebDriver driver, String user, String password) {
      this.driver = driver;
      this.user = user;
      this.password = password;
  }

  public void setTwitterPhoneAndPassword() {
      driver.findElement(userTwitterField).sendKeys(user);
      driver.findElement(passwordTwitterField).sendKeys(password);
  }
}
