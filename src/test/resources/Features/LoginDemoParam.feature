
#this feature file can also usedfor LoginDemoParamPomSteps  class

Feature: login functionality test

Scenario Outline: 
Given User open the browser 
And verify user is on login page
When user should enters <username> and <password>
And click on login button
Then verify the home page
And close the broser

Examples:

| username | password  |
| Mariya   | 12345     |
| Susan    | 12345     |
| Emma     | 12345     |