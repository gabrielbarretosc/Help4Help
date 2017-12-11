package br.ucsal.h4h.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.UsuarioDAO;
import br.ucsal.h4h.model.Usuario;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		UsuarioDAO dao = new UsuarioDAO();

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);

		if(!dao.Autenticar(usuario)){
			System.out.println(login);
			System.out.println(senha);
			System.out.println("NÃO LOGOU");
            response.sendRedirect("/help4help/login");	
		} else {
			System.out.println("LOGOU");
			request.getSession().setAttribute("usuario", login);
            request.getRequestDispatcher("principal.jsp").forward(request, response);
		}	
	}
}
