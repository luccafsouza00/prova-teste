#Author: luccafsouza00@gmail.com


@executa
Feature: Buscar profissional
  Como usuario quero validar o busca do profissional via api

Background: Acessar api
		Given que eu acesse a api get para consultar profissional 
  
  Scenario: Validar o status code      
    Then valido o status code do retorno
    
  Scenario: Validar body response estrutura lista campo name  
    Then valido o nome "Professional"
   
