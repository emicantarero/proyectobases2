
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;







/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emila
 */
public class Conexion {
    public static Connection getConnection(){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database=proyecto;" + "user=sa;" + "password=1234;"
                + "loginTimeout=30;"
                + "TrustServerCertificate=True;";
        try {
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}
