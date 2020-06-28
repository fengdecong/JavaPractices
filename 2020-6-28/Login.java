import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //从 query string中获取用户输入的 username 和 password
        String username= req.getParameter("username");
        String password = req.getParameter("password");

        //设置HTTP响应的Content-Type Header
        resp.setContentType("text/plain;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //验证用户名密码是否正确
        if(username != null
                && username.equals("fengdecong")
                &&password != null
                &&password.equals("19981003")){
            //登陆成功
            writer.println("登陆成功");
            System.out.println("登陆成功");
        }else{
            //登陆失败
            writer.print("登陆失败");
            System.out.println("登陆失败");
        }
    }
}