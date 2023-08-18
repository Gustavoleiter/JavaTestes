package br.com.projetomontadora.model;

public class Veiculo {
	private static String Modelo;
	private Double Peso;
	public static String getModelo() {
		return Modelo;
	}
	public static void setModelo(String modelo) {
		Modelo = modelo;
	}
	public Double getPeso() {
		return Peso;
	}
	public void setPeso(Double peso) {
		Peso = peso;
	}
	

}
