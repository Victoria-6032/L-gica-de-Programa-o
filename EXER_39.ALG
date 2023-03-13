Algoritmo "exer_39"

Var

 valor, taxa: real
 periodo,prestacao: real

Inicio

  Escreval(" Entre com o valor: ")
  Leia(valor)
  Escreval(" Entre com a taxa: ")
  Leia(taxa)
  Escreval(" Entre com o periodo de atraso: ")
  Leia(periodo)
  prestacao:= valor+(valor*(taxa/100)*periodo)
  Escreva(" O novo valor da prestacao é R$", prestacao)

Fimalgoritmo