package br.ucsal.h4h.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ucsal.h4h.dao.InstituicaoDAO;
import br.ucsal.h4h.model.Instituicao;

@WebServlet("/CadastrarInstituicao")
public class CadastrarInstituicao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        String login = request.getParameter("login");
	        String senha = request.getParameter("senha");
	        String email = request.getParameter("email");
	        String nome = request.getParameter("nome");
	        String tel = request.getParameter("telefone");
	        
	        Instituicao i = new Instituicao();
	        i.setLogin(login);
	        i.setSenha(senha);
	        i.setEmail(email);
	        i.setNome(nome);
	        i.setTelefone(tel);
	        
	        InstituicaoDAO dao = new InstituicaoDAO();
	            dao.inserir(i);
	      	  response.sendRedirect("agradecimento.jsp");

	}

}
