Feature: Portal Login


  Background: # we can not have Background: and Hook together
              #Every feature file should have own Background
    Given validate the browser
    When Browser is triggered
    Then check if the browser is started
@PortalTest
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards are "true"
  @PortalTest
  Scenario: Home page default login // test case heading
    Given User is on landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards are "false"
  @alitest
  Scenario: Home page default login // test case heading
    Given User is on landing page
    When User sign up with following details
      | Jenny | abcd | John@abdc.com | Australia | 3242353 |

    Then Home page is populated
    And Cards are "false"
  @astest
  Scenario Outline: Home page default login // test case heading
    Given User is on landing page
    When User login in to application with <Username> and password <password>
    Then Home page is populated
    And Cards are "true"
    Examples:
      |Username  | password|
      |user1     | pass1   |
      |user2     | pass2  |
      |user3     | pass3   |
      |user4     | pass4   |


  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "" and password "1234"
    Then Home page is populate
    And Cards are "true"
