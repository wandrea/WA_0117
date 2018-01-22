import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

    private static final String URL = "jdbc:postgresql://localhost:5432/januar15";
    private static final String User = "postgres";
    private static final String password = "postgres";
    private static DbUtil INSTANCE;

    private DbUtil() {
    }

    public static DbUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DbUtil();
        }
        return INSTANCE;
    }

    public  Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection
                    (URL, User, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

}
