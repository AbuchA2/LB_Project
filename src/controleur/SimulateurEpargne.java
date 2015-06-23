package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimulateurEpargne
 */
@WebServlet(name = "SimulateurEpargne", urlPatterns = "/simulateur_epargne")

public class SimulateurEpargne extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimulateurEpargne() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		this.getServletContext().getRequestDispatcher("/WEB-INF/simulateur_epargne.jsp").forward(request, response) ;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String LivretA = request.getParameter("LivretA");		
		String PEL = request.getParameter("PEL");
		
		double sstotal = 0 ;
		double sstotal2 = 0 ;
		
		if (LivretA != null){
			
			int montant = Integer.parseInt(request.getParameter("montant"));
			int mois = Integer.parseInt(request.getParameter("mois"));
			
			sstotal = floor(LivretA(montant,mois));
		}
		
		if (PEL != null){
			
			int montant2 = Integer.parseInt(request.getParameter("montant2"));
			int mois2 = Integer.parseInt(request.getParameter("mois2"));

			sstotal2 = floor(PEL(montant2,mois2));		
		}
		
		double total = sstotal + sstotal2 ;
		
		String resultat = Double.toString(total);
		
		request.setAttribute("resultat", resultat);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/simulateur_epargne.jsp").forward(request, response);
		
	}
	
	private double LivretA(int montant, int mois){
		double sstotal = montant;
		double interet = 0.04;
		for(int i = 0; i<= mois; i++){
			sstotal = sstotal * (interet + 1);
		}
		return sstotal;
	}
	
	private double PEL(int montant2, int mois2){
		double sstotal2 = montant2;
		double interet2 = 0.09;
		for(int i = 0; i<= mois2; i++){
			sstotal2 = sstotal2 * (interet2 + 1);
		}
		return sstotal2;
	}
	
	private static double floor(double a){
		double p = Math.pow(10.0, 2) ;
		return Math.floor((a * p) + 0.5) / p ;
	}
	
}
