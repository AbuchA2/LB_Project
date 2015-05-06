package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Choix_produits
 */
@WebServlet(name = "Choix_produits", urlPatterns = { "/choix_produits" })

public class Choix_produits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/choix_produits.jsp";
	
	public static final String CHAMP_LIVRET = "livretA";
    public static final String CHAMP_PEL = "pel";
    public static final String CHAMP_COMPTE = "comptebancaire";
    public static final String CHAMP_CARTE = "cartebancaire";
    public static final String CHAMP_SUIVANT = "suivant";
    public static final String CHAMP_ANNUL = "annuler";
    
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Choix_produits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
