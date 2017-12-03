package br.ucsal.h4h.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logininstituicao")
public class LoginInstituicionalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("formLoginInstituicao").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("login");
		String senha = request.getParameter("senha");

		if (usuario.equalsIgnoreCase(senha)) {
			System.out.println("LOGOU");
			request.getSession().setAttribute("usuario", usuario);
			request.getRequestDispatcher("principalinstituicao.jsp").forward(request, response);
		} else {
			System.out.println("NÃO LOGOU");
			response.sendRedirect("logininstituicao.jsp");
		}
	}

}