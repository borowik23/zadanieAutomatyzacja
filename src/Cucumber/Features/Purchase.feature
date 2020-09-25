Feature: Making Purchase

  Scenario Outline: Making successful purchase
    Given User on page https://prod-kurs.coderslab.pl/index.php page
    And User is signed in
    When <item> is searched by User
    And User is clicking <item> to move to its page
    And size <size> and <number> pieces are chosen
    And Adding products to basket
    And Checkout
    And Confirmed address
    And Delivery option is chosen
    And Payment by check is chosen, agreed to terms of service
    And Make screenshot
    And Closing browser

    Examples:
    |item|size|number|
    |Hummingbird printed sweater|L|5|