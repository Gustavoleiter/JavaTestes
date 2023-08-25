package br.com.construtora.main;

import javax.swing.JOptionPane;

import br.com.construtora.model.Apartamento;
import br.com.construtora.model.Casa;



public class Teste {

	public static void main(String[] args) {
		Casa casa = new Casa();
		
		casa.setNome((JOptionPane.showInputDialog("Digite o nome :")));
		casa.setMetrosQuadradosConstruidos(Double.parseDouble((JOptionPane.showInputDialog("Digite tamanho da area construida:"))));
		casa.setMetrosQuadradosTerreno(Double.parseDouble((JOptionPane.showInputDialog("Digite o tamanho do terreno :"))));
		casa.setTipoTelhado((JOptionPane.showInputDialog("Digite o tipo de telhado :")));
	
		casa.mostrarAtributos();
		System.out.println("O tamanho total do terreno e "+casa.retornarMetrosTotais());
		
		Apartamento apartamento = new Apartamento();
		apartamento.setNome((JOptionPane.showInputDialog("Digite o nome :")));
		apartamento.setMetrosQuadradosConstruidos(Double.parseDouble((JOptionPane.showInputDialog("Digite tamanho da area construida:"))));
		apartamento.setMetrosQuadradosTerreno(Double.parseDouble((JOptionPane.showInputDialog("Digite o tamanho do terreno :"))));
		apartamento.setAndar(Integer.parseInt((JOptionPane.showInputDialog("Digite o andar do apartamento :"))));
	
		apartamento.mostrarAtributos();
	}

}
