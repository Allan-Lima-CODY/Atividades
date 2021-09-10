programa {
	funcao inicio() {
		real nota, qtdAulas, qtdParticipacao
		
		escreva ("Digite a nota do aluno: ")
		leia (nota)
		
		escreva ("Digite a quantidade de aulas: ")
		leia (qtdAulas)
		
		escreva ("Digite de quantas aulas ele participou: ")
		leia (qtdParticipacao)
		
		se ((nota >= 70) e (qtdParticipacao >= qtdAulas * 0.25)) {
		    escreva ("Passou")
		}
		
		senao {
		    se ((nota >= 70) e (qtdParticipacao < qtdAulas * 0.25)) {
		        escreva ("Passou")
		    }
		    senao se ((nota >= 40) e (nota < 70) e (qtdParticipacao < qtdAulas * 0.25)) {
		             escreva ("Prova Alternativa")
		    }
		    senao {
		        escreva ("Reprovado")
		    }
		}
	}
}
