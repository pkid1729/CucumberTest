$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LindaTest.feature");
formatter.feature({
  "line": 2,
  "name": "EndToEnd Scenario for TestMeApp",
  "description": "Login with Linda account and purchase product and complete payment process",
  "id": "endtoend-scenario-for-testmeapp",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ProductScenario"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "Login with valid credentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password and click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be logged in and verified",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_is_on_home_page()"
});
formatter.result({
  "duration": 32196022100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_username_and_password_and_click_on_Login_button()"
});
formatter.result({
  "duration": 19354583100,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_should_be_logged_in_and_verified()"
});
formatter.result({
  "duration": 10409900,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Successful Checkout",
  "description": "",
  "id": "endtoend-scenario-for-testmeapp;successful-checkout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@AddToCartandPaymentProcess"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Navigate to All categories - electronic and Head phone",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Add product into shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "proceed to checkout",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "select bank and add credentials",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "redirected to the thank you page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.navigate_to_All_categories_electronic_and_Head_phone()"
});
formatter.result({
  "duration": 16202937600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.add_product_into_shopping_cart()"
});
formatter.result({
  "duration": 712097600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.proceed_to_checkout()"
});
formatter.result({
  "duration": 1983976000,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.select_bank_and_add_credentials()"
});
formatter.result({
  "duration": 6827565200,
  "error_message": "java.lang.NullPointerException\r\n\tat stepdefinition.LoginTest.select_bank_and_add_credentials(LoginTest.java:107)\r\n\tat ✽.And select bank and add credentials(LindaTest.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginTest.redirected_to_the_thank_you_page()"
});
formatter.result({
  "status": "skipped"
});
});