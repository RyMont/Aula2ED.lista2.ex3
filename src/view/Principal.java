package view;

import javax.swing.JOptionPane;
import controller.VetorController;

public class Principal {
	public static void main(String[] args) {
		VetorController vc = new VetorController();
		int totalPares;
		int tamanhoVetor = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor a ser preenchido: "));
		int[] array = new int[tamanhoVetor];
		array = vc.preencherVetor(array);
		
		totalPares = vc.paresVetor(array, tamanhoVetor-1);
		System.out.print("O total de pares digitados foi de: " +totalPares);
	}
}