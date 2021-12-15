Feature: Create an Account
  As a user i want to create an account.
@Regression @Smoke
  Scenario: User Should Create Account Successfully
    Given I am on HomePage
    Then I click on Sign In Button
    And  I enter email
    And I click on Create an Account Button
    And I enter FirstName "Robin"
    And I enter LastName "Singh"
    And I enter Password "Robin1234"
    And I enter Address line "1 Nice Building"
    And I enter City "Maryland"
    And I select state  "Ohio"
    And I enter zipcode "12345"
    And I enter Country "United States"
    And I enter Mobile number "01234567893"
    And I enter Address Alias "main home"
    And I click on Register button
    Then Verify message "My account"