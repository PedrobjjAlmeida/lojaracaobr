package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;



/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {"/Controller", "/main"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//criando objetos para acessar a camada model
	JavaBeans javabeans = new JavaBeans();
	DAO dao = new DAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//teste conecao
		//dao.testarConexao();
		
		// a linha abaixo cria uma variável de nome action que recebe a requisição
				String action = request.getServletPath();
				System.out.println(action);
				
				// encaminhamento das requisições
				if (action.equals("/main")) {
				
				//encaminhar para o método estoque
					estoque(request, response);
				}
			}
			
			/**
			 * metodo responsavel pela listagem dos contatos
			 * @param request
			 * @param response
			 * @throws ServletException
			 * @throws IOException
			 */
			protected void estoque(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//dao.listarProdutos();
				//Passos 2 "DAO "e 6 "RECEBIMENTO JAVABEANS" -> executar o metodo listar produtos
				ArrayList<JavaBeans> lista = dao.listarProdutos(); 
				//Despachar a lista para o documento agenda.jsp (Passo 7)
				request.setAttribute("javabeans", lista);
				RequestDispatcher rd = request.getRequestDispatcher("estoque.jsp");
				rd.forward(request, response);
				//Passo 7
				//response.sendRedirect("estoque.jsp"); 
			}

		}

		
	
