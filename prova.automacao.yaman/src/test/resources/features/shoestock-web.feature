#Author: luccafsouza00@gmail.com

@executa
Feature: Automação na Shoestock
  Eu como usuário quero realizar pesquisa de produtos 

 
  Scenario: Validação de produtos 
    Given que esteja "https://www.shoestock.com.br"
    
    When realize uma busca de produto
   
    Then valido os produtos na tela de pagamento
