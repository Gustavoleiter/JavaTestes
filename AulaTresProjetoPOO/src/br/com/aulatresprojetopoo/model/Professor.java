package br.com.aulatresprojetopoo.model;

public class Professor extends Pessoas{
	private Double salario;
	private String materia;
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
}
