$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/casestudy1.feature");
formatter.feature({
  "name": "casestudy1 addproduct",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "adding product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logs in",
  "keyword": "Given "
});
formatter.match({
  "location": "casestudy1_stepdef.user_logs_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete adding catagory",
  "keyword": "When "
});
formatter.match({
  "location": "casestudy1_stepdef.complete_adding_catagory()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete adding subcatogry",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy1_stepdef.complete_adding_subcatogry()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "complete adding product",
  "keyword": "And "
});
formatter.match({
  "location": "casestudy1_stepdef.complete_adding_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check if product is added",
  "keyword": "Then "
});
formatter.match({
  "location": "casestudy1_stepdef.check_if_product_is_added()"
});
formatter.result({
  "status": "passed"
});
});