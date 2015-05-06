package controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Creation_compte
 */

@WebServlet(name = "Creation_compte", urlPatterns = { "/creation_compte" })

public class Creation_compte extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String CHAMP_NOMUSER = "nomutilisateur";
    public static final String CHAMP_PASS = "motdepasse";
    public static final String CHAMP_PASS2 = "confirmpasse";
    public static final String CHAMP_EMAIL = "email";
    public static final String CHAMP_EMAIL2 = "confirmmail";

    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creation_compte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
