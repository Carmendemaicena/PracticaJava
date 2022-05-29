package cat.institutmvm.application.utils;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class Connector {
        public static final String URL = "jdbc:mysq l://localhost:3306/catsharks";
        public static final String USER = "root";
        public static final String CLAVE = "N@she1234";
        public Connection getConexion(){
            Connection con = null;
            try{
                Class.forName("com.mysq l.cj.jdbc.Driver");
                con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            return con;
        }
    }

