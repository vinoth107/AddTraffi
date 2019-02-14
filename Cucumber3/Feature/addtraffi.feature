
Feature: Traffi Plan Test

  Scenario Outline: Add Traffi details and get message
    Given User enter into the home page
    And User enter into the traffi page
    When User type the form details"<Monthly Rental>","<Free Local MinutesFree>","<International Minutes>","<Free SMS Pack>","<Local Per Minutes Charges>","<International Per Minutes Charges>","<SMS Per Charges>"
    And Click the sumit button
    Then User get the Congratulation message

    Examples: 
    
|Monthly Rental|Free Local MinutesFree |International Minutes|Free SMS Pack|Local Per Minutes Charges|International Per Minutes Charges|SMS Per Charges|
|200|300|400|500|609|700|800|