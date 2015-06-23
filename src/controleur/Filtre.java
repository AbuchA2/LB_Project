package controleur;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/creation_fiche_client", "/modification_profil", "/recherche_agence", "/resume_choix", "/resume_fiche", "/resume_profil", "/upload_fiche_client", 
		"/validation_souscription", "/choix_produits", "/confirmation_inscription", "/creation_fiche_client_choix_du_canal", "/page_accueil"})
public class Filtre implements Filter{
	
	public static final String ACCES_PUBLIC = "/connexion" ;
	public static final String ATT_SESSION_USER = "id" ;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		

        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession();
        
        if ( session.getAttribute( ATT_SESSION_USER ) == null ) {
            response.sendRedirect( request.getContextPath() + ACCES_PUBLIC );
        } else {
            chain.doFilter( request, response );
        }
    }

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
