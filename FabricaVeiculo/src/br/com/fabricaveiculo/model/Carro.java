package br.com.fabricaveiculo.model;

public class Carro extends Veiculo{
	private int quantidadePortas;
	private double pesoEngate;
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public double getPesoEngate() {
		return pesoEngate;
	}
	public void setPesoEngate(double pesoEngate) {
		this.pesoEngate = pesoEngate;
	}
	public void mostrarAtributos() {
		System.out.println("Esse é o modelo do carro : " + getModelo()+
				"\nE esse e o peso dele : " + getPeso() + 
				"\nEssa e a quantidade de portas: "+ getQuantidadePortas()+
				"\nE esse o peso de engate : "+getPesoEngate());
		
	}
	public double retornarPesoTotal() {
		double pesoTotal = getPesoEngate()+ getPeso();
		return pesoTotal;
	}
}
