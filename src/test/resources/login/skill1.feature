Feature:Test skillrary
1)Valid Data
2)Invalid Data
Background:
@PostiveTesting
Scenario Outline: To test login with multiple data
When Enter Username "<user>"
And Enter Password "<pass>"
And Click on the loginbutton
Then i should see the username as "<username>"
And Click on the username
And Click on the signout
Then I should go skillrary homepage as "<username>"
Examples:
|user|pass|username|
|admin|admin|SkillRary Admin|
|user|user|harry harry|
@NegativeTesting
Scenario: To Test the Login with invalid Credentials
When Enter Username "suresh"
And Enter Password "Suresh123"
And Click on the loginbutton
Then i should see the "Register"