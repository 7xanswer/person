Feature: persons can be retrieved
  Scenario: client makes call to GET /api/persons
    When the client calls /api/persons
    Then the client receives status code of 200