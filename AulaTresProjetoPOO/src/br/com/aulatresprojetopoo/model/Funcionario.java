package br.com.aulatresprojetopoo.model;

public class Funcionario extends Pessoas{
	private Double salario;
	private String setor;
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}

}
