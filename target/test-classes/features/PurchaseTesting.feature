Feature: User should be able to purchase products


@current @ui @regression @smoke
Scenario Outline: user should be able to make purchases
Given user navigates to "<LandingPage>" page 
And "<UserType>" logins with valid credentials
And user adds "<CountOfProduct>" of "<Product>" into cart
And user proceeds to checkout
When user places order from "<Country>"
Then verify that "<ActualMessage>" is "Thank you, your order has been placed successfully&&&You'll be redirected to Home page shortly!!" 
Examples:
|UserType	|LandingPage	|CountOfProduct	|Product	|Country		|ActualMessage											|
|student	|shoppingUrl	|2				|Tomato		|United States	|Thank you, your order has been placed successfully\nYou'll be redirected to Home page shortly!!|
|teacher	|shoppingUrl	|5				|Pumpkin	|Turkey			|unsuccessfully											|