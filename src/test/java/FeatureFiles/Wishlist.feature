Feature: Wishlist Func

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
  Scenario: Add wishlist and clear
    When Go to mobile phone category
    And Click on the element
      | smartPhone |
    And Add to wishlist
    Then Successfully added to  wishlist
    Then Clear wishlist

  @Regression
  Scenario: Add wishlist and buy
    When Go to mobile phone category
    And Click on the element
      | smartPhone |
    And Add to wishlist
    Then Successfully added to  wishlist
    And Click on the element
      | wishlist |
    Then Update wishlist to cart
    And Select country
    And Click on the element
      | agreeBox |
      | checkOut |
    Then Make payment transaction
    Then Order placed successfully
