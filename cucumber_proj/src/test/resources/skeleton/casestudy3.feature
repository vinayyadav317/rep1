Feature: casestudy3 addproduct
@valid
    Scenario: Valid user Scenario
    Given The ULR of TestMeApp
    When User enters "admin" as username
    And user enters "Password456" as password
    And select catagory name
    And select subcatagory name
    And send "jobra 11" as product name
    And  send $300 as prize
    And send 10 as quality
    And add "Jobra" as brand
    And add "Headphone suitable for office" as description
    Then user is in <page>
    
    
    
   
    
