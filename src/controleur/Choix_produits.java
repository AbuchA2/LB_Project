package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class Choix_produits
 */
@WebServlet(name = "Choix_produits", urlPatterns = { "/choix_produits" })

public class Choix_produits extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WEB-INF/choix_produits.jsp";
	
	public static final String CHAMP_LIVRET = "Livret_A";
    public static final String CHAMP_PEL = "PEL";
    public static final String CHAMP_COMPTE = "Compte_Bancaire";
    public static final String CHAMP_CARTENATIONALE = "Carte_Bancaire_Nationale";
    public static final String CHAMP_CARTEINTERNATIONALE = "Carte_Bancaire_Internationale";
    public static final String CHAMP_CARTEPLATINE = "Carte_Bancaire_Platine";

    
	
	/**
     * @see HttpServlet#HttpServlet()
     */
    public Choix_produits() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession(true);
        String livretA = request.getParameter( CHAMP_LIVRET );
        String pel = request.getParameter( CHAMP_PEL );
        String comptebancaire = request.getParameter( CHAMP_COMPTE );
        String cartebancairenationale = request.getParameter( CHAMP_CARTENATIONALE );
        String cartebancaireinternationale = request.getParameter( CHAMP_CARTEINTERNATIONALE );
        String cartebancaireplatine = request.getParameter( CHAMP_CARTEPLATINE );
        
        int id = StoreData.getProfil((String) s.getAttribute("username")).getId();
        
        System.out.println(livretA);
        System.out.println(pel);
        System.out.println(comptebancaire);
        System.out.println(cartebancairenationale);
        System.out.println(cartebancaireinternationale);
        System.out.println(cartebancaireplatine);      


        StoreData.choixproduits((int) s.getAttribute("id") , livretA, pel, comptebancaire, cartebancairenationale, cartebancaireinternationale, cartebancaireplatine);
         
        String nextJSP = "/WEB-INF/confirmation_choixproduits.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
        
        
        
	}

}
