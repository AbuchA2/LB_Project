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
    public static final String CHAMP_CARTENATIONALE = "cartebancairenationale";
    public static final String CHAMP_CARTEINTERNATIONALE = "cartebancaireinternationale";
    public static final String CHAMP_CARTEPLATINE = "cartebancaireplatine";

    
	
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
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String livretA = request.getParameter( CHAMP_LIVRET );
        String pel = request.getParameter( CHAMP_PEL );
        String comptebancaire = request.getParameter( CHAMP_COMPTE );
        String cartebancairenationale = request.getParameter( CHAMP_CARTENATIONALE );
        String cartebancaireinternationale = request.getParameter( CHAMP_CARTEINTERNATIONALE );
        String cartebancaireplatine = request.getParameter( CHAMP_CARTEPLATINE );
        
	}

}
