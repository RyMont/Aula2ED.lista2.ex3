package controller;

import javax.swing.JOptionPane;

public class VetorController {
	public int paresVetor(int[] vetor, int posAtual) {
		if (posAtual < 0) {
			return 0;
		}
		
		else if(vetor[posAtual]%2==0){
			return 1 + paresVetor(vetor, posAtual-1);
		}
		return paresVetor(vetor, posAtual-1);
	}
	
	public int[] preencherVetor(int[] vetor) {
		int tamanhoVetor = vetor.length;
		for (int i = 0; i < tamanhoVetor; i++) {
			do {vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posicao " +(i+1) +": "));}
			while (vetor[i] <= 0);
		}
		return vetor;
	}
}
