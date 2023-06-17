Feature:I am on the Homepage

  As a user I want verify Homepage functionalities

  @smoke @regression
  Scenario: I should navigate to the homepage successfully
    When I click on accept cookies
    Then I am on the Homepage
    And I verify Welcome to Virgin Games text is displayed
    Then I click on join now
    And I am Verifying Pardon Our Interruption
