package br.com.montadora.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora.model.Carro;

public class testeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = new Carro();
		
		
		carro.setModelo("Civic");
		carro.setPeso(1234.27);
		carro.setQunatidadePortas(4);
		
		Carro carroDois = new Carro();
		
		carroDois.setModelo("HRV");
		carroDois.setPeso(1433.27);
		carroDois.setQunatidadePortas(4);

		
		List<Carro> vetorListaCarro = new ArrayList<Carro>();
		
		vetorListaCarro.add(carro);
		vetorListaCarro.add(carroDois);
		
		for(Carro c : vetorListaCarro)
		{
			System.out.println(c.getModelo() + " " + c.getPeso() + " " + c.getQuantidadePortas() );
		}
		
		
		
	}

}
