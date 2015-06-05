package controleur;

import java.io.IOException;
import java.io.PrintWriter;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/simulateur_epargne.jsp").forward(request, response) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		int montant = Integer.parseInt(request.getParameter("montant"));
		int mois = Integer.parseInt(request.getParameter("mois"));
		int montant2 = Integer.parseInt(request.getParameter("montant2"));
		int mois2 = Integer.parseInt(request.getParameter("mois2"));
		double total = LivretA(montant,mois);
		double total2 = PEL(montant2,mois2);
		
		System.out.println(total);
		System.out.println(total2);
		
		
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
	
}
