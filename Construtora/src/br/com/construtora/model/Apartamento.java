package br.com.construtora.model;

public class Apartamento extends Residencia {
	private int andar;

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}
	public void mostrarAtributos() {
		System.out.println("Esse é o nome  : " + getNome()+
				"\nEsses são os metros quadrados construidos : " + getMetrosQuadradosConstruidos() + 
				"\nEssa e a quantidade de metros quadrados do terreno : "+ getMetrosQuadradosTerreno()+
				"\nE esse o andar do apartamento : "+getAndar());
		
	}
	
}
