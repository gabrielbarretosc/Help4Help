package br.ucsal.h4h.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ucsal.h4h.model.Instituicao;
import br.ucsal.h4h.util.Conexao;

public class InstituicaoDAO {

	private Conexao conexao;

	public InstituicaoDAO() {

		this.conexao = Conexao.getConexao();
	}

	public List<Instituicao> listar() {

		Statement stmt;
		List<Instituicao> instituicoes = new ArrayList<>();
		try {
			stmt = conexao.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select id_instituicao,nome_instituicao, login_instituicao, senha_instituicao, email_instituicao, telefone_instituicao from instituicoes");
			while (rs.next()) {
				
				Instituicao i= new Instituicao ();
				i.setId(rs.getInt("id_instituicao"));
				i.setLogin(rs.getString("login_instituicao"));
				i.setEmail(rs.getString("email_instituicao"));
				i.setNome(rs.getString("nome_instituicao"));
				i.setSenha(rs.getString("senha_instituicao"));
				i.setTelefone(rs.getString("telefone_instituicao"));
						instituicoes.add(i);
				
			}
			stmt.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return instituicoes;

	}

	public void inserir(Instituicao instituicao) {
		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("Insert into instituicoes (login_instituicao, senha_instituicao, nome_instituicao, telefone_instituicao, email_instituicao) values (?,?,?,?,?);");
			ps.setString(1, instituicao.getLogin() );
			ps.setString(2, instituicao.getSenha());
			ps.setString(3, instituicao.getNome());
			ps.setString(4, instituicao.getTelefone());
			ps.setString(5, instituicao.getEmail());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Instituicao getByID(int cod) {

		Instituicao i = null;

		try {
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("select id_instituicao,nome_instituicao, login_instituicao, senha_instituicao, email_instituicao, telefone_instituicao from instituicoes where id=?");
			ps.setInt(1, cod);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				i = new Instituicao();
				i.setId(rs.getInt("id_instituicao"));
				i.setLogin(rs.getString("login_instituicao"));
				i.setEmail(rs.getString("email_instituicao"));
				i.setNome(rs.getString("nome_instituicao"));
				i.setSenha(rs.getString("senha_instituicao"));
				i.setTelefone(rs.getString("telefone_instituicao"));
	
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;

	}

	public void close() {
		conexao.closeConnection();
	}
	
	public void delete(int id) {
		PreparedStatement ps;
		try {
			ps = conexao.getConnection().prepareStatement("delete from instituicoes where id=?");
			ps.setInt(1, id);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void update(Instituicao instituicao) {
		try {
			
			PreparedStatement ps = conexao.getConnection()
					.prepareStatement("update instituiocoes set nome_instituicao=?,telefone_instituicao = ?, senha_instituicao = ? where id =?;");
			ps.setString(1, instituicao.getNome());
			ps.setString(2, instituicao.getTelefone());
			ps.setString(3, instituicao.getSenha());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}