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
 * Servlet implementation class Validation_souscription
 */
@WebServlet(name = "Modification_Profil", urlPatterns = "/modification_profil")
public class Modification_Profil extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_PASS2 = "confirmpasse";
    public static final String CHAMP_EMAIL = "email";
    public static final String CHAMP_EMAIL2 = "confirmmail";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Modification_Profil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/modification_profil.jsp").forward(request, response) ;
		
		
//		request.setAttribute("person", StoreData.getProfil((String) s.getAttribute("username")));
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession(true);
	    String password = request.getParameter( CHAMP_PASS );
	    String email = request.getParameter( CHAMP_EMAIL );
		StoreData.modificationprofil((String) s.getAttribute("username"), password, email);
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/page_accueil.jsp").forward(request, response) ;
		System.out.println ("Ca marche");
	}

}
