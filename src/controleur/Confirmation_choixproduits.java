package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Confirmation_inscription
 */

@WebServlet(name = "Confirmation_choixproduits", urlPatterns = { "/confirmation_choixproduits" })

public class Confirmation_choixproduits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_RETOUR = "retourmenu";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Confirmation_choixproduits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation_choixproduits.jsp").forward(request, response);
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String retour = request.getParameter( CHAMP_RETOUR );
		
		try{
			validationRetour( retour);
			
			} catch (Exception e) {
	            /* Gérer les erreurs de validation ici. */
	        }
		}
		private void validationRetour( String retour) throws Exception{}
	}