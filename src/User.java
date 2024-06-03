import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public enum Role {
    CUSTOMER,
    OWNER,
    EMPLOYEE
}
public abstract class User {
    public int id;
    public String username;
    public String password;
    public Role role;

    public User(int id, String username, String password, Role role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static User getUserByUsernameAndPassword(String username, String password) {
        User user = null;
        String query = "SELECT * FROM Users WHERE username = ? AND password = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String roleString = resultSet.getString("role");
                Role role = Role.valueOf(roleString);
                boolean isMember = resultSet.getBoolean("is_member");

                switch (role) {
                    case CUSTOMER:
                        user = new Customer(id, username, password, isMember);
                        break;
                    case OWNER:
                        user = new Owner(id, username, password);
                        break;
                    case EMPLOYEE:
                        user = new Employee(id, username, password);
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public abstract void displayDashboard();
}
