@Smoke
Feature: Security test Token Generation test

  @Security
  Scenario: generate token with valid usename and password
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "api/token"
    And request {"username": "supervisor", "password": "tek_supervisor"}
    When method get
    Then status 500

  # 3) test api endpoint "/api/token/verify" with valid token.
  # and invalid username, then status should be 400
  # and and errorMessage = Wrong Username send along with Token
  @Negative
  Scenario: test token verify with valid token and invalid username
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor", "password": "tek_supervisor"}
    When method post
    Then status 200
    * def generatedToken = response.token
    Given path "/api/token/verify"
    And param username = "invalid-username"
    And param token = generatedToken
    When method get
    Then status 400
    And print response
    * def errorMessage = response.errorMessage
    And assert errorMessage == "Wrong Username send along with Token"
