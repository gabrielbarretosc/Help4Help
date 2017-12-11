package br.ucsal.h4h.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.DoacaoDAO;
import br.ucsal.h4h.dao.InstituicaoDAO;
import br.ucsal.h4h.dao.UsuarioDAO;
import br.ucsal.h4h.model.Doacao;
import br.ucsal.h4h.model.Instituicao;
import br.ucsal.h4h.model.Usuario;


@WebServlet("/CadastrarDoacao")
public class CadastrarDoacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
		String qtd = request.getParameter("quantidade");
		String usuario = request.getParameter("usuario");
		String Instituicao = request.getParameter("instituicao");
		String tipoDoacao = request.getParameter("tipoDoacao");
		
		Doacao d= new Doacao();	
		UsuarioDAO daoU= new UsuarioDAO();
		int cod= Integer.parseInt(usuario);
		Usuario u = daoU.getByID(cod);
		d.setUsuario(u);
		d.setDataDoacao(data);
		d.setQuantidade(qtd);
		InstituicaoDAO daoI= new InstituicaoDAO();
		int cod2= Integer.parseInt(Instituicao);
		Instituicao i = daoI.getByID(cod2);
		d.setInstituicao(i);
	
		d.setTipoDoacao(tipoDoacao);
		
		DoacaoDAO daoD= new DoacaoDAO();
		daoD.inserir(d);
		
		
		
		response.sendRedirect("principal.jsp");
	}

}
