//Dao 连接数据库中的User表
import bean.User;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {
    //查找即登录
    public ArrayList getUserNameAndpassword() throws Exception {
        ConnDao connDao = new ConnDao();
        connDao.connection();

        Statement stat = null;
        ResultSet rs = null;

        ArrayList list = new ArrayList();
        stat = connDao.conn.createStatement();
        String sql = "select * from preson";   //"select * from user"
        rs = stat.executeQuery(sql);
        while (rs.next()){
            User user = new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            list.add(user.getUsername());
            list.add(user.getPassword());
        }
        rs.close();
        stat.close();
        connDao.conn.close();
        return list;
    }

}