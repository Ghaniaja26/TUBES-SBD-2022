package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KaryawanDao;
import model.Karyawan;

/**
 * Servlet implementation class KaryawanServlet
 */
@WebServlet("/register")
public class RegisterKaryawanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private KaryawanDao karyawanDao = new KaryawanDao ();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterKaryawanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nama = request.getParameter("nama");
		String alamat = request.getParameter("alamat");
		String telepon = request.getParameter("telepon");
		String posisi = request.getParameter("posisi");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Karyawan karyawan = new Karyawan();
		karyawan.setNama(nama);
		karyawan.setAlamat(alamat);
		karyawan.setTelp(telepon);
		karyawan.setPosisi_karyawan(posisi);
		karyawan.setUsername(username);
		karyawan.setPassword(password);
		
		try {
			karyawanDao.registerEmployee(karyawan);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
