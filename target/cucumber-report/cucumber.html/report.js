$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Homepage Test",
  "description": "As a user I want to navigate to register page successfully",
  "id": "homepage-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5155121700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to register page successfully",
  "description": "",
  "id": "homepage-test;user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 110217200,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 9934344700,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.verifyContinueButton()"
});
formatter.result({
  "duration": 27072800,
  "status": "passed"
});
formatter.after({
  "duration": 664121999,
  "status": "passed"
});
});