package Admin;
import java.sql.*;

public class BiometricAttendance 
{
    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/biometric";
    
    
    public static void main(String[] args) 
    {
       try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           System.out.println("Connected");
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
        
    }
    
}
