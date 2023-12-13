Feature:Login Func

  Background:
    Given Navigate to web shop page
    And Click on the element
      | logIn |

  @Regression
  Scenario Outline: Login with in valid mail and password
    And Get User information from Excel
      | email    | <mail>     |
      | password | <password> |
    And Click on the element
      | login |
    Then User shouldn't login successfully

    Examples:
      | mail        | password        |
      | invalidMail | password        |
      | mail        | invalidPassword |

  @Regression
  Scenario: Login with valid mail and password
    And Get User information from Excel
      | email    | mail     |
      | password | password |
    And  Click on the element
      | login |
    Then User should login successfully
