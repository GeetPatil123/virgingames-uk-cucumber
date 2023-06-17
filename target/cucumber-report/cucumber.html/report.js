$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "I am on the Homepage",
  "description": "\r\nAs a user I want verify Homepage functionalities",
  "id": "i-am-on-the-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3896547200,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "I should navigate to the homepage successfully",
  "description": "",
  "id": "i-am-on-the-homepage;i-should-navigate-to-the-homepage-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@smoke"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I am on the Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify Welcome to Virgin Games text is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on join now",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I am Verifying Pardon Our Interruption",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 234231600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 97200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iVerifyWelcomeToVirginGamesTextIsDisplayed()"
});
formatter.result({
  "duration": 60861100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnJoinNow()"
});
formatter.result({
  "duration": 375825800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iAmVerifyingPardonOurInterruption()"
});
formatter.result({
  "duration": 52407600,
  "status": "passed"
});
formatter.after({
  "duration": 704391200,
  "status": "passed"
});
});