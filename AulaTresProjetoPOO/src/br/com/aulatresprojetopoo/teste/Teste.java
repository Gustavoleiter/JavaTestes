package br.com.aulatresprojetopoo.teste;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciando Aluno
		
		Aluno aluno = new Aluno();
		 
		aluno.setNome("Gustavo");
		aluno.setIdade(23);
		aluno.setRm(222045);
		  System.out.println("Nome do aluno: " + aluno.getNome() +
				  			 "\nIdade do aluno " + aluno.getIdade() +
				  			 "\nRM do aluno " + aluno.getRm());
		  
		  
		  // Instanciando Professor
		  
			Professor professor = new Professor();
			JOptionPane.showInputDialog("Digite a idade do filho"))
			 
			professor.setNome("Monica");
			professor.setIdade(38);
			professor.setMateria("Pyton");
			professor.setSalario(5689.0);
			  System.out.println("Nome do professor: " + professor.getNome() +
					  			 "\nIdade do professor " + professor.getIdade() +
					  			 "\nMateria do professor " + professor.getMateria()+
					  			 "\nSalario do professor " + professor.getSalario());
			  
			  //Instanciando Funcionario
				Funcionario funcionario = new Funcionario();
				 
				funcionario.setNome("Monica");
				funcionario.setIdade(38);
				funcionario.setSetor("Diretoria");
				funcionario.setSalario(3789.0);
				
				 System.out.print("Digite o nome do funcionario: ");
			         = scanner.nextInt();

			        System.out.print("Digite um número decimal: ");
			        double numeroDecimal = scanner.nextDouble();

			        System.out.print("Digite uma palavra: ");
			        String palavra = scanner.next();
				  System.out.println("Nome do funcionario: " + funcionario.getNome() +
						  			 "\nIdade do funcionario " + funcionario.getIdade() +
						  			 "\nSetor do funcionario " + funcionario.getSetor()+
						  			 "\nSalario do funcionario " + funcionario.getSalario());
				  Scanner scanner = new Scanner(System.in);

			       

	}

}
