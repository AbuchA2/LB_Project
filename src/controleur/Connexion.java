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
@WebServlet(name = "Connexion", urlPatterns = { "/connexion" })
        
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final String VUE = "/WEB-INF/connexion.jsp";
    //public static final String VUE = "/WEB-INF/inscription.jsp";
    public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_SOUV = "souvenir";
//    public static final String CHAMP_EMAIL = "email";
//    public static final String CHAMP_CONF = "confirmation";

       
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

        String nom = request.getParameter( CHAMP_NOM );
        String motDePasse = request.getParameter( CHAMP_PASS );
        String souvenir = request.getParameter( CHAMP_SOUV );
        //String email = request.getParameter( CHAMP_EMAIL );
        //String confirmation = request.getParameter( CHAMP_CONF );


        try {
            //validationEmail( email );
            //validationMotsDePasse( motDePasse, confirmation );
            validationNom( nom );
            validationMotsDePasse( motDePasse );
            validationSouv( souvenir);
            
        } catch (Exception e) {
            /* Gérer les erreurs de validation ici. */
        }
    }

    //private void validationEmail( String email ) throws Exception{}
    //private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{}
    private void validationMotsDePasse( String motDePasse) throws Exception{}
	private void validationNom( String nom ) throws Exception{}
	private void validationSouv( String souvenir ) throws Exception{}
		
}