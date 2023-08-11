package br.com.aulatresprojetopoo.model;

public class Pessoas {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 18) {
			System.out.println("Não pode ser menor de idade para realizar essa operação");
		} else {
			this.idade = idade;
		}
	}

	// para gerar automaticamento os get e sets va em source e genereteget
}
