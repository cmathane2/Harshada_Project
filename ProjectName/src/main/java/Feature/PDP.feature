Feature: PDP functionality
# @sanity 
#  Scenario: CRM login password and
#    Given user already on login page
#    When title of the login page is free crm
#    Then users enter the username and password
#    And users click on login button
#    And close the browser
#
# @sanity
#    Scenario: 2 wheeler Journey 
#    Given Launch the bajaj site
#    When title of the login page is free crm
#    Then users enter the username and password
#    And users click on login button
#    And close the browser
    
    
    Scenario: Open PDP Page
    Given Launch the  OpenCart
    When title of the page is OpenCart
    Then click on Register button                      
    Then Enter user details
    When user click onRegister button
    And close the browser
    