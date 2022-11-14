package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Karyawan;

public class KaryawanDao {


    public void registerEmployee(Karyawan karyawan) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "{CALL registerkaryawan (?,?,?,?,?,?)}";
        
        Class.forName("oracle.jdbc.driver.OracleDriver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:oracle:thin:@localhost:1521:xe","GHANI","GHANI");

            // Step 2:Create a statement using connection object
            CallableStatement  cs = connection.prepareCall(INSERT_USERS_SQL)) {
        	cs.setString(1, karyawan.getNama());
        	cs.setString(2, karyawan.getAlamat());
            cs.setString(3, karyawan.getTelp());
            cs.setString(4, karyawan.getPosisi_karyawan());
            cs.setString(5, karyawan.getUsername());
            cs.setString(6, karyawan.getPassword());

            System.out.println(cs);
            // Step 3: Execute the query or update query
            cs.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
        	printSQLException(e);
        }
     
    }

    public Karyawan loginKaryawan(Karyawan karyawan) throws ClassNotFoundException {
        String sql = "select * from karyawan where username=? and password=?";
       
        ResultSet result = null;

        Class.forName("oracle.jdbc.driver.OracleDriver");

        try {
        	Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GHANI","GHANI");
            // Step 2:Create a statement using connection object
            PreparedStatement pr = connection.prepareCall(sql);
            pr.setString(1, karyawan.getUsername());
            pr.setString(2, karyawan.getPassword());
            
            // Step 3: Execute the query or update query
            result = pr.executeQuery();	
           
            if(result.next()) {
            	karyawan.setNama(result.getString("nama"));
            	karyawan.setAlamat(result.getString("alamat"));
            	karyawan.setTelp(result.getString("telp"));
            	karyawan.setPosisi_karyawan(result.getString("posisi_karyawan"));
            	karyawan.setUsername(result.getString("username"));
            	karyawan.setPassword(result.getString("password"));
            	
            	result.close();
            	pr.close();
            	connection.close();
            	return karyawan;
            }
            else {
            	System.out.println("Login Failed!");
            	result.close();
            	pr.close();
            	connection.close();
            	return null;
            }
        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return karyawan;
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
