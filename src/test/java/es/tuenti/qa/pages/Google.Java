package es.tuenti.qa.pages;

public class Google {

  By userGoogleField = By.id("user");
  By passwordGoogleField = By.id("password");
  private String user;
  private String password;
  WebDriver driver;

  public Google(WebDriver driver, String user, String password) {
      this.driver = driver;
      this.user = user;
      this.password = password;
  }

  public void setPhoneAndPassword() {
      driver.findElement(userGoogleField).sendKeys(user);
      driver.findElement(passwordGoogleField).sendKeys(password);
  }
}
