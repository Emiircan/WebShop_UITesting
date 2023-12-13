Feature: Address Func

  @SecondarySmoke
  Scenario: Create address record
    Given Navigate to web shop page
    And Click on the element
      | logIn |
    And Get User information from Excel
      | email    | mail     |
      | password | password |
    And  Click on the element
      | login |
    Then User should login successfully
    And Click on the element
      | customerAddress |
      | adNewAddress    |
    And User sending the keys in element
      | aFirstName | John |
      | aLastName  | Deep |
    And Get User information from Excel
      | aEmail | mail |
    And Select Country
    And User sending the keys in element
      | aCity        | Johor Bahru    |
      | aAddress     | Old Airport Rd |
      | aZipCode     | 54750          |
      | aPhoneNumber | 444 987 45 63  |
    Then Click on the element
      | save |