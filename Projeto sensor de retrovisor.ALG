(código feito em portugol)
Algoritmo "Exer"
Var
sensorE, sensorD, comandoV, retrovisorR: inteiro
Inicio
    retrovisorR <- 0
    repita
        escreva("Digite o valor do sensor Esquerdo: ")
        leia(sensorE)
        escreva("Digite o valor do sensor Direito: ")
        leia(sensorD)
        escreva("Digite o valor do comando de Voz: ")
        leia(comandoV)

        se (sensorE = 0) e (sensorD = 0) e (comandoV = 0)entao
        retrovisorR <- 0  // Recolher o retrovisor
            escreva(" retrovisor aberto.  ")
             FIMSE
         se(sensorE = 0) e (sensorD = 0) e (comandoV = 1) entao
         retrovisorR <- 1  // Recolher o retrovisor
            escreva(" retrovisor fechado.  ")
              FIMSE

         se(sensorE = 0) e (sensorD = 1) e (comandoV = 0) entao
         retrovisorR <- 1  // Recolher o retrovisor
            escreva(" retrovisor fechado.  ")

              FIMSE
         se(sensorE = 0) e (sensorD = 1) e (comandoV = 1) entao
         retrovisorR <- 1  // Recolher o retrovisor
            escreva("retrovisor aberto.  ")

          FIMSE
        se(sensorE = 1) e (sensorD = 0) e (comandoV = 0)entao
        retrovisorR <- 1  // Recolher o retrovisor
            escreva("retrovisor fechado.  ")
            FIMSE
         se (sensorE = 1) e (sensorD = 0) e (comandoV = 1) entao
            retrovisorR <- 1  // Recolher o retrovisor
            escreva("retrovisor aberto.")
              FIMSE
         se(sensorE = 1) e (sensorD = 1) e (comandoV = 0) entao
         retrovisorR <- 1  // Recolher o retrovisor
            escreva("retrovisor fechado.  ")
              FIMSE
         se(sensorE = 1) e (sensorD = 1) e (comandoV = 1) entao
         retrovisorR <- 1  // Recolher o retrovisor
            escreva("retrovisor aberto.  ")
            ate retrovisor = 1
        FIMSE
Fimalgoritmo
