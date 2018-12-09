package krs;
//import library java untuk koneksi ke MySQL
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KoneksiDB {
     //Membuat variabel bertipe Connection
    private static Connection koneksi;
    public static Statement statement;
    static Object connection;
    public static Connection getKoneksi() {
    //method ini berfungsi untuk membuat koneksi ke MySQL
    if (koneksi == null) {
        try{
            String url = "jdbc:mysql://localhost:3306/krs";
            String username = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            koneksi = DriverManager.getConnection(url,username,password);
            System.out.println("Koneksi Berhasil");                 
            } catch (SQLException e) {
            System.out.println("Gagal membuat Koneksi");
            }     }
    return koneksi;
 } }