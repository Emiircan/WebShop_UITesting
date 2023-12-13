Feature:Product Comp Func

  Background:
    Given Navigate to web shop page
    And Click on the element
      | logIn |
    And Get User information from Excel
      | email    | mail     |
      | password | password |
    And  Click on the element
      | login |
    Then User should login successfully

  @Regression
  Scenario: Product compare
    And Go to desktop category
    And Click on the element
      | computer     |
      | addToCompare |
    And Go to notebooks category
    And Click on the element
      | laptop       |
      | addToCompare |
      | listClear    |
    Then Comparison list cleaned