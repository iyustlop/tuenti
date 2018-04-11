Feature: Selenium Test
  The following scenarios test the login access.

  Scenario: Happy path
    Given Having a correct phone number
    And Having a correct password
    And Having the home page open
    When the user clicks on the sign in link
    And those data are introduced in the login page
    And the access button is clicked
    Then the user access to the home page
    And click on profiles
    And check name is "Ops Veinticuatro"

  Scenario: Wrong phone number
    Given Having a wrong phone number
    And Having a correct password
    And Having the home page open
    When the user clicks on the sign in link
    And those data are introduced in the login page
    And the access button is clicked
    Then the foolowing message "Some of your details are incorrect" shall appear

  Scenario: Wrong password
    Given Having a correct phone number
    And Having a wrong password
    And Having the home page open
    When the user clicks on the sign in link
    And those data are introduced in the login page
    And the access button is clicked
    Then the foolowing message "Some of your details are incorrect" shall appear

  Scenario: Happy path, Access with Google user
    Given Having a valid Google user email
    And Having a valid Google password
    And Having the home page open
    When the user clicks on the sign in link
    And the user clicks on the Google Icon
    And those data are introduced in the Google login page
    Then the user access to the home page

  Scenario: Happy path, Access with Facebook user
    Given Having a valid Facebook user
    And Having a valid Facebook password
    And Having the home page open
    When the user clicks on the sign in link
    And the user clicks on the Facebook Icon
    And those data are introduced in the Facebook login page
    Then the user access to the home page

  Scenario: Happy path, Access with Twitter user
    Given Having a valid Twitter user
    And Having a valid Twitter password
    And Having the home page open
    When the user clicks on the sign in link
    And the user clicks on the Twitter Icon
    And those data are introduced in the Twitter login page
    Then the user access to the home page
