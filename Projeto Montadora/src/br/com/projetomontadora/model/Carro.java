package br.com.projetomontadora.model;

public class Carro extends Veiculo {
	private int QuantidadePortas;

	public int getQuantidadePortas() {
		return QuantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		QuantidadePortas = quantidadePortas;
	}

	public String mostarAtributos() {
		return "\"Modelo do carro:" + getModelo()
				+ "\nQuantidade de portas do carro " + getQuantidadePortas() 
				+ "\nPeso do carro " + getPeso();
	}

}
