package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;

public class Alterar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular();
		CelularDAO professordao = new CelularDAO(con);////////
		
	
		celular.setGustavoModelo("nokia1a");
		celular.setGustavoPeso(12);
		System.out.println(professordao.modificar(celular));
		
		Conexao.fecharConexao(con);
	}

}
