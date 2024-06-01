/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class Koneksi {
public static Connection conn;
public static Statement stm;
    
    public static void main(String[] args) {
        try{
        String url = "jdbc:mysql://localhost/koneksi";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(url,user,pass);
        stm = conn.createStatement();
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e){
            System.err.println("Koneksi Gagal " + e.getMessage());
        }
    }
}
    /**
     * @param args the command line arguments
     */
  
