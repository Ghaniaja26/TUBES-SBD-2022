package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.KaryawanDao;
import model.Karyawan;

/**
 * Servlet implementation class LoginKaryawanServlet
 */
@WebServlet("/Login")
public class LoginKaryawanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private KaryawanDao karyawanDao = new KaryawanDao ();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginKaryawanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Karyawan karyawan = new Karyawan();
		karyawan.setUsername(username);
		karyawan.setPassword(password);
		
		try {
			karyawan = karyawanDao.loginKaryawan(karyawan);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		if(karyawan != null) {
			HttpSession session = request.getSession();
			System.out.println("Sesi Login : " + session.getId());
			session.setAttribute("karyawan",karyawan);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
			dispatcher.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			RequestDispatcher dispatcher = request.getRequestDispatcher("FailLogin.jsp");
			dispatcher.forward(request, response);	
		}
		
	}

}
