# language: es

  Característica: Como usuario de la calculadora deseo realizar la suma de dos numeros

    Esquema del escenario: sumar dos numeros
      Dado que usuario quiere usar la calculadora
      Cuando realiza la operacion suma
        | valorUno   | valorDos   |
        | <valorUno> | <valorDos> |
      Entonces debe ver el resultado
      Ejemplos:
        | valorUno | valorDos |
        ##@externaldata@./src/test/resources/data/Testdata.xlsx@Sheet1@1
   |8   |4|
