Feature: New Address

  Scenario Outline: Successfully adding new address to the existing user
    Given Open page https://prod-kurs.coderslab.pl/index.php page
    And User is logged in
    When User clicked "Addresses" button
    And User are clicking "Create new address" button
    And Filling form with: <alias>, <address>, <city>, <postcode>, <country>, <phone> and submitted
    Then "Address successfully added!" message is shown
    And Closing the browser
    Examples:
    |alias|address|city|postcode|country|phone|
    |Borowik|Mazowiecka 4|Warsaw|54223|United Kingdom|555444222|