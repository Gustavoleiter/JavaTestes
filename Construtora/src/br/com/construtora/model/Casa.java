package br.com.construtora.model;

public class Casa extends Residencia{
	private String tipoTelhado;

	public String getTipoTelhado() {
		return tipoTelhado;
	}

	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}
	public void mostrarAtributos() {
		System.out.println("Esse é o nome  : " + getNome()+
				"\nEsses são os metros quadrados construidos : " + getMetrosQuadradosConstruidos() + 
				"\nEssa e a quantidade de metros quadrados do terreno : "+ getMetrosQuadradosTerreno()+
				"\nE esse o andar do apartamento : "+getTipoTelhado());
		
	}
	public double retornarMetrosTotais() {
		double metrosTotais = getMetrosQuadradosConstruidos()+ getMetrosQuadradosTerreno();
		return metrosTotais;
	}
}
