
@valarjsalerts
Feature:JavaScriptAlerts

  Scenario Outline: Verify that click for JSConfirm:click the buttons on the alert and check that a relevant message appears.
    Given launch browser
    When user select on "JavaScript Alerts"
    And click for JSConfirm
    And click on alert "<input>" option
    Then user should see revelant message "<response>"

    Examples:
    |input|response|
    |OK   |You clicked: Ok|
    |Cancel|You clicked: Cancel|


  Scenario Outline: Verify that click for JSConfirm:click the buttons on the alert
                      and user should not see irrelevant message
    Given launch browser
    When user select on "JavaScript Alerts"
    And click for JSConfirm
    And click on alert "<input>" option
    Then user should not see irrevelant message "<response>"
    Examples:
      |input|response|
      |OK   |You clicked: Cancel|
      |Cancel|You clicked: Ok|
