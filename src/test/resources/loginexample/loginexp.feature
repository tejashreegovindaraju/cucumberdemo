Feature: Loginexp
This feature file describes about the login information..
Scenario Outline:Successful login
Given enduser is on the login page
When endusers enters "<username>" and "<password>" and click on submit button
Then user is successful

Examples:
|username|password|
|Lalitha|Password123|





