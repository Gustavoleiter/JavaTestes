package br.com.montadora.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.montadora.model.Carro;
import br.com.montadora.model.Moto;

public class TesteArrayListMoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moto moto = new Moto();
		
		moto.setModelo("Honda");
		moto.setPeso(134.27);
		moto.setQuantidadeAdesivos(1);
		
		
		Moto motoDois = new Moto();
		
		motoDois.setModelo("Suzuki");
		motoDois.setPeso(143.27);
		motoDois.setQuantidadeAdesivos(5);

		
		List<Moto> vetorListaMoto = new ArrayList<Moto>();
		
		vetorListaMoto.add(moto);
		vetorListaMoto.add(motoDois);
		
		for(Moto m : vetorListaMoto)
		{
			System.out.println(m.getModelo() + " " + m.getPeso() + " " + m.getQuantidadeAdesivos() );
		}
	}

}
