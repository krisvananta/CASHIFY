import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    static Connection con;

    public static Connection getCon() {
        try {
            // Memuat driver JDBC untuk MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi ke database MySQL
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cashier", "root", "");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }

    public static void main(String[] args) {
        try {
            // Memanggil metode getCon untuk mendapatkan koneksi ke database
            Connection connection = DatabaseConnection.getCon();
            if (connection != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
