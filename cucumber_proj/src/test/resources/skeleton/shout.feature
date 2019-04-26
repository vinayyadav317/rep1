Feature: Shout Feature
Scenario: sean Shouts 
Given sean is 10 meters away from lucia
When  Sean shouts "Free Coffee"
Then lucia "listens" to the message

Scenario: sean Shouts 
Given sean is 100 meters away from lucia
When  Sean shouts "Free Coffee"
Then lucia "cannot listen" to the message
