mport Dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String driveClass = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/shopping_db/preson";
        String uname = "root";
        String pword = "root";
        Connection conn = null;

        String username = req.getParameter("username");
        String password1 = req.getParameter("password");
        int password = Integer.parseInt(password1);

        ArrayList userpas = new ArrayList();
        UserDao userDao = new UserDao();
        boolean a = true;
        try {
            userpas = userDao.getUserNameAndpassword();
            //判断注册的用户名在数据库中是否存在，若存在，a为false
            for(int i = 0;i < userpas.size();i = i + 2){
                if (userpas.get(i).equals(username)) {
                    a = false;
                    break;
                }
            }
            if(a == false){
                resp.sendRedirect("loginFailure.jsp");
            }else{
                Class.forName(driveClass);
                conn = DriverManager.getConnection(url,uname,pword);

                String sql = "insert into user(username,password) values(?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,username);
                ps.setInt(2,password);
                ps.executeUpdate();
                resp.sendRedirect("loginsuccess.jsp");

                ps.close();
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}