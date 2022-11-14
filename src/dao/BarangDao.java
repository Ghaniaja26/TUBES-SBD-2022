package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Barang;

public class BarangDao {
	
	public void tambahBarang(Barang barang) throws ClassNotFoundException {
		String SQL = "INSERT INTO barang" +
	    "  (nama_barang, harga_jual, brand, jenis_barang, stok_barang, tgl_kadaluarsa, PENYUPLAIAN_NO_SUPLAI) VALUES " +
	    " (?, ?, ?,?,?,?, ?)";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
        try (Connection connection = DriverManager
                .getConnection("jdbc:oracle:thin:@localhost:1521:xe","GHANI","GHANI");

                // Step 2:Create a statement using connection object
                PreparedStatement pr = connection.prepareCall(SQL)) {
               	pr.setString(1, barang.getNamaBarang());
               	pr.setDouble(2, barang.getHargaJual());
               	pr.setString(3, barang.getBrand());
               	pr.setString(4, barang.getJenisBarang());
               	pr.setInt(5, barang.getStokBarang());
               	pr.setDate(6, Date.valueOf("1998-1-17"));
               	pr.setString(7, barang.getNoSuplai());
               	
                System.out.println(pr);
                // Step 3: Execute the query or update query
                pr.executeUpdate();
                connection.close();
            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
	}
	
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
               System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                   System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
       }
    }
}
