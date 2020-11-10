@valardynamic
Feature:Dynamic loading
  Scenario:Verify that Hello world message appears after the loading bar disappears
    Given launch browser
    When user select on "Dynamic Loading"
    Then user click on element rendered after the fact
 And user should see start button
    When user click on start
    Then user should view the "Hello World!" message on the page

