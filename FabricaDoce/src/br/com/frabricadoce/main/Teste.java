package br.com.frabricadoce.main;

import javax.swing.JOptionPane;

import br.com.frabricadoce.model.Brigadeiro;
import br.com.frabricadoce.model.Doce;

public class Teste {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce((JOptionPane.showInputDialog("Digite o nome do doce :")));
		brigadeiro.setPesoAcucar(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do doce :"))));
		brigadeiro.setPesoChocolate(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do chocolate :"))));
		
		brigadeiro.retornarDadosString();
		System.out.println(brigadeiro.retornarDadosStringReturn());
		System.out.println(brigadeiro.retornarPesoTotal());
		
		

		/*Doce doce = new Doce();
		
		doce.setNomeDoce((JOptionPane.showInputDialog("Digite o nome do doce :")));
		doce.setPesoAcucar(Double.parseDouble((JOptionPane.showInputDialog("Digite o peso do doce :"))));
		
		System.out.println("Esse é o nome do doce : " +doce.getNomeDoce()+ ", e esse e o peso dele : " + doce.getPesoAcucar());
		*/
	}

}
