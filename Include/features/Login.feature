Feature: Login feature

  Scenario Outline: Test login with valid credentails
    Given User navigates to Login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigated to homepage
    
    Examples:
    | username | password |
    | Admin 			| admin123 		|
    