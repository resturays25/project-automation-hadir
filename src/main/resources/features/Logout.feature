Feature: Logout functionality on magang.dikahadir

  Scenario: Successful logout after login
    Given User is on login page for logout
    When User enters valid email and password for login
    And User clicks login button for logout
    Then User should be redirected to dashboard
    When User clicks the profile button on the dashboard
    And User clicks logout button
    Then User should be redirected to the login page

#  Scenario: Successful logout after login
#    Given User is on login page for login
#    When User enters valid email and password for login
#    And User clicks login button for login
#    And User clicks logout button
#    Then User should be redirected to the login page