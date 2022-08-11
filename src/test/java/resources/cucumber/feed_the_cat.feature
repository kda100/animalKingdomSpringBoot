Feature: Feeding the cat
  Scenario: The cat is hungry
    Given the cat is hungry
    Then the cat should eat the food
    And the cat should no longer be hungry
    And the amount of food in the bowl should decrease

  Scenario: Cat is not hungry
    Given the cat is not hungry
    When I try yo feed the cat
    Then the cat should refuse to eat the food

  Scenario: Cat doesn't like the food
    Given the cat is hungry
    And there is food in the bowl
    And the cat doesn't like the food
    When I try to feed the cat
    Then the cat should refuse to eat the food