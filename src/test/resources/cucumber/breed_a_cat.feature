Feature: breeding the cat
  Scenario: The partner is a cat
    Given The partner is a cat
    And The partner is a different gender
    When They try to breed
    Then A new cat will be born