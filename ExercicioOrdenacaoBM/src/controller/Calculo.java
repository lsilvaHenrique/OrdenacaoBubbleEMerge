package controller;

import sp.fateczl.lucas.Ordenacao.OrdenacaoController;

public class Calculo {
	
	public Calculo() {
		super();
	}
	
	public void opBubble (int vetor []) {
		OrdenacaoController ordenacao = new OrdenacaoController();
		ordenacao.bubbleSort(vetor);
	}
	
	public void opMerge (int tamanho, int vetor[]) {
		OrdenacaoController ordenacao = new OrdenacaoController();
		ordenacao.mergeSort(tamanho, vetor);
	}
}
