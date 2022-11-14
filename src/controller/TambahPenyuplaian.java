package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PenyuplaianDao;
import model.Penyuplaian;

/**
 * Servlet implementation class TambahPenyuplaian
 */
@WebServlet("/TambahPenyuplaian")
public class TambahPenyuplaian extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private PenyuplaianDao penyuplaianDao = new PenyuplaianDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TambahPenyuplaian() {
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
		String idPemasok = request.getParameter("idPemasok");
		String sJumlahSuplai = request.getParameter("jumlahSuplai");
		String sHargaSuplai = request.getParameter("hargaSuplai");
		
		int jumlahSuplai = Integer.parseInt(sJumlahSuplai);
		double hargaSuplai = Double.parseDouble(sHargaSuplai);
		double totalHargaSuplai = jumlahSuplai * hargaSuplai;
		
		Penyuplaian penyuplaian = new Penyuplaian();
		penyuplaian.setIdPemasok(idPemasok);
		penyuplaian.setJumlahSuplai(jumlahSuplai);
		penyuplaian.setHargaSuplai(hargaSuplai);
		penyuplaian.setTotalHargaSuplai(totalHargaSuplai);
		
		try {
			penyuplaianDao.tambahSuplai(penyuplaian);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
		dispatcher.forward(request, response);
	}

}
