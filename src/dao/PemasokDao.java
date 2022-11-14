package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Pemasok;

public class PemasokDao {
	
	public void tambahPemasok(Pemasok pemasok) throws ClassNotFoundException{
		String SQL = "INSERT INTO pemasok" + "(nama, alamat, telp) VALUES" + " (?, ?, ?)";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
        try (Connection connection = DriverManager
                .getConnection("jdbc:oracle:thin:@localhost:1521:xe","GHANI","GHANI");

                // Step 2:Create a statement using connection object
                PreparedStatement pr = connection.prepareStatement(SQL)) {
                pr.setString(1, pemasok.getNamaPemasok());
                pr.setString(2, pemasok.getAlamatPemasok());
                pr.setString(3, pemasok.getTelpPemasok());

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
