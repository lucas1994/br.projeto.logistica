package br.projeto.logistica.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.projeto.logistica.model.Caminhao;

public class CaminhaoDAOImpl implements CaminhaoDAO{
	
	private Connection con;
	
	public CaminhaoDAOImpl() {
		GenericDAO gDao = new GenericDAOImpl();
		con = gDao.getConnection();
	}

	@Override
	public void cadastraCaminhao(Caminhao c) throws SQLException {
		String sql = "INSERT INTO caminhao (placa, renavam, chassi, categoria, modelo, marca, anomodelo, eixo, cor, estado) VALUES ?,?,?,?,?,?,?,?,?,?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, c.getPlaca());
		ps.setString(2, c.getRenavam());
		ps.setString(3, c.getChassi());
		ps.setString(4, c.getCategoria());
		ps.setString(5, c.getModelo());
		ps.setString(6, c.getMarca());
		ps.setInt(7, c.getAnoModelo());
		ps.setInt(8, c.getEixo());
		ps.setString(9, c.getCor());
		ps.setString(10, c.getEstado());
		ps.execute();
		ps.close();
	}

	@Override
	public void alteraCaminhao(Caminhao c) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Caminhao consultaCaminhao(String placa) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
