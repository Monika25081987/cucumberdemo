@loginTest
Feature: Title of your feature
  I want to use this template for my feature file

   
  Scenario Outline: Login in to an application
    Given I want to launce url
    When I click on signIn Button
    And I enter "<username>" and "<password>" to application
    And I click on submit button
    Then I should be redirect to homepage
    When i click on Whats new section
    Then It should show New in womens text on page

    Examples: 
      | username                   | password |
      | monika.gupta01@nagarro.com | Test@123 |
      