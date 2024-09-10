/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
/**
 *
 * @author Lenovo
 */
public class DBConnect {
    public Connection conn  =null;
    
    public Statement stm;
    
    public ResultSet rs;
    
    private String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12730413";
    
    private String username = "sql12730413";
    
    private String password = "cABu1ArxjQ";
    
    public DBConnect(){
        try{
        conn = DriverManager.getConnection(url,username,password);
        System.err.println("Successfully!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    //Connect to database
    public ResultSet getConnect(String sql){
        try{
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            
        } catch (SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public void getUpdate(String sql){
        try{
            stm = conn.createStatement();
            stm.executeUpdate(sql);
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void disconnect(){
        try{
            stm.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
