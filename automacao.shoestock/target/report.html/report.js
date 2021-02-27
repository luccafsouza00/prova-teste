$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/shoestock.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: luccafsouza00@gmail.com"
    }
  ],
  "line": 4,
  "name": "Automação na Shoestock",
  "description": "Eu como usuário quero realizar pesquisa de produtos",
  "id": "automação-na-shoestock",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "Validação de produtos",
  "description": "",
  "id": "automação-na-shoestock;validação-de-produtos",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@executa"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "que esteja \"https://www.shoestock.com.br\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "realize uma busca de produto",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "valido os produtos na tela de pagamento",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});