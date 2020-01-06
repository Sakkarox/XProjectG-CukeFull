$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PurchaseTesting.feature");
formatter.feature({
  "name": "User should be able to purchase products",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user should be able to make purchases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@current"
    },
    {
      "name": "@ui"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user navigates to \"\u003cLandingPage\u003e\" page",
  "keyword": "Given "
});
formatter.step({
  "name": "\"\u003cUserType\u003e\" logins with valid credentials",
  "keyword": "And "
});
formatter.step({
  "name": "user adds \"\u003cCountOfProduct\u003e\" of \"\u003cProduct\u003e\" into cart",
  "keyword": "And "
});
formatter.step({
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.step({
  "name": "user places order from \"\u003cCountry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "verify that \"\u003cActualMessage\u003e\" is \"Thank you, your order has been placed successfully\u0026\u0026\u0026You\u0027ll be redirected to Home page shortly!!\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserType",
        "LandingPage",
        "CountOfProduct",
        "Product",
        "Country",
        "ActualMessage"
      ]
    },
    {
      "cells": [
        "student",
        "shoppingUrl",
        "2",
        "Tomato",
        "United States",
        "Thank you, your order has been placed successfully\nYou\u0027ll be redirected to Home page shortly!!"
      ]
    },
    {
      "cells": [
        "teacher",
        "shoppingUrl",
        "5",
        "Pumpkin",
        "Turkey",
        "unsuccessfully"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user should be able to make purchases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@current"
    },
    {
      "name": "@ui"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"shoppingUrl\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "UITest.user_navigates_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"student\" logins with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.logins_with_valid_credentials(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds \"2\" of \"Tomato\" into cart",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.user_adds_of_into_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.user_proceeds_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user places order from \"United States\"",
  "keyword": "When "
});
formatter.match({
  "location": "UITest.user_places_order_from(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Thank you, your order has been placed successfully\nYou\u0027ll be redirected to Home page shortly!!\" is \"Thank you, your order has been placed successfully\u0026\u0026\u0026You\u0027ll be redirected to Home page shortly!!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UITest.verify_that_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user should be able to make purchases",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@current"
    },
    {
      "name": "@ui"
    },
    {
      "name": "@regression"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"shoppingUrl\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "UITest.user_navigates_to_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"teacher\" logins with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.logins_with_valid_credentials(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user adds \"5\" of \"Pumpkin\" into cart",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.user_adds_of_into_cart(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user proceeds to checkout",
  "keyword": "And "
});
formatter.match({
  "location": "UITest.user_proceeds_to_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user places order from \"Turkey\"",
  "keyword": "When "
});
formatter.match({
  "location": "UITest.user_places_order_from(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"unsuccessfully\" is \"Thank you, your order has been placed successfully\u0026\u0026\u0026You\u0027ll be redirected to Home page shortly!!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UITest.verify_that_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});