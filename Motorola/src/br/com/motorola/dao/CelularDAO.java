package br.com.motorola.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.motorola.model.Celular;


public class CelularDAO {
private Connection con = null;

	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CelularDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Celular celular) {
		String sql = "insert into celular(modelo, peso, gustavoalturadatela, gustavolarguradatela) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getGustavoModelo());
			ps.setInt(2, celular.getGustavoPeso());
			ps.setInt(3, celular.getGustavoAlturaDaTela());
			ps.setInt(4, celular.getGustavoLarguraDaTela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//M�todo deletar
	
	public String deletar(Celular celular) {
		String sql = "delete from celular where modelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getGustavoModelo());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//M�todoi deletar com o where no nome
	public String deletarWhereNome(Celular celular) {
		String sql = "delete from celular where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getGustavoModelo());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//M�todo deletar sem where
	
	public String deletarSemWhere() {
		String sql = "delete from celular";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso";
			} else {
				return "Erro deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	//Update
	public String modificar(Celular celular) {
		String sql = "update celular set modelo  = ? where peso = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1,  celular.getGustavoModelo());
			ps.setInt(2,  celular.getGustavoPeso());
			if (ps.executeUpdate() > 0) 
			{
				return "Alterado com sucesso";
			}
			else 
			{
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	//Select
	public ArrayList<Celular> retornardados(){
		String sql = "select * from celular";
		ArrayList<Celular> retornarCelular = new ArrayList<Celular>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				if(rs != null)
				{
					while(rs.next())
					{
						Celular celular = new Celular();
						celular.setGustavoModelo(rs.getString(1));
						celular.setGustavoPeso(rs.getInt(2));
						celular.setGustavoAlturaDaTela(rs.getInt(3));
						celular.setGustavoLarguraDaTela(rs.getInt(4));
						retornarCelular.add(celular);
					}
					return retornarCelular;
				}
				else
				{
					return null;
				}
		}
		catch(SQLException e)
		{
			return null;
		}
			
		
	}
}
