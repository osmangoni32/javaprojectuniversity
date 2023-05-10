
package utsoor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnectionfinal {
    
public Connection con(){
       try {
            //Your database url string,ensure it is correct
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connn = DriverManager.getConnection(url, user, password);
            return connn;

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DbConnectionfinal.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
}

    
}
