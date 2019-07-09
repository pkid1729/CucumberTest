@ProductScenario
Feature: EndToEnd Scenario for TestMeApp
  Login with Linda account and purchase product and complete payment process

Background: Login with valid credentials
	Given User is on home page
	When User enters username and password and click on Login button
	Then User should be logged in and verified
	
  @AddToCartandPaymentProcess
  Scenario: Successful Checkout
    Given Navigate to All categories - electronic and Head phone
    And Add product into shopping cart
    When proceed to checkout
    And select bank and add credentials
    Then redirected to the thank you page