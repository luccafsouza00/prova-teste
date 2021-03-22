$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("shoestock2.feature");
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
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@executa"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Validação de produtos",
  "description": "",
  "id": "automação-na-shoestock;validação-de-produtos",
  "type": "scenario",
  "keyword": "Scenario"
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
formatter.match({
  "arguments": [
    {
      "val": "https://www.shoestock.com.br",
      "offset": 12
    }
  ],
  "location": "Test.que_esteja(String)"
});
formatter.result({
  "duration": 7899289814,
  "status": "passed"
});
formatter.match({
  "location": "Test.realize_uma_busca_de_produto()"
});
formatter.result({
  "duration": 9450346197,
  "status": "passed"
});
formatter.match({
  "location": "Test.valido_os_produtos_na_tela_de_pagamento()"
});
formatter.result({
  "duration": 4903135439,
  "status": "passed"
});
});