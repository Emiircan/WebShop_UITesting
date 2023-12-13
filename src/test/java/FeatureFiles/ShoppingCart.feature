Feature: Shopping Cart Func

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
  Scenario: Add and delete to shopping cart
    And Go to mobile phone category
    And Click on the element
      | smartPhone |
      | addToCart  |
      | cart       |
      | removeBox  |
      | upCart     |
    Then Shopping cart successfully cleared

  @Regression
  Scenario: Add to cart and buy
    And Go to mobile phone category
    And Click on the element
      | addToCart |
      | cart      |
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully

  @Regression
  Scenario: Add to cart continue shopping and buy
    And Go to mobile phone category
    And Click on the element
      | addToCart        |
      | cart             |
      | shoppingContinue |
      | addToCart        |
      | cart             |
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully

  @Regression
  Scenario: Add configured desktop to cart and buy
    And Go to desktop category
    And Click on the element
      | computer |
    And Configure desktop
    And Click on the element
      | addToCart |
    Then Successfully added to cart
    And Click on the element
      | cart |
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully

  @Regression
  Scenario: Add customize sneaker to cart and buy
    And Click on the element
      | appShoes |
      | sneaker  |
    And Customize sneakers
    And Click on the element
      | addToCart |
    Then Successfully added to cart
    And Click on the element
      | cart |
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully

  @Regression
  Scenario: Add customize jewelry to cart and buy
    And Click on the element
      | jewelry |
      | jewel   |
    And Customize jewelry
    And Click on the element
      | addToCart |
    Then Successfully added to cart
    And Click on the element
      | cart |
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully
