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
import javax.servlet.http.HttpSession;

import modele.StoreData;

/**
 * Servlet implementation class creation_fiche_client
 */

@WebServlet(name = "Creation_fiche_client_choix_du_canal", urlPatterns = { "/creation_fiche_client_choix_du_canal" })
public class Creation_fiche_client_choix_du_canal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_CANAL = "Canal";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creation_fiche_client_choix_du_canal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_fiche_client_choix_du_canal.jsp").forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s = request.getSession(true);
        String canal = request.getParameter( CHAMP_CANAL );
      
        int id = StoreData.getProfil((String) s.getAttribute("username")).getId();
        
        System.out.println(canal);

        StoreData.creationficheclientcanal((int) s.getAttribute("id") , canal);
        
        String nextJSP = "/WEB-INF/choix_produits.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response); 
	}

}
