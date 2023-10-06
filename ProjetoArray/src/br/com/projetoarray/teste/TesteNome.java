package br.com.projetoarray.teste;

import javax.swing.JOptionPane;

public class TesteNome {

	public static void main(String[] args) {
		String[] nomeArray = new String[3];
		
		for(int i= 0; i < 3; i++)
		{
			nomeArray[i] =(JOptionPane.showInputDialog("Digite a palavra"));
		}
		
		for(int i= 0; i < 3; i++)
		{

			System.out.println(nomeArray[i]);
		}

	}

}
