
package br.ucsal.h4h.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadTables {

	public void creatScherma(Connection c) throws SQLException {

		Statement stmt = c.createStatement();
		/*
        stmt.execute("CREATE TABLE USUARIOS(ID_USUARIO INTEGER,NOME_USUARIO VARCHAR(255), LOGIN_USUARIO VARCHAR(255), cpf_usuario varchar(255), telefone_usuario varchar(255),email_usuario varchar(255),endereco_usuario varchar(255), senha_usuario varchar(16));");
        stmt.execute("CREATE TABLE DOACOES(id_doacao integer,id_usuario, id_instituicao int, id_tipo_doacao integer, data_doacao varchar(12), quantidade varchar(30));");
        stmt.execute("CREATE TABLE INSTITUICOES(id_instituicao integer, login varchar(16), senha varchar(16), email varchar,nome_instituicao varchar, telefone varchar, id_tipo_doacao integer);");
        stmt.execute("CREATE TABLE TIPO_DOACAO(ID_TIPO_DOACAO INTEGER, NOME_TIPO VARCHAR(30))");
        stmt.execute("ALTER TABLE TIPO_DOACAO ADD CONSTRAINT PK_TIPO_DOACAO PRIMARY KEY(id_tipo_doacao)");
        stmt.execute("ALTER TABLE USUARIOS ADD CONSTRAINT pk_usuario PRIMARY KEY (id_usuario);");
        stmt.execute("ALTER TABLE INSTITUICOES ADD CONSTRAINT pk_instituicao PRIMARY KEY (id_instituicao);");
        stmt.execute("ALTER TABLE DOACOES ADD CONSTRAINT fk_doacao_usuario FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario);");
        stmt.execute("ALTER TABLE DOACOES ADD CONSTRAINT fk_doacao_instituicao FOREIGN KEY (id_instituicao) REFERENCES instituicao (id_instituicao);");
        stmt.execute("ALTER TABLE DOACOES ADD CONSTRAINT fk_doacao_tipo FOREIGN KEY (id_tipo_doacao) REFERENCES tipo_doacao(id_tipo_doacao)");
	*/
	}
}
