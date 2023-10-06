package br.com.fiap.excecaovetor;

import java.util.Scanner;

public class TesteDoisErrosVersaoNove {

	public static void main(String[] args) {
		System.out.println("Entre com um número: ");
		try {
			int recebeNum = lerNumero();
			System.out.println("Você digitou o número " + recebeNum);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}
	}

	public static int lerNumero () throws Exception{
		Scanner scan = new Scanner(System.in);
		int recebeNum = scan.nextInt();
		return recebeNum;
		}

}


