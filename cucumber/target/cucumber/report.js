$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/featurefiles/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "As a user\nI want to use a calculator\nSo that I don\u0027t need to calculate myself",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.before({
  "duration": 499809,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add two numbers",
  "description": "",
  "id": "calculator;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add 2 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be 5",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 144363851,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "CalculatorSteps.i_add_and(int,int)"
});
formatter.result({
  "duration": 1800211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.the_result_should_be(int)"
});
formatter.result({
  "duration": 86559,
  "status": "passed"
});
});