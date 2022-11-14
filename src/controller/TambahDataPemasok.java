package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PemasokDao;
import model.Pemasok;

/**
 * Servlet implementation class TambahDataPemasok
 */
@WebServlet("/TambahDataPemasok")
public class TambahDataPemasok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PemasokDao pemasokDao = new PemasokDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TambahDataPemasok() {
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
		String namaPemasok = request.getParameter("namaPemasok");
		String alamatPemasok = request.getParameter("alamatPemasok");
		String telpPemasok = request.getParameter("telpPemasok");
		
		Pemasok pemasok = new Pemasok();
		pemasok.setNamaPemasok(namaPemasok);
		pemasok.setAlamatPemasok(alamatPemasok);
		pemasok.setTelpPemasok(telpPemasok);
		
		try {
			pemasokDao.tambahPemasok(pemasok);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
		dispatcher.forward(request, response);
	}

}
