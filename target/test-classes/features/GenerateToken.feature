Feature: Token Generator for CRS portal
 
  Scenario: Generate valid token with CSR protal 
    Given url "https://tek-insurance-api.azurewebsites.net"
    And path "/api/token"
    And request {"username": "supervisor", "password": "tek_supervisor"}
    When method post
    Then status 200
    And print response


