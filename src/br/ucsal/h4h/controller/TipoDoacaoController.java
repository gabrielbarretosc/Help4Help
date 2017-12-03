package br.ucsal.h4h.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.TipoDoacaoDAO;
import br.ucsal.h4h.model.TipoDoacao;

@WebServlet("/tiposdoacoes")
public class TipoDoacaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String q = request.getParameter("q");
		if (q != null && q.equals("new")) {
			request.getRequestDispatcher("formTipoDoacao.jsp").forward(request, response);
		} else {
			TipoDoacaoDAO dao = new TipoDoacaoDAO();
			request.setAttribute("listatipo", dao.listar());
			request.getRequestDispatcher("tipolist.jsp").forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nomeTipo = request.getParameter("nomeTipo");
		TipoDoacao td = new TipoDoacao();
		td.setNomeTipo(nomeTipo);
		TipoDoacaoDAO dao = new TipoDoacaoDAO();
		dao.inserir(td);
		
		
		request.setAttribute("listatipo", dao.listar());
		request.getRequestDispatcher("tipolist.jsp").forward(request, response);
	}

}
