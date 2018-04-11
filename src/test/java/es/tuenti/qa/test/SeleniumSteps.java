package es.tuenti.qa.test;

import cucumber.api.java8.En;
import sun.security.util.PendingException;

public class SeleniumSteps implements En {

    private String phoneNumber;
    private String password;


    public SeleniumSteps() {

        Given("^Having a correct phone number and$", () -> phoneNumber = "684262289");

        Given("^Having a correct password and$", () -> password = "testtest");

        Given("^Having the home page open and #Web=www\\.tuenti\\.es; Android=open App\\.$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the user clicks on the sign in link and # Web=entrar; Android=inicia sesion\\.$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^those data are introduced in the login page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the access button is clicked #Web=Entrar en tu cuenta; Android=entrar$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^the user access to the home page$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a valid Google user email and$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a valid Google password and$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having the home page open$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the user clicks on the sign in link and$", () -> {
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

        Given("^Having a valid Facebook user$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a valid Facebook password$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^the user clicks on the sign in link$", () -> {
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

        Given("^Having a valid Twitter user$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a valid Twitter password$", () -> {
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

        Given("^Having a wrong phone number$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^a message shall appear suggesting some data are wrong$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a correct phone number$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Given("^Having a wrong password and$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

    }
}
