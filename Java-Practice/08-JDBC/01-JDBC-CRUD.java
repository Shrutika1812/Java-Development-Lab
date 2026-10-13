/*
 * JDBC CRUD example.
 *
 * Update the database URL, username, password, and table name
 * according to your local MySQL setup before running.
 *
 * Required dependency:
 * MySQL Connector/J
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcCrud {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        String insertSql = "INSERT INTO employees(name, salary) VALUES (?, ?)";
        String selectSql = "SELECT id, name, salary FROM employees";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {

            try (PreparedStatement insert = connection.prepareStatement(insertSql)) {
                insert.setString(1, "Shrutika");
                insert.setDouble(2, 45000);
                insert.executeUpdate();
                System.out.println("Record inserted.");
            }

            try (PreparedStatement select = connection.prepareStatement(selectSql);
                 ResultSet resultSet = select.executeQuery()) {

                while (resultSet.next()) {
                    System.out.println(
                            resultSet.getInt("id") + " - " +
                            resultSet.getString("name") + " - " +
                            resultSet.getDouble("salary")
                    );
                }
            }

        } catch (Exception e) {
            System.out.println("Database operation failed: " + e.getMessage());
        }
    }
}
