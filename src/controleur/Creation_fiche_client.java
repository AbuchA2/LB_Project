package controleur;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.StoreData;

/**
 * Servlet implementation class creation_fiche_client
 */

@WebServlet(name = "Creation_fiche_client", urlPatterns = { "/creation_fiche_client" })
public class Creation_fiche_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PREN = "prenom";
    public static final String CHAMP_NOMJEUNEFILLE = "nom_de_jeune_fille";
    public static final String CHAMP_DATENAISSANCE = "date_de_naissance";
    public static final String CHAMP_ADRESSE = "adresse";
    public static final String CHAMP_USERMAIL = "user_mail";
    public static final String CHAMP_TEL = "tel";

    
       
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_fiche_client.jsp") ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String nom = request.getParameter( CHAMP_NOM );
        String prenom = request.getParameter( CHAMP_PREN );
        String nom_de_jeune_fille = request.getParameter( CHAMP_NOMJEUNEFILLE );
        Date date_de_naissance = null;
        String adresse = request.getParameter( CHAMP_ADRESSE );
        String user_mail = request.getParameter( CHAMP_USERMAIL );
        String tel = request.getParameter( CHAMP_TEL );
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = request.getParameter( CHAMP_DATENAISSANCE );;
        
        try {
        
         date_de_naissance = formatter.parse(dateInString);
        
        } catch (ParseException e) {
         e.printStackTrace();
        }
        
        
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(nom_de_jeune_fille);
        System.out.println(date_de_naissance);
        System.out.println(adresse);
        System.out.println(user_mail);
        System.out.println(tel);
        
        StoreData.creationficheclient(nom, prenom, nom_de_jeune_fille, date_de_naissance, adresse, user_mail, tel );
        
        String nextJSP = "/WEB-INF/choix_produits.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
	}

}
