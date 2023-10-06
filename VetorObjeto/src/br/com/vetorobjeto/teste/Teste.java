package br.com.vetorobjeto.teste;

import javax.swing.JOptionPane;

import br.com.vetorobjeto.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();

		/*aluno.setNome("Gustavo");
		aluno.setIdade(23);
		aluno.setRm(2298901);
*/
		Aluno [] alunoVetor = new Aluno[3];
		/*
		alunoVetor[0] = new Aluno();
		alunoVetor[0].setNome("Gusta");
		alunoVetor[0].setIdade(23);
		alunoVetor[0].setRm(1234);
		*/
		String nome ="";
		int idade = 0;
		int rm = 0;
		
		
		for(int i = 0; i < 3 ;i =i + 1)
		{
		 nome = JOptionPane.showInputDialog("Digite seu noem");
		 idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		 rm = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RM"));
		 	
		 	alunoVetor[i] = new Aluno();
		 	alunoVetor[i].setNome(nome);
			alunoVetor[i].setIdade(idade);
			alunoVetor[i].setRm(rm);
		 
		}
		
		for(int i = 0; i < 3 ; i++)
		{
			System.out.println(alunoVetor[i].getNome());
			System.out.println(alunoVetor[i].getRm());
			System.out.println(alunoVetor[i].getIdade());
		}
		
	}

}
