$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test login with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User is navigated to homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test login with valid credentails",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is navigated to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyHomepage()"
});
formatter.result({
  "status": "passed"
});
});