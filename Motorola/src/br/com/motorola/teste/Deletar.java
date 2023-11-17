package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;



public class Deletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular ();
		CelularDAO celulardao = new CelularDAO(con);////////
		
	
		
		System.out.println(celulardao.deletarSemWhere());
		
		Conexao.fecharConexao(con);
	}

}
