import java.sql.*;

public class DBconnect {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String pass = "";

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            System.out.println("Database Connected!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
