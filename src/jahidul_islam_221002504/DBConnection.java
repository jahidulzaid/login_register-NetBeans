/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jahidul_islam_221002504;
import java.sql.*;

/**
 *
 * @author Jahid
 */
public class DBConnection {
    
    static final String DB_URL = "jdbc:mysql://localhost/accounts";
    static final String USER = "root";
    static final String PASS = "";
    public static Connection connectDB(){
        Connection conn = null;
        try{
            //register jdbc
//            Class.forName("com.mysql.jdbc.Driver");
//            Class.forName("com.mysql.cj.jdbc.Driver") ;

            //open a conn
            conn = DriverManager.getConnection(DB_URL,USER ,PASS );
            return conn;
        }catch( Exception ex){
            System.out.println("Errors with DB");
            return null;
        }
    }
}
