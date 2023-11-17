package br.com.motorola.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class Selecionar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		CelularDAO celulardao = new CelularDAO(con);////////
		
		ArrayList<Celular> lista = celulardao.retornardados();
		
		if(lista != null)
		{
			for(Celular celular : lista)
			{
				System.out.println("Modelo do celular " + celular.getGustavoModelo());
				System.out.println("Peso do Celular " + celular.getGustavoPeso());
				System.out.println("Altura do celular " + celular.getGustavoAlturaDaTela());
				System.out.println("Altura do celular " + celular.getGustavoLarguraDaTela ()+ "\n");
			}
		}
		
		
	}
}
