package br.com.projetomontadora.model;

public class Moto extends Veiculo {


	private int QuantidadeAdesivos;

	public int getQuantidadeAdesivos() {
		return QuantidadeAdesivos;
	}

	public void setQuantidadeAdesivos(int quantidadeAdesivos) {
		QuantidadeAdesivos = quantidadeAdesivos;
	}
	public String mostrarMotos{
		return "Modelo do moto: "  getModelo()+
				 "\nQuantidade de adesivos da moto "  getQuantidadeAdesivos()+
				 "\nPeso do moto "  getPeso();
	}
}
