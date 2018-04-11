package es.tuenti.qa.pages;

public class Twitter {
  By userTwitterField = By.id("user");
  By passwordTwitterField = By.id("password");
  private String user;
  private String password;
  WebDriver driver;

  public Twitter(WebDriver driver, String user, String password) {
      this.driver = driver;
      this.user = user;
      this.password = password;
  }

  public void setPhoneAndPassword() {
      driver.findElement(userTwitterField).sendKeys(user);
      driver.findElement(passwordTwitterField).sendKeys(password);
  }
}
