package br.com.aulatresprojetopoo.teste;

import javax.swing.JOptionPane;

import br.com.aulatresprojetopoo.model.Aluno;
import br.com.aulatresprojetopoo.model.Funcionario;
import br.com.aulatresprojetopoo.model.Professor;

public class TesteDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		aluno.setIdade(Integer.parseInt((JOptionPane.showInputDialog("Digite a idade do aluno"))));
		aluno.setRm(Integer.parseInt((JOptionPane.showInputDialog("Digite o RM do aluno"))));
		 System.out.println("Nome do aluno: " + aluno.getNome() +
	  			 "\nIdade do aluno " + aluno.getIdade() +
	  			 "\nRM do aluno " + aluno.getRm());
		 
		 Professor professor = new Professor();
		 professor.setNome(JOptionPane.showInputDialog("Digite o nome do aluno"));
		 professor.setIdade(Integer.parseInt((JOptionPane.showInputDialog("Digite a idade do professor"))));
		 professor.setSalario(Double.parseDouble((JOptionPane.showInputDialog("Digite o salario do professor"))));
		 professor.setMateria(JOptionPane.showInputDialog("Digite a materia do professor"));
			System.out.println("Nome do professor: " + professor.getNome() +
		  			 "\nIdade do professor " + professor.getIdade() +
		  			 "\nMateria do professor " + professor.getMateria()+
		  			 "\nSalario do professor " + professor.getSalario());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
			funcionario.setIdade(Integer.parseInt((JOptionPane.showInputDialog("Digite a idade do funcionario"))));
			funcionario.setSalario(Double.parseDouble((JOptionPane.showInputDialog("Digite o salario do funcionario"))));
			funcionario.setSetor(JOptionPane.showInputDialog("Digite a setor do funcionario"));
			System.out.println("Nome do funcionario: " + funcionario.getNome() +
		  			 "\nIdade do funcionario " + funcionario.getIdade() +
		  			"\nSalario do funcionario " + funcionario.getSalario()+
		  			 "\nSetor do funcionario " + funcionario.getSetor());
		

	}

}
