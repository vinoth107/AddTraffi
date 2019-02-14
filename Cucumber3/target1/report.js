$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/VINOTH KUMAR/git/repository2/Cucumber3/Feature/addtraffi.feature");
formatter.feature({
  "name": "Traffi Plan Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Add Traffi details and get message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter into the home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter into the traffi page",
  "keyword": "And "
});
formatter.step({
  "name": "User type the form details\"\u003cMonthly Rental\u003e\",\"\u003cFree Local MinutesFree\u003e\",\"\u003cInternational Minutes\u003e\",\"\u003cFree SMS Pack\u003e\",\"\u003cLocal Per Minutes Charges\u003e\",\"\u003cInternational Per Minutes Charges\u003e\",\"\u003cSMS Per Charges\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the sumit button",
  "keyword": "And "
});
formatter.step({
  "name": "User get the Congratulation message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Monthly Rental",
        "Free Local MinutesFree",
        "International Minutes",
        "Free SMS Pack",
        "Local Per Minutes Charges",
        "International Per Minutes Charges",
        "SMS Per Charges"
      ]
    },
    {
      "cells": [
        "200",
        "300",
        "400",
        "500",
        "609",
        "700",
        "800"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Add Traffi details and get message",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter into the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Homepagetraffi.user_enter_into_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter into the traffi page",
  "keyword": "And "
});
formatter.match({
  "location": "Homepagetraffi.user_enter_into_the_traffri_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User type the form details\"200\",\"300\",\"400\",\"500\",\"609\",\"700\",\"800\"",
  "keyword": "When "
});
formatter.match({
  "location": "AccessDetailsTraffi.user_type_the_form_details(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the sumit button",
  "keyword": "And "
});
formatter.match({
  "location": "AccessDetailsTraffi.click_the_sumit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get the Congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "AccessWorkinTraffi.user_get_the_Congratulation_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});