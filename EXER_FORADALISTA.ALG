Algoritmo "exer_foradalista"

Var

   turma_c, turma_d, totalAlunos: inteiro
   
   porc_RC, porc_AD, itemA , itemB, aprD, repr, itemC: real


Inicio

    turma_c:= 60
    turma_d:= 20
    Escreval (" % dos reprovados turma C: ")
    leia(porc_RC)
    Escreval(" % dos aprovados turma D: ")
    Leia(porc_AD)
    itemA:= turma_c * ( porc_RC/100)
    itemB:= ((100- porc_AD)/100) * turma_D
    totalAlunos:= turma_c + turma_d
    repr:= itemA + itemB
    itemC:=(repr/totalAlunos)*100
    Escreval (" O n�mero de reprovados na turma C �: ", itemA)
    Escreval (" O n�mero de aprovados na turma D �: ", itemB)
    Escreval (" Foram", itemC, " % de reprovados")
    
Fimalgoritmo