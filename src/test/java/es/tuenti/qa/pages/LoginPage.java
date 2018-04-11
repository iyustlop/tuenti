package es.tuenti.qa.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    private String phone;
    private String password;

    public LoginPage(WebDriver driver, String phone, String password) {
        this.driver = driver;
        this.phone = phone;
        this.password = password;
    }

    private void setPhoneAndPassword(){

    }
}
