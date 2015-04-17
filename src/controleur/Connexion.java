package controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(name = "onnexion", urlPatterns = { "/connexion" })
        
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final String VUE = "/WEB-INF/inscription.jsp";
    public static final String CHAMP_EMAIL = "email";
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_CONF = "confirmation";
    public static final String CHAMP_NOM = "nom";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String email = request.getParameter( CHAMP_EMAIL );
        String motDePasse = request.getParameter( CHAMP_PASS );
        String confirmation = request.getParameter( CHAMP_CONF );
        String nom = request.getParameter( CHAMP_NOM );

        try {
            validationEmail( email );
            validationMotsDePasse( motDePasse, confirmation );
            validationNom( nom );
        } catch (Exception e) {
            /* Gérer les erreurs de validation ici. */
        }
    }

    private void validationEmail( String email ) throws Exception{}
    private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{}
    private void validationNom( String nom ) throws Exception{}
		
}