import java.sql.*;

public class Connect {
    public static Connection ConnectToDB() {
        try {
            // Driver ko manually register karein
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Connection establish karein
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "1234");
            return c;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Failed: " + e.getMessage());
            return null;
        }
    }
}