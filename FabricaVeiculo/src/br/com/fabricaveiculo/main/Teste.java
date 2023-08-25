package br.com.fabricaveiculo.main;

import javax.swing.JOptionPane;

import br.com.fabricaveiculo.model.Carro;



public class Teste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setModelo((JOptionPane.showInputDialog("Digite o modelo do carro :")));
		carro.setPeso(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do carro :"))));
		carro.setPesoEngate(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso de engate :"))));
		carro.setQuantidadePortas(Integer.parseInt((JOptionPane.showInputDialog("Digite a quantidade de portas :"))));
		
	
		carro.mostrarAtributos();
		System.out.println("O peso total do carro e de "+carro.retornarPesoTotal());

	}

}
