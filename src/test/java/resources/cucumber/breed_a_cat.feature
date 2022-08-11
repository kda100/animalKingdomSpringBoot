Feature: breeding the cat
  Scenario: The partner is a cat
    Given The partner is a cat
    And The partner is a different gender
    Then A new cat will be born

  Scenario: The partner is a cat
    Given The partner is a cat
    And The partner is the same gender
    Then No cat is born

  Scenario: The partner is not a cat
    Given The partner is not a cat
    Then No cat is born