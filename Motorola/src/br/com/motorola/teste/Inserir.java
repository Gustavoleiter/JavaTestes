package br.com.motorola.teste;

import java.sql.Connection;

import br.com.motorola.conexao.Conexao;
import br.com.motorola.dao.CelularDAO;
import br.com.motorola.model.Celular;



public class Inserir {

public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Celular celular = new Celular();
		CelularDAO celulardao = new CelularDAO(con);////////
		
		celular.setGustavoModelo("iphone20");
		celular.setGustavoPeso(12);
		celular.setGustavoAlturaDaTela(11);
		celular.setGustavoLarguraDaTela(6);
		System.out.println(celulardao.inserir(celular));
		
		Conexao.fecharConexao(con);
	}

}
