package br.com.motorola.model;

public class Celular extends Telefone{

	public int getGustavoAlturaDaTela() {
		return gustavoAlturaDaTela;
	}
	public void setGustavoAlturaDaTela(int gustavoAlturaDaTela) {
		this.gustavoAlturaDaTela = gustavoAlturaDaTela;
	}
	public int getGustavoLarguraDaTela() {
		return gustavoLarguraDaTela;
	}
	public void setGustavoLarguraDaTela(int gustavoLarguraDaTela) {
		this.gustavoLarguraDaTela = gustavoLarguraDaTela;
	}
	private int gustavoAlturaDaTela;
	private int gustavoLarguraDaTela;
}
