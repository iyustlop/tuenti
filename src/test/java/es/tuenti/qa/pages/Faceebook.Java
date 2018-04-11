package es.tuenti.qa.pages;

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

  public void setPhoneAndPassword() {
      driver.findElement(userFacebookField).sendKeys(user);
      driver.findElement(passwordFacebookField).sendKeys(password);
  }
}
