Feature: testing the API

  Background:
    Given url "https://reqres.in"

  @debug
  Scenario: API Test
    And path "/api/users"
    And params { page:1 }
    When method Get
    Then status 200