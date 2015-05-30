package br.projeto.logistica.persistence;

import java.sql.SQLException;

import br.projeto.logistica.model.Caminhao;

public interface CaminhaoDAO {
	
	public void cadastraCaminhao(Caminhao c) throws SQLException;
	public void alteraCaminhao(Caminhao c) throws SQLException;
	public Caminhao consultaCaminhao(String placa) throws SQLException;
	
}
