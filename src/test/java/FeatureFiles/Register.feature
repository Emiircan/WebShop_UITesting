Feature: Register Func

  @Smoke
  Scenario: New member registration
    Given Navigate to web shop page
    And Click on the element
      | register |
      | male     |
    And User sending the keys in element
      | firstName | John |
      | lastName  | Deep |
    When Get User information from Excel
      | regEmail     | mail     |
      | regPassword  | password |
      | regCPassword | password |
    And Click on the element
      | Register |
    Then User should register successfully

  @Smoke
  Scenario: New member registration with existing mail
    Given Navigate to web shop page
    And Click on the element
      | register |
      | male     |
    And User sending the keys in element
      | firstName | John |
      | lastName  | Deep |
    When Get User information from Excel
      | regEmail     | mail     |
      | regPassword  | password |
      | regCPassword | password |
    And Click on the element
      | Register |
    Then User shouldn't register successfully

