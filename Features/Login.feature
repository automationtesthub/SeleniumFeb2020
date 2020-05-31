Feature: Login Functionality

@Regression, @Sanity
Scenario Outline: Valid Login
Given User should be on login page
When user enter valid "<username>" and "<Password>" and click login button
Then user should be login successfully
And user should see logout option on home page

Examples:
|username  | Password |
|admin     | admin    |
|admin2    | admin2   |
|admin3    | admin3   |


@Regression, @Smoke
Scenario Outline: InValid Login
Given User should be on login page
When user enter valid "<username>" and "<Password>" and click login button
Then error should be dispaled
And close the browser

Examples:
|username  | Password |
|admin2    | admin2   |

@Regression, @Sprint1
Scenario: Verify Title
Given User should be on login page
Then title should be dispaled on browser tab
And close the browser

@Regression, @Sprint1
Scenario: Verify Logo
Given User should be on login page
Then logo should be dispaled on browser
And close the browser









