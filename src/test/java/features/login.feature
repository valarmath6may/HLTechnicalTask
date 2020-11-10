@valarlogin
Feature: login to the application

  Scenario Outline: Verify that user should see respective response message when login
    Given launch browser
    When user select on "Form Authentication"
    And user enters username "<username>"
    And user enters password "<password>"
    And click on login button
    Then user should see respective response in the page "<response>"

    Examples:
    |username|password|response|
    |tomsmith|SuperSecretPassword!|You logged into a secure area!\n×|
    |        |SuperSecretPassword!| Your username is invalid!\n×|
    |tomsmith|                    | Your password is invalid!\n×|
    |        |                    | Your username is invalid!\n×|
    |abcxyz|SuperSecretPassword!| Your username is invalid!\n×|
    |tomsmith|xyzabc|  Your password is invalid!\n×|
    |TOMSMITH|supersecretpassword!|Your username is invalid!\n×|
    |tomsmith|supersecretpassword!|Your password is invalid!\n×|
    |TOMSMITH|SuperSecretPassword!|Your username is invalid!\n×|
    |tomsmith|SUPERSECRETPASSWORD!|Your password is invalid!\n×|
    |TOMSMITH|                  | Your username is invalid!\n×|
    |         |SUPERSECRETPASSWORD!|  Your username is invalid!\n×|
    |TOMSMITH|SUPERSECRETPASSWORD!|Your username is invalid!\n×|



