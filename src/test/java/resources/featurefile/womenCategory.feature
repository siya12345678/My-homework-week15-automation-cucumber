Feature: Women Category Page Test
  I want to verify woman category page links working and you can buy products form menu

 @Regression @Sanity
  Scenario: Verify User Should Navigate To Women Category Page Successfully
    Given  I am on HomePage
    When  I click on Women Tab
    Then I can verify "WOMEN" text on Screen.

  @Regression @Smoke
  Scenario Outline: Verify User Should Add Product To The Cart Successfully
    Given I am on HomePage
    And I click on Women Tab
    And I Click on the product "<product>"
    And I change quantity "<qty>"
    And Select size "<size>"
    And Select colour "<colour>"
    And Click on Add To Cart Button
    And Popup will display
    Then Verify the message "Product successfully added to your shopping cart"
    And Click on X button and close the popup

    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | M    | Blue   |
