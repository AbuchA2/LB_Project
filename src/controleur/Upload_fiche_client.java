package controleur;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;

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


@WebServlet(name = "Upload_fiche_client", urlPatterns = "/upload_fiche_client")
@MultipartConfig( location = "C:/Images/Temp_LB", maxFileSize = 10 * 1024 * 1024, maxRequestSize = 5 * 10 * 1024 * 1024, fileSizeThreshold = 1024 * 1024 )


public class Upload_fiche_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static final String CHAMP_LIEN_PI = "lien_PI" ;
    public static final String CHAMP_LIEN_JD = "lien_JD" ;
    public static final String CHAMP_LIEN_IS = "lien_IS" ;
    
    public static final Integer TAILLE_TAMPON = 50000 ;

    
       

    public Upload_fiche_client() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/upload_fiche_client.jsp").forward(request, response) ;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String chemin = this.getServletConfig().getInitParameter("chemin") ;
		
		HttpSession s = request.getSession(true);    

		int id = StoreData.getProfil((String) s.getAttribute("username")).getId();
        	
        String dirName = (String) s.getAttribute("dirName") ;
        System.out.println(dirName);
        File dir = new File(dirName);
        dir.mkdirs() ;
        
        
        
        Part lien_PI = request.getPart(CHAMP_LIEN_PI);
        String nomFichierPI = getNomFichier(lien_PI);
        
        Part lien_JD = request.getPart(CHAMP_LIEN_JD);
        String nomFichierJD = getNomFichier(lien_JD);
        
        Part lien_IS = request.getPart(CHAMP_LIEN_IS);
        String nomFichierIS = getNomFichier(lien_IS);
        
        if ( nomFichierPI != null && !nomFichierPI.isEmpty() ) {
        	String nomChampPI = lien_PI.getName();
            ecrireFichier (lien_PI, nomFichierPI, dirName) ;
            request.setAttribute( nomChampPI, nomFichierPI );
        }

        if ( nomFichierJD != null && !nomFichierJD.isEmpty() ) {
        	String nomChampJD = lien_JD.getName();        	
            ecrireFichier(lien_JD, nomFichierJD, dirName) ;
            request.setAttribute( nomChampJD, nomFichierJD );
        }

        if ( nomFichierIS != null && !nomFichierIS.isEmpty() ) {        	
            String nomChampIS = lien_IS.getName();
            ecrireFichier(lien_IS, nomFichierIS, dirName) ;
            request.setAttribute( nomChampIS, nomFichierIS );
        } 
        
        StoreData.creationficheclientcanal((int) s.getAttribute("id") , dirName + nomFichierPI, dirName + nomFichierJD, dirName + nomFichierIS);
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/creation_fiche_client_choix_du_canal.jsp").forward(request, response);

        
	}
	
	private static String getNomFichier( Part part ) {
	    for ( String contentDisposition : part.getHeader( "Content-Disposition" ).split( ";" ) ) {
	        if ( contentDisposition.trim().startsWith("filename") ) {
	            return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 ).trim().replace( "\"", "");
	        }
	    }
	    return null;
	}
		
	
	private void ecrireFichier( Part part, String nomFichier, String chemin ) throws IOException {
	    BufferedInputStream entree = null ;
	    BufferedOutputStream sortie = null ;
	    try {
	        entree = new BufferedInputStream( part.getInputStream(), TAILLE_TAMPON );
	        sortie = new BufferedOutputStream( new FileOutputStream( new File( chemin + nomFichier ) ), TAILLE_TAMPON );
	        
	        byte[] tampon = new byte[TAILLE_TAMPON];
	        int longueur;
	        while ( ( longueur = entree.read( tampon ) ) > 0 ) {
	            sortie.write( tampon, 0, longueur );
	        }
	 
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
