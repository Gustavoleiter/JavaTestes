package br.com.arraylist.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.arraylist.model.Brigadeiro;



public class Teste {

	public static void main(String[] args) {
		
		
	

		
Brigadeiro brigadeiro1 = new Brigadeiro();

brigadeiro1.setApelidoBrigaderio(JOptionPane.showInputDialog("Digite o apelido"));
brigadeiro1.setPesoChocolate(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso")));

Brigadeiro brigadeiro2 = new Brigadeiro();

brigadeiro2.setApelidoBrigaderio(JOptionPane.showInputDialog("Digite o apelido"));
brigadeiro2.setPesoChocolate(Integer.parseInt(JOptionPane.showInputDialog("Digite o peso")));

List<Brigadeiro> brigaderioArray = new ArrayList<Brigadeiro>();

brigaderioArray.add(brigadeiro1);
brigaderioArray.add(brigadeiro2);
		
		for(Brigadeiro c : brigaderioArray)
		{
			System.out.println(c.getPesoChocolate() + " " + c.getApelidoBrigaderio() );
		}
	}

}
