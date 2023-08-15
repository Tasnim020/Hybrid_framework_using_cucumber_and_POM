Feature: Login test
  I want to use this to test my login features

  Scenario: Create a new Account
    Given go to url
    When go to login page
    When go to Create New Account
    And I put firstname
    And I put Lastname
    And I put email
    And I put password
    And I put confirm password
    And click the create a new accounr button
    Then I log in successfully
