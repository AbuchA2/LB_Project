package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modele.StoreData;
import modele.Utilisateur;

/**
 * Servlet implementation class Connexion
 */
@WebServlet(name = "Connexion", urlPatterns = { "/connexion" })
        
public class Connexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public static final String VUE = "/WEB-INF/connexion.jsp";
    public static final String CHAMP_NOM = "nom";
    public static final String CHAMP_PASS = "motdepasse";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connexion() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter( CHAMP_NOM );
        String motDePasse = request.getParameter( CHAMP_PASS );
        
        System.out.println(motDePasse);
        System.out.println(nom);
        
    	HttpSession s = request.getSession(true);
    	
    	
        if (StoreData.connexion(nom, motDePasse)){
        	
        	s.setAttribute("username", nom);
        	s.setAttribute("isConnected", true);
        	
        	
        	Utilisateur user = StoreData.getProfil(nom);
        	s.setAttribute("id", user.getId());
        	
        	String nextJSP = "/WEB-INF/page_accueil.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request,response); 
        }
        else {
        	String nextJSP = "/WEB-INF/connexion.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
            dispatcher.forward(request,response); 
        }

        
        
        try {
            //validationEmail( email );
            //validationMotsDePasse( motDePasse, confirmation );
            validationNom( nom );
            validationMotsDePasse( motDePasse );
            
        } catch (Exception e) {
        }
    }

    //private void validationEmail( String email ) throws Exception{}
    //private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{}
    private void validationMotsDePasse( String motDePasse) throws Exception{}
	private void validationNom( String nom ) throws Exception{}	

	private static String getCookieValue( HttpServletRequest request, String nom ) {
	    Cookie[] cookies = request.getCookies();
	    if ( cookies != null ) {
	        for ( Cookie cookie : cookies ) {
	            if ( cookie != null && nom.equals( cookie.getName() ) ) {
	                return cookie.getValue();
	            }
	        }
	    }
	    return null;
	}
	
	private static void setCookie( HttpServletResponse response, String nom, String valeur, int maxAge ) {
	    Cookie cookie = new Cookie( nom, valeur );
	    cookie.setMaxAge( maxAge );
	    response.addCookie( cookie );
	}
	
}
