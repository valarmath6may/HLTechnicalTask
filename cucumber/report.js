$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dynamicload.feature");
formatter.feature({
  "line": 2,
  "name": "Dynamic loading",
  "description": "",
  "id": "dynamic-loading",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@valardynamic"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Verify that Hello world message appears after the loading bar disappears",
  "description": "",
  "id": "dynamic-loading;verify-that-hello-world-message-appears-after-the-loading-bar-disappears",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user select on \"Dynamic Loading\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user click on element rendered after the fact",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user should see start button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click on start",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should view the \"Hello World!\" message on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "loginSteps.launch_browser()"
});
formatter.result({
  "duration": 2018731200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dynamic Loading",
      "offset": 16
    }
  ],
  "location": "DynamicloadSteps.userSelectOn(String)"
});
formatter.result({
  "duration": 501215000,
  "status": "passed"
});
formatter.match({
  "location": "DynamicloadSteps.user_click_on_element_rendered_after_the_fact()"
});
formatter.result({
  "duration": 482313200,
  "status": "passed"
});
formatter.match({
  "location": "DynamicloadSteps.user_should_see_start_button()"
});
formatter.result({
  "duration": 86457300,
  "status": "passed"
});
formatter.match({
  "location": "DynamicloadSteps.user_click_on_start()"
});
formatter.result({
  "duration": 164355300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello World!",
      "offset": 22
    }
  ],
  "location": "DynamicloadSteps.userShouldViewTheMessageOnThePage(String)"
});
formatter.result({
  "duration": 5514481600,
  "status": "passed"
});
});