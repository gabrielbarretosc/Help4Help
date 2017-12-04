package br.ucsal.h4h.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.DoacaoDAO;
import br.ucsal.h4h.dao.InstituicaoDAO;
import br.ucsal.h4h.model.Doacao;
import br.ucsal.h4h.model.Instituicao;


@WebServlet("/CadastrarDoacao")
public class CadastrarDoacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
		String qtd = request.getParameter("quantidade");
		//String Usuario = request.getParameter("usuario");
		String Instituicao = request.getParameter("instituicao");
		
		
		Doacao d= new Doacao();	
		d.setDataDoacao(data);
		d.setQuantidade(qtd);
		//UsuarioDAO daoU= new UsuarioDAO();
		//int cod= Integer.parseInt(Usuario);
		//Usuario u = daoU.getByID(cod);
		//d.setUsuario(u);
		InstituicaoDAO daoI= new InstituicaoDAO();
		int cod2= Integer.parseInt(Instituicao);
		Instituicao i = daoI.getByID(cod2);
		d.setInstituicao(i);
		
		DoacaoDAO daoD= new DoacaoDAO();
		daoD.inserir(d);
		
		response.sendRedirect("principal.jsp");
	}

}
