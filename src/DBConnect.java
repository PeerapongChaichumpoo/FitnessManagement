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

    private String url = "jdbc:postgresql://ep-mute-morning-a1fsu754.ap-southeast-1.aws.neon.tech/neondb";
    
    private String username = "neondb_owner";
    
    private String password = "BxAM7JKzF0ew";
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
