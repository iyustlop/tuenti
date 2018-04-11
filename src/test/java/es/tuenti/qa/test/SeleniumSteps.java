package es.tuenti.qa.test;

import cucumber.api.Scenario;
import cucumber.api.java8.En;
import es.tuenti.qa.pages.LoginPage;
import es.tuenti.qa.pages.TuentiPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.security.util.PendingException;

import java.util.concurrent.TimeUnit;

public class SeleniumSteps implements En {

    private static final String GECKO_DRIVER = "src/test/resources/driver/geckodriver";
    private static final String URL = "http://www.tuenti.es";
    private String wrongPhoneNumber;
    private String wrongPassword;
    private String phoneNumber;
    private String password;
    private String userGoogleEmail;
    private String passwordGoogleEmail;
    private String userTwitterEmail;
    private String passwordTwitterEmail;
    private String userFaceBookEmail;
    private String passwordFaceBookEmail;

    WebDriver driver;

    TuentiPage tuentiPage;
    LoginPage loginPage;


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

        Given("^Having a valid Google password$", () -> passwordGoogleEmail = "testtest");

        Given("^Having a valid Facebook user$", () -> userFaceBookEmail = "ops_internacional+24@tuenti.com");

        Given("^Having a valid Facebook password$", () -> passwordFaceBookEmail = "testtest");

        Given("^Having a valid Twitter user$", () -> userTwitterEmail = "ops_internacional+24@tuenti.com");

        Given("^Having a valid Twitter password$", () -> passwordTwitterEmail = "testtest");

        Given("^Having a wrong password and$", () -> wrongPassword = "testtest");

        Given("^Having a wrong phone number$", () -> wrongPhoneNumber = "testtest");

        Given("^Having the home page open$", () -> driver.get(URL));

        When("^the user clicks on the sign in link$", () -> {
            tuentiPage = new TuentiPage(driver);
            tuentiPage.clickEntrar();
        });

        When("^those data are introduced in the login page$", () -> {
            loginPage = new LoginPage(driver,phoneNumber,password);
            loginPage.setPhoneAndPassword();
        });

        When("^the access button is clicked$", () -> {
            loginPage.clickAccessButton();
        });

        Then("^the user access to the home page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });


        When("^the user clicks on the Google Icon$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^those data are introduced in the Google login page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });


        When("^the user clicks on the Facebook Icon$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^those data are introduced in the Facebook login page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the user clicks on the Twitter Icon$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^those data are introduced in the Twitter login page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^a message shall appear suggesting some data are wrong$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        After((Scenario scenario) -> {
           driver.quit();
        });

    }

}
