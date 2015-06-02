package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(name = "Recherche_Agence", urlPatterns = { "/recherche_agence" })
        
public class Recherche_Agence extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final String VUE = "/WEB-INF/recherche_agence.jsp";


       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Recherche_Agence() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      
        
    }


}
