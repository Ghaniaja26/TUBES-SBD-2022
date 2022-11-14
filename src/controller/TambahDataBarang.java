package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BarangDao;
import model.Barang;

/**
 * Servlet implementation class TambahDataBarang
 */
@WebServlet("/TambahBarang")
public class TambahDataBarang extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BarangDao barangDao = new BarangDao ();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TambahDataBarang() {
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
		String namaBarang = request.getParameter("namaBarang");
		String stringhargaJual = request.getParameter("hargaJual");
		String brand = request.getParameter("brand");
		String jenisBarang = request.getParameter("jenisBarang");
		String stringstokBarang = request.getParameter("stokBarang");
		String noSuplai = request.getParameter("noSuplai");
		
		double hargaJual = Double.parseDouble(stringhargaJual);
		int stokBarang = Integer.parseInt(stringstokBarang);
		
		Barang barang = new Barang();
		barang.setNamaBarang(namaBarang);
		barang.setHargaJual(hargaJual);
		barang.setBrand(brand);
		barang.setJenisBarang(jenisBarang);
		barang.setStokBarang(stokBarang);
		barang.setNoSuplai(noSuplai);
		
		try {
			barangDao.tambahBarang(barang);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("Menu.jsp");
		dispatcher.forward(request, response);
	}

}
