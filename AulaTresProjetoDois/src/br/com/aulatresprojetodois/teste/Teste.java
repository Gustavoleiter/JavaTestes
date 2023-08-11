package br.com.aulatresprojetodois.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if(idade >= 18)
		{
			System.out.println("Você e maior de idade");
		}
		else if(idade < 18){
			System.out.println("Você e menor de idade");
			
		}

	}

}
