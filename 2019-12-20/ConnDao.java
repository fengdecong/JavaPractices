//Dao层 连接服务器
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnDao {
    String driveClass = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/shopping_db";
    String username = "root";
    String password = "root";
    Connection conn = null;

    //连接
    public void connection() throws Exception {
        Class.forName(driveClass);
        conn = DriverManager.getConnection(url,username,password);
    }
}