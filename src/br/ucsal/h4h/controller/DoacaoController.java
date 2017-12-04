package br.ucsal.h4h.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.DoacaoDAO;
import br.ucsal.h4h.dao.InstituicaoDAO;
import br.ucsal.h4h.dao.TipoDoacaoDAO;
import br.ucsal.h4h.dao.UsuarioDAO;
import br.ucsal.h4h.model.Doacao;
import br.ucsal.h4h.model.Instituicao;
import br.ucsal.h4h.model.TipoDoacao;
import br.ucsal.h4h.model.Usuario;

@WebServlet("/doacoes")
public class DoacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q = request.getParameter("q");
		if (q != null && q.equals("new")) {
			//UsuarioDAO dao = new UsuarioDAO();
			//request.setAttribute("listaUsuario", dao.listar());
			InstituicaoDAO dao2 = new InstituicaoDAO ();
			request.setAttribute("listaInstituicao", dao2.listar());
			request.getRequestDispatcher("formDoacao.jsp").forward(request, response);
		}else {
			DoacaoDAO dao = new DoacaoDAO();
			request.setAttribute("listaDoacao", dao.listar());
			request.getRequestDispatcher("doacaolist.jsp").forward(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String data = request.getParameter("data");
		String qtd = request.getParameter("quantidade");
		//String Usuario = request.getParameter("usuario");
		String Instituicao = request.getParameter("instituicao");
		String tipoDoacao = request.getParameter("tipoDoacao");
		
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
		d.setTipoDoacao(tipoDoacao);
		DoacaoDAO daoD= new DoacaoDAO();
		daoD.inserir(d);
		
		request.setAttribute("listaDoacao",daoD.listar() );
		request.getRequestDispatcher("doacaolist.jsp").forward(request, response);
		
		
	}

}