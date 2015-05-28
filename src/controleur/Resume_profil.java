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
 * Servlet implementation class Resume_profil
 */
@WebServlet(name = "Resume_profil", urlPatterns = { "/resume_profil" })
public class Resume_profil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resume_profil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		HttpSession s = request.getSession(true);
		
//		Le code suivant permet de gérer le fait que l'utilisateur est connecté ou non
		
		if (!(boolean) s.getAttribute("isConnected")){
        this.getServletContext().getRequestDispatcher("/WEB-INF/connexion").forward(request, response) ;
        
		}
		else{
		
		request.setAttribute("person", StoreData.getProfil((String) s.getAttribute("username")));
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resume_profil_test.jsp");
		dispatcher.include(request, response);
		}
						
						
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
