package br.com.projetoarray.teste;

import javax.swing.JOptionPane;

public class Teste1 {

	public static void main(String[] args) {
		
		int[] numeroArray = new int[3];
		
		for(int i= 0; i < 3; i++)
		{
			numeroArray[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero :"));
		}
		
		for(int i= 0; i < 3; i++)
		{

			System.out.println(numeroArray[i]);
		}

	}

}
