package br.com.projetomontadora.teste;

import javax.swing.JOptionPane;

import br.com.projetomontadora.model.Carro;
import br.com.projetomontadora.model.Moto;



public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Carro carro = new Carro();
				carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro :"));
				carro.setQuantidadePortas(Integer.parseInt((JOptionPane.showInputDialog("Digite o numero de portas "))));
				carro.setPeso(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do carro"))));
		 
				System.out.println(carro.mostarAtributos());
			
			Moto moto = new Moto();
			moto.setModelo(JOptionPane.showInputDialog("Digite o modelo do moto :"));
			moto.setQuantidadeAdesivos(Integer.parseInt((JOptionPane.showInputDialog("Digite o numero de adesivos na moto: "))));
			moto.setPeso(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do moto"))));
				 
System.out.println(moto.mostrarMotos);
	}

}
