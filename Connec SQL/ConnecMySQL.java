import java.sql.*;

public class ConnecMySQL {
    private static String DB_URL = "jdbc:mysql://localhost:3306/ggwp";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String args[]) {
        try {
            // kết nối tới file dữ liệu 'demosqljava'
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("Connect succesfully!");
            // tạo statement để kết nối csds
            Statement stmt = conn.createStatement();
            // lấy dữ liệu từ table 'Sinh Vien'
            ResultSet rs = stmt.executeQuery("select * from digimon");
            // Liệt kê dữ liệu
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " + rs.getString("name") + "  " + rs.getString("type"));
            }
            // ngắt kết nối
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}