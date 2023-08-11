package br.com.aulatresprojetoum.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = JOptionPane.showInputDialog("Digite seu nome");

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		// Integer.parseInt(nome)
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario"));
		// Double.parseDouble(nome) para variavel do tipo 

		System.out.println("Seu nome é " + nome + ".E seu salario é " + salario);
		System.out.println("Você tem = " + idade + " anos ?");

	}

}
