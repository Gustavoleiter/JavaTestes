package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public static Connection abrirConexao {
	Connection con = null;
	try
	{
	Class.forName("");
	String url = "";
	final String USER = "";
	final String PASS = "";
	con = DriverManager.getConnection(url, "USER", "PASS");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println(e.getMessage()+ "Erro no envio dos dados");
	}
	catch(SQLExepction e)
	{
		System.out.println(e.getMessage()+ "Erro no envio dos dados");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage()+ "Erro no envio dos dados");
	}
	return con;

}
