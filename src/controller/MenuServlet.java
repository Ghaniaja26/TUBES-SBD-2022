package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/Menu")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String input = request.getParameter("inputMenu");
		
		switch (input) {
		case "1" :
			RequestDispatcher dp1 = request.getRequestDispatcher("TambahPemasok.jsp");
			dp1.forward(request, response);
			break;
		case "2" :
			RequestDispatcher dp2 = request.getRequestDispatcher("TambahSuplai.jsp");
			dp2.forward(request, response);
			break;
		case "3" :
			RequestDispatcher dp3 = request.getRequestDispatcher("TambahBarang.jsp");
			dp3.forward(request, response);	
			break;
		case "4" :
			System.out.println("capek 4");
			break;
		case "5" :
			System.out.println("capek 5");
			break;
		case "6" :
			System.out.println("capek 6");
			break;
		case "7" :
			System.out.println("capek 7");
			break;
		case "8" :
			System.out.println("capek 8");
			break;
		default :
			System.out.println("Input Menu Salah! Silahkan Coba lagi");
			RequestDispatcher dpDef = request.getRequestDispatcher("WEB-INF/view/Menu.jsp");
			dpDef.forward(request, response);	
		}
	}

}
