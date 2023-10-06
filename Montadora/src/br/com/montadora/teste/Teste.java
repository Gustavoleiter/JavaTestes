package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro = new Carro();
		Carro [] carroVetor = new Carro[3];
		
		
		String modelo = "";
		double peso = 0;
		int quantidadePortas = 0;
		
		
		for(int i = 0 ; i < 3 ; i ++)
		{
			 modelo = JOptionPane.showInputDialog("Digite o modelo do"+ (1+i)+ "ª carro");
			 quantidadePortas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas do " +(1+i) +"ª carro"));
			 peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do "+(1+i) + "ª carro"));
			 	
			 	carroVetor[i] = new Carro();
			 	carroVetor[i].setModelo(modelo);
				carroVetor[i].setQunatidadePortas(quantidadePortas);
				carroVetor[i].setPeso(peso);
			 
			}
			
			for(int i = 0; i < 3 ; i++)
			{
				System.out.println("Essse e o seu modelo : "+ carroVetor[i].getModelo()+
				"A quantidade de portas " +carroVetor[i].getQuantidadePortas() +
				"E o peso do carro : " + carroVetor[i].getPeso());
			}
	}

}
