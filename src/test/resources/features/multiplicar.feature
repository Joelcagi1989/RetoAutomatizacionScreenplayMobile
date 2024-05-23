# language: es

  Característica: Como usuario de la calculadora deseo realizar la multiplicacion de dos numeros

    Esquema del escenario: multiplicar dos numeros
      Dado que usuario quiere usar la calculadora
      Cuando realiza la operacion multiplicacion
        | valorUno   | valorDos   |
        | <valorUno> | <valorDos> |
      Entonces debe ver el resultado
      Ejemplos:
        | valorUno | valorDos |
        ##@externaldata@./src/test/resources/data/Testdata.xlsx@Sheet1@1
   |8   |4|
