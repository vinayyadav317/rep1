Feature: Login Feature
#Scenario: Valid user Scenario
 #   Given The ULR of TestMeApp
  #  When User enters "Lalitha" as username
   # And user enters "Password123" as password
    #Then user is in homepage
    
    #Scenario: Valid admin user Scenario
    #Given The ULR of TestMeApp
    #When User enters "admin" as username
    #And user enters "Password456" as password
    #Then user is in homepage
    
    @valid
    Scenario Outline: Valid user Scenario
    Given The ULR of TestMeApp
    When User enters <username> as username
    And user enters <password> as password
    Then user is in <page>
    
    Examples:
    |username	|password  	|page		|
    |Lalitha	|Password123|Home		|
    |admin		|Password456|Admin Home |
    
    @invalid
    Scenario: invalid user scenario
    Given The ULR of TestMeApp
    When User enters invalid data
    |Lalitha|abc123|
    |abc123|lalitha|
    |abc123|1bc123|
    Then user is in loginpage
    |bdc|
    |abc|
    |asd|
    
    