package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Creation_fiche_client
 */

@WebServlet(name = "Creation_fiche_client", urlPatterns = { "/Creation_fiche_client" })
public class Creation_fiche_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PREN = "prenom";
    public static final String CHAMP_NOMJEUNEFILLE = "nomjeunefille";
    public static final String CHAMP_DATENAISSANCE = "datedenaissance";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creation_fiche_client() {
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
		
        String nom = request.getParameter( CHAMP_NOM );
        String prenom = request.getParameter( CHAMP_PREN );
        String nomdejeunefille = request.getParameter( CHAMP_NOMJEUNEFILLE );
        String datedenaissance = request.getParameter( CHAMP_DATENAISSANCE );
        
        String nextJSP = "/resume_fiche_test.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
	}

}
