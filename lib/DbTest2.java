import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbTest2 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:expenses.db");

            // INSERT: add one expense
            PreparedStatement insert = conn.prepareStatement(
                    "INSERT INTO expenses (name, amount) VALUES (?, ?)");
            insert.setString(1, "Coffee");
            insert.setDouble(2, 3.5);
            insert.executeUpdate();
            insert.close();

            // SELECT: read all expenses
            PreparedStatement select = conn.prepareStatement("SELECT * FROM expenses");
            ResultSet rs = select.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                System.out.println(id + ") " + name + ": " + amount + " euros");
            }
            rs.close();
            select.close();

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}