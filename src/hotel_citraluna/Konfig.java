/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_citraluna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author EGA
 * EGA SIAPA YA KIRA KIRA
 */
public class Konfig {
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/db_hotel_10_26";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
            System.out.println("Koneksi ke database Gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
}
