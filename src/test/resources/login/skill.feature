Feature:Test skillrary
1)Valid Data
2)Invalid Data
Background:
@PostiveTesting
Scenario:To Test login functionality
Given I should go to the login page
And Enter the username "admin"
And Enter the password "admin"
And Click on the login button
Then I should see the username as "SkillRary Ecommerce"
And Click on the username
And Click on the signout
Then I should go skillrary homepage as "SkillRary Courses"
@NegativeTesting
Scenario:To Test login functionality with invalid data
Given I should go to the login page
And Enter the username "admin123"
And Enter the password "admin123"
And Click on the login button
Then I should see the username as "SkillRary Ecommerce"
And Click on the username
And Click on the signout
Then I should go skillrary homepage as "SkillRary Courses"