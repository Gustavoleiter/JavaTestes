package br.com.projetoconstrutora.teste;

import javax.swing.JOptionPane;

import br.com.projetoconstrutora.model.Casa;
import br.com.projetoconstrutora.model.Residencia;


public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa casa = new Casa();
		casa.setMetrosQuadrados(Double.parseDouble((JOptionPane.showInputDialog("Digite o tamanho em metros de sua casa :"))));
		casa.setMetrosQuadrados(Double.parseDouble((JOptionPane.showInputDialog("Digite o tamanho do portao de sua cas :"))));
		System.out.println("Tamanho em metros quadrados da casa: " + casa.getMetrosQuadrados() +
	  			 "\nTamanho da porta de sua casa " + casa.getTamanhoPortalMetrosQuadrados());
		
		Residencia residencia = new Residencia();
		residencia.setMetrosQuadrados(Double.parseDouble((JOptionPane.showInputDialog("Digite o tamanho em metros de sua casa :"))));

		System.out.println("Tamanho em metros quadrados da residencia: " +residencia.getMetrosQuadrados());
	  			 

}
}