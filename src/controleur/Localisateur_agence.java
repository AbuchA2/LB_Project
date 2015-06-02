package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class LogOut
 */

@WebServlet(name = "Localisateur_agence", urlPatterns = { "/localisateur_agence" })
public class Localisateur_agence extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String CHAMP_ADRESSE = "adresse";

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Localisateur_agence() {
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
		StoreData.getLocalisation();
		
		HttpSession s = request.getSession(true);
		
		String adresse = request.getParameter( CHAMP_ADRESSE );
		
		request.setAttribute("adresse", adresse);
		request.setAttribute("agences", StoreData.getLocalisation());

		System.out.println(StoreData.getLocalisation());

    	this.getServletContext().getRequestDispatcher("/WEB-INF/localisateur_agence.jsp").forward(request, response) ;
        
 
	}

}
