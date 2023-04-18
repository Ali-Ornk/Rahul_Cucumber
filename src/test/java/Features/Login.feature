Feature: Application Login  // requirement


  Scenario: Home page default login
    Given User is on landing page
    When User login into application with "jin" and password "1234"
    Then Home page is populated
    And Cards are "true"
@MobileTest
  Scenario: Home page default login // test case heading
    Given User is on landing page
    When User login into application with "john" and password "4321"
    Then Home page is populated
    And Cards are "false"
@SmokeTest @RegressionTest
  Scenario: Home page default login // test case heading
    Given User is on landing page
    When User sign up with following details
    | Jenny | abcd | John@abdc.com | Australia | 3242353 |
  #for creating data table we need to put " | " between,beginning and end of datas
    Then Home page is populated
    And Cards are "false"
@SmokeTest
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
