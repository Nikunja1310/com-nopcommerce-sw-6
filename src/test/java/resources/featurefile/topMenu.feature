@smoke
Feature: Top Menu Test
  As a User I want to navigate to Top menu bar

  Scenario Outline: User should navigate to Top menu bar
    Given I am on Homepage
    When  I select "<menu>" from top bar
    Then  I should successfully navigate to the menu page
    And   I should see the "<pageName>"
    Examples:
      |         menu               |      pageName       |
      |       Computers            |    Computers         |
      |      Electronics           |     Electronics      |
      |        Apparel             |     Apparel          |
      |   Digital downloads        |     Digital downloads|
      |         Books              |      Books           |
      |        Jewelry             |     Jewelry          |
      |      Gift Cards            |     Gift Cards      |