Feature: Selenium Test
  The following scenarios test the login access.

  Scenario: Happy path
    Given Having a correct phone number and
    And Having a correct password and
    And Having the home page open and #Web=www.tuenti.es; Android=open App.
    When the user clicks on the sign in link and # Web=entrar; Android=inicia sesion.
    When those data are introduced in the login page
    When the access button is clicked #Web=Entrar en tu cuenta; Android=entrar
    Then the user access to the home page

  Scenario: Happy path, Access with Google user
    Given Having a valid Google user email and
    And Having a valid Google password and
    And Having the home page open
    When the user clicks on the sign in link and
    When the user clicks on the Google Icon
    When those data are introduced in the Google login page
    Then the user access to the home page

  Scenario: Happy path, Access with Facebook user
    Given Having a valid Facebook user
    And Having a valid Facebook password
    And Having the home page open
    When the user clicks on the sign in link
    When the user clicks on the Facebook Icon
    When those data are introduced in the Facebook login page
    Then the user access to the home page

  Scenario: Happy path, Access with Twitter user
    Given Having a valid Twitter user
    And Having a valid Twitter password
    And Having the home page open
    When the user clicks on the sign in link
    When the user clicks on the Twitter Icon
    When those data are introduced in the Twitter login page
    Then the user access to the home page

  Scenario: Wrong phone number.
    Given Having a wrong phone number
    And Having a correct password and
    And Having the home page open
    When the user clicks on the sign in link and
    When those data are introduced in the login page
    Then a message shall appear suggesting some data are wrong

  Scenario: Wrong password.
    Given Having a correct phone number
    And Having a wrong password and
    And Having the home page open
    When the user clicks on the sign in link and
    When those data are introduced in the login page
    Then a message shall appear suggesting some data are wrong