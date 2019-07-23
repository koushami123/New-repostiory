$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Training_C2a.05.01/workspace/new/Arti_1/src/resources/java/Case_2.feature");
formatter.feature({
  "line": 1,
  "name": "Login with different users",
  "description": "",
  "id": "login-with-different-users",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login-with-different-users;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is in Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \u003cusername\u003e \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 6,
  "name": "",
  "description": "",
  "id": "login-with-different-users;login;",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ],
      "line": 7,
      "id": "login-with-different-users;login;;1"
    },
    {
      "cells": [
        "\"Lalitha\"",
        "",
        "\"Password123\""
      ],
      "line": 8,
      "id": "login-with-different-users;login;;2"
    },
    {
      "cells": [
        "\"asha123\"",
        "",
        "\"password\""
      ],
      "line": 9,
      "id": "login-with-different-users;login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 8,
  "name": "Login",
  "description": "",
  "id": "login-with-different-users;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is in Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \"Lalitha\" \"Password123\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_2.user_is_in_Login_page()"
});
formatter.result({
  "duration": 60994711500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lalitha",
      "offset": 13
    },
    {
      "val": "Password123",
      "offset": 23
    }
  ],
  "location": "Case_2.user_enters(String,String)"
});
formatter.result({
  "duration": 1434521100,
  "status": "passed"
});
formatter.match({
  "location": "Case_2.user_is_in_home_page()"
});
formatter.result({
  "duration": 2271495000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login",
  "description": "",
  "id": "login-with-different-users;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User is in Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enters \"asha123\" \"password\"",
  "matchedColumns": [
    0,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user is in home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Case_2.user_is_in_Login_page()"
});
formatter.result({
  "duration": 17811648500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asha123",
      "offset": 13
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "Case_2.user_enters(String,String)"
});
formatter.result({
  "duration": 213046400,
  "status": "passed"
});
formatter.match({
  "location": "Case_2.user_is_in_home_page()"
});
formatter.result({
  "duration": 831250900,
  "status": "passed"
});
});