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
    public static final String CHAMP_LIEN_PI = "lien_PI" ;
    public static final String CHAMP_LIEN_JD = "lien_JD" ;
    public static final String CHAMP_LIEN_IS = "lien_IS" ;
    
    public static final Integer TAILLE_TAMPON = 50000 ;

    
       
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
        Date date_de_naissance = null;
        String adresse = request.getParameter( CHAMP_ADRESSE );
        String user_mail = request.getParameter( CHAMP_USERMAIL );
        String tel = request.getParameter( CHAMP_TEL );
        
        Part lien_PI = request.getPart(CHAMP_LIEN_PI);
        String nomFichierPI = getNomFichier(lien_PI);
        
      /*  Part lien_JD = request.getPart(CHAMP_LIEN_JD);
        String nomFichierJD = getNomFichier(lien_JD);
        
        Part lien_IS = request.getPart(CHAMP_LIEN_IS);
        String nomFichierIS = getNomFichier(lien_IS); */
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = request.getParameter( CHAMP_DATENAISSANCE );
        
        if ( nomFichierPI != null && !nomFichierPI.isEmpty() ) {
            String nomChampPI = lien_PI.getName();
            request.setAttribute( nomChampPI, nomFichierPI );
        }

       /* if ( nomFichierJD != null && !nomFichierJD.isEmpty() ) {
            String nomChampJD = lien_JD.getName();
            request.setAttribute( nomChampJD, nomFichierJD );
        }

        if ( nomFichierIS != null && !nomFichierIS.isEmpty() ) {
            String nomChampIS = lien_IS.getName();
            request.setAttribute( nomChampIS, nomFichierIS );
        } */
        
        ecrireFichier (lien_PI, nomFichierPI, chemin) ;
        
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
        
        StoreData.creationficheclient(nom, prenom, nom_de_jeune_fille, date_de_naissance, adresse, user_mail, tel, id );
        
        String nextJSP = "/WEB-INF/creation_fiche_client_choix_du_canal.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
        
	}
	
	private static String getNomFichier( Part part ) {
	    for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	        if ( contentDisposition.trim().startsWith("filename") ) {
	            return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 );
	        }
	    }
	    return null;
	}
	
	private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
	    BufferedInputStream entree = null;
	    BufferedOutputStream sortie = null;
	    try {
	        entree = new BufferedInputStream( part.getInputStream(), TAILLE_TAMPON );
	        sortie = new BufferedOutputStream( new FileOutputStream( new File( chemin + nomFichier ) ),
	                TAILLE_TAMPON );
	 
	    } finally {
	        try {
	            sortie.close();
	        } catch ( IOException ignore ) {
	        }
	        try {
	            entree.close();
	        } catch ( IOException ignore ) {
	        }
	    }
	}

}
