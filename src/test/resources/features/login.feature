@loginTest
Feature: Login in to a website

  Scenario: Login in to an application
  Given I want to launce url
  When I click on signIn Button
  And I enter username and password to application
  And I click on submit button
  Then I should be redirect to homepage
  
  
  Scenario Outline: Login in to an application
    Given I want to launce url
    When I click on signIn Button
    And I enter "<username>" and "<password>" to application
    And I click on submit button
    Then I should be redirect to homepage

    Examples: 
      | username                   | password |
      | monika.gupta01@nagarro.com | Test@123 |
      
