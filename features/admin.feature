#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Admin login feature

@test  
Scenario: Login with valid Credential
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 When  User enter Email as "admin@yourstore.com" and password as "admin"  
 When User click on Login button
 Then  User verify page title should be "Dashboard / nopCommerce administration"
 Then  close browser
 
 
 @dataDriven
 Scenario Outline: Login Data Driven 
 Given User Lanch Chrome Browser
 When  User open url "<url>"
 And  User enter Email as "<email>" and password as "<password>"  
 And User click on Login button
 Then  User verify page title should be "Dashboard / nopCommerce administration"
 And  close browser
 Examples:
 |url                                     |email                 |password   |
 |https://admin-demo.nopcommerce.com/login|admin@yourstore.com   |admin      |
 |https://admin-demo.nopcommerce.com/login|admin123@yourstore.com|admin123   |
 


  
