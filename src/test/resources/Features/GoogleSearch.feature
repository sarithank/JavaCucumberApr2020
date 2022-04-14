Feature: feature to test google search functionality

Scenario: 
Given browser is open
When user enters url
And user is on google search page
When user enters text in search box
And hits enter 
Then user navigated to search results page
Then close the browser
