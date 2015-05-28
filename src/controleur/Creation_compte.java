package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.StoreData;

/**
 * Servlet implementation class Creation_compte
 */

@WebServlet(name = "Creation_compte", urlPatterns = { "/creation_compte" })

public class Creation_compte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_NOM_USER = "inputUserName";
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_PASS2 = "confirmpasse";
    public static final String CHAMP_EMAIL = "email";
    public static final String CHAMP_EMAIL2 = "confirmmail";

    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creation_compte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_compte.jsp").forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String nomutilisateur = request.getParameter( CHAMP_NOM_USER );
        String motdepasse = request.getParameter( CHAMP_PASS );
        String confirmpasse = request.getParameter( CHAMP_PASS2 );
        String email = request.getParameter( CHAMP_EMAIL );
        String confirmail = request.getParameter( CHAMP_EMAIL2 );
        
        System.out.println(nomutilisateur);
        System.out.println(motdepasse);
        System.out.println(email);
        
        StoreData.inscription(nomutilisateur, motdepasse, email);
        
        String nextJSP = "/confirmation_inscription.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
	}

}
