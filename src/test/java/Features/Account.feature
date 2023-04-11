Feature: Application Login
@Regression
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards are "true"