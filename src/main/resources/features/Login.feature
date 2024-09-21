Feature: Login functionality on magang.dikahadir

  Scenario: Successful login with valid credentials
    Given User is on login page for login
    When User enters valid email and password for login
    And User clicks login button for login
    Then User should see an error message for login

  Scenario: Unsuccessful login with invalid email
    Given User is on login page for login
    When User enters invalid email and valid password
    And User clicks login button
    Then User should see an error message for login

  Scenario: Unsuccessful login with email without @
    Given User is on login page for login
    When User enters email without at sign and valid password
    And User clicks login button
    Then User should see an error message for login

  Scenario: Unsuccessful login with invalid password
    Given User is on login page for login
    When User enters valid email and invalid password for login
    And User clicks login button
    Then User should see an error message for login


  Scenario: Unsuccessful login with empty email and valid password
    Given User is on login page for login
    When User enters empty email and valid password for login
    And User clicks login button
    Then User should see an error message for login


  Scenario: Unsuccessful login with valid email and empty password
    Given User is on login page for login
    When User enters valid email and empty password for login
    And User clicks login button
    Then User should see an error message for login

  Scenario: Unsuccessful login with empty email and empty password
    Given User is on login page for login
    When User enters empty email and empty password for login
    And User clicks login button
    Then User should see an error message for login

  Scenario: Direct access to dashboard without login
    When User accesses the dashboard directly without login
    Then User should see an error message for login

#  Scenario: Successful logout after login
#    Given User is on login page for login
#    When User enters valid email and password for login
#    And User clicks login button for login
#    And User clicks logout button
#    Then User should be redirected to the login page
