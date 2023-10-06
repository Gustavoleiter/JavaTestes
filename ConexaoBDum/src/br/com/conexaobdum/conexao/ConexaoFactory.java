package br.com.conexaobdum.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public Connection getConnection() throws SQLException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection("jdbc:mysql://localhost/xe?useSSL=false","root","1234");
		}
		catch(ClassNotFoundException e)
		{
			throw new SQLException(e.getException());
		
		}
	}

}
