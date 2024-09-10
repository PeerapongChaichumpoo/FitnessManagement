
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Database {
    
    public static void main(String[] args){
        
       /* try {
            Class.forName("com.mysql.cj.jdbc.Drivers");
            Connection con=DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/Users","sql12729104","vi2wrlGS2t");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        } */
    } 

    
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/Users";
    String username = "sql12729104";
    String password = "vi2wrlGS2t";

    Connection connection = DriverManager.getConnection(url, username, password);
    return connection;
    }
}
