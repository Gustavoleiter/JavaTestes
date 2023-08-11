package br.com.projetozoologico.teste;

import br.com.projetozoologico.model.Mamifero;
import br.com.projetozoologico.model.Reptil;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ctrl + shift + o para importar automaticamente 
		
		 Mamifero mamifero = new Mamifero();
		 
		 mamifero.setNome("Jhon");
		 mamifero.setPeso(11.5);
		 mamifero.setTempoGestacao(9.0);
		  System.out.println("Nome do mamifero: " + mamifero.getNome() +
				  			 "\nPeso do mamifero " + mamifero.getPeso() +
				  			 "\nTempo de gestação " + mamifero.getTempoGestacao());
		  
		  
		  //INSTANCIANDO REPTIL
		  
		  Reptil reptil = new Reptil();
			 
			 reptil.setNome("Simon");
			 reptil.setPeso(12.0);
			 reptil.setCorPrincipalPele("Preto");
			  System.out.println("Nome do reptil: " + reptil.getNome() +
					  			 "\nPeso do reptil " + reptil.getPeso() +
					  			 "\nCor da pele do reptil " + reptil.getCorPrincipalPele());
		 
		 
		 
		 
	
		 
	
	}

}
