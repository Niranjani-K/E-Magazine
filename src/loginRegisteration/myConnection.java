package loginRegisteration;

import codes.*;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
        


public class myConnection {
//    private static String servername = "localhost";
//    private static String username = "root";
//    private static String dbname  = "users_db";
//    private static Integer portnumber  = 3306;
//    private static String password = "";
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emagazine_userdetails", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
