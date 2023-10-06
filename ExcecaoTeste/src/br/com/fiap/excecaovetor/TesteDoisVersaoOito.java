package br.com.fiap.excecaovetor;

public class TesteDoisVersaoOito {

	public static void main(String[] args) {
		int[] numero = { 2, 4, 8, 16, 32, 64 };
		int[] denom = { 2, 2, 0, 2, 0 };
		for (int i = 0; i < numero.length; i++) {
			try {
				System.out.println("Resulado: " + numero[i] / denom[i]);
			} catch (Exception e) {
				System.out.println(" \n" + e.getMessage());
				e.printStackTrace();
			}
		}
	}
}
