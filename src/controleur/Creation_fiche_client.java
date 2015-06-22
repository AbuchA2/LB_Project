package controleur;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class creation_fiche_client
 */

@WebServlet(name = "Creation_fiche_client", urlPatterns = "/creation_fiche_client", initParams = @WebInitParam (name = "chemin", value="D:/Images/Images_LB/"))

public class Creation_fiche_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PRENOM = "prenom";
    public static final String CHAMP_NOM_JEUNE_FILLE = "nom_de_jeune_fille";
    public static final String CHAMP_DATE_NAISSANCE = "date_de_naissance";
    public static final String CHAMP_ADRESSE = "adresse";
    public static final String CHAMP_USERMAIL = "user_mail";
    public static final String CHAMP_TEL = "tel";
    public static final String CHEMIN = "D:/Images/Images_LB/" ;
    
       
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
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_fiche_client.jsp").forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String chemin = this.getServletConfig().getInitParameter("chemin") ;
		
		HttpSession s = request.getSession(true);    

		//int id = StoreData.getProfil((String) s.getAttribute("username")).getId();
		
        String nom = request.getParameter( CHAMP_NOM );

        String prenom = request.getParameter( CHAMP_PRENOM );
        String dirName = CHEMIN + nom + "_" + prenom + "/" ;
        
        String nom_de_jeune_fille = request.getParameter( CHAMP_NOM_JEUNE_FILLE );
        Date date_de_naissance = null ;

        String adresse = request.getParameter( CHAMP_ADRESSE );
        String user_mail = request.getParameter( CHAMP_USERMAIL );
        String tel = request.getParameter( CHAMP_TEL );
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = request.getParameter( CHAMP_DATE_NAISSANCE ); 

        
        System.out.println(dateInString);

        
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

        s.setAttribute("dirName", dirName);
        System.out.println(dirName);
        
        //StoreData.creationficheclient(nom, prenom, nom_de_jeune_fille, date_de_naissance, adresse, user_mail, tel, id);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/upload_fiche_client.jsp").forward(request, response);
        
	}
}
