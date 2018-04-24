package es.tuenti.qa.test;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import es.tuenti.qa.pages.HomePage;
import es.tuenti.qa.pages.LoginPage;
import es.tuenti.qa.pages.TuentiPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.security.util.PendingException;

import java.util.concurrent.TimeUnit;

public class SeleniumSteps implements En {

    private static final String GECKO_DRIVER = "src/test/resources/driver/geckodriver";
    private static final String URL = "http://www.tuenti.es";
    WebDriver driver;
    TuentiPage tuentiPage;
    LoginPage loginPage;
    HomePage homePage;
    private String phoneNumber;
    private String password;
    private String userGoogleEmail;
    private String userTwitterEmail;
    private String userFaceBookEmail;


    public SeleniumSteps() {

        Before((Scenario scenario) -> {
            System.setProperty("webdriver.gecko.driver", GECKO_DRIVER);
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        });

        Given("^Having a correct phone number$", () -> phoneNumber = "684262289");

        Given("^Having a correct password$", () -> password = "testtest");

        Given("^Having a valid Google user email$", () -> userGoogleEmail = "ops_internacional+24@tuenti.com");

        Given("^Having a valid Google password$", () -> password = "testtest");

        Given("^Having a valid Facebook user$", () -> userFaceBookEmail = "ops_internacional+24@tuenti.com");

        Given("^Having a valid Facebook password$", () -> password = "testtest");

        Given("^Having a valid Twitter user$", () -> userTwitterEmail = "ops_internacional+24@tuenti.com");

        Given("^Having a valid Twitter password$", () -> password = "testtest");

        Given("^Having a wrong password$", () -> password = "test");

        Given("^Having a wrong phone number$", () -> phoneNumber = "684123456");

        Given("^Having the home page open$", () -> driver.get(URL));

        When("^the user clicks on the sign in link$", () -> {
            tuentiPage = new TuentiPage(driver);
            tuentiPage.clickEntrar();
        });

        When("^those data are introduced in the login page$", () -> {
            loginPage = new LoginPage(driver, phoneNumber, password);
            loginPage.setPhoneAndPassword();
        });

        When("^the access button is clicked$", () -> {
            loginPage.clickAccessButton();
        });

        When("^the user clicks on the Google Icon$", () -> {
            loginPage = new LoginPage(driver, userGoogleEmail, password);
            loginPage.clickGoogleIcon();
        });

        When("^those data are introduced in the Google login page$", () -> {
            loginPage.setGoogleAndPassword();
        });

        When("^the user clicks on the Facebook Icon$", () -> {
            loginPage = new LoginPage(driver, userFaceBookEmail, password);
            loginPage.clickFacebookIcon();
        });

        When("^those data are introduced in the Facebook login page$", () -> {
            loginPage.setFacebookAndPassword();
        });

        When("^the user clicks on the Twitter Icon$", () -> {
            loginPage = new LoginPage(driver, userTwitterEmail, password);
            loginPage.clickTwitterIcon();
        });

        When("^those data are introduced in the Twitter login page$", () -> {
            loginPage.setTwitterAndPassword();
        });

        Then("^the user access to the home page$", () -> {
            homePage = new HomePage(driver);
        });

        Then("^click on profiles$", () -> {
            homePage.clickProfiles();
        });

        Then("^check name is \"([^\"]*)\"$", (String arg1) -> {
            homePage.checkName(arg1);
        });

        Then("^the foolowing message \"([^\"]*)\" shall appear$", (String arg1) -> {
            loginPage.checkErrorMessage(arg1);
        });

        After((Scenario scenario) -> {
            driver.manage().deleteAllCookies()
            driver.close();
        });

    }

}
