package controleur;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class creation_fiche_client
 */

@WebServlet(name = "Creation_fiche_client", urlPatterns = "/creation_fiche_client" )

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
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_fiche_client.jsp").forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String chemin = this.getServletConfig().getInitParameter("chemin") ;
		
		HttpSession s = request.getSession(true);    

		int id = StoreData.getProfil((String) s.getAttribute("username")).getId();
		
        String nom = request.getParameter( CHAMP_NOM );
        String prenom = request.getParameter( CHAMP_PREN );
        String nom_de_jeune_fille = request.getParameter( CHAMP_NOMJEUNEFILLE );
        String date_de_naissance = request.getParameter( CHAMP_DATENAISSANCE );
        //Date date_de_naissance = null;
        String adresse = request.getParameter( CHAMP_ADRESSE );
        String user_mail = request.getParameter( CHAMP_USERMAIL );
        String tel = request.getParameter( CHAMP_TEL );
        
        String dirName = chemin + nom + "_" + prenom + "/" ;
        
        /*  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = request.getParameter( CHAMP_DATENAISSANCE ); 
        
        System.out.println(dateInString);

        
        try {
        
         date_de_naissance = formatter.parse(dateInString);
        
        } catch (ParseException e) {
         e.printStackTrace();
        }*/
        
        
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(nom_de_jeune_fille);
        System.out.println(date_de_naissance);
        System.out.println(adresse);
        System.out.println(user_mail);
        System.out.println(tel);   
        
        request.setAttribute("nom", nom);
        request.setAttribute("prenom", prenom);
        request.setAttribute("nom_de_jeune_fille", nom_de_jeune_fille);
        request.setAttribute("date_de_naissance", date_de_naissance);
        request.setAttribute("adresse", adresse);
        request.setAttribute("user_mail", user_mail);
        request.setAttribute("dirName", dirName);
        
        String nextJSP = "/WEB-INF/upload_fiche_client.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
        
	}
}
