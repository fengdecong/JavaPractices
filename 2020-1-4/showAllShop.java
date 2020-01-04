<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="bean.Shop" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2019/12/13
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%

        String username = (String) request.getSession().getAttribute("username");
        String password = (String) request.getSession().getAttribute("password");
        String code = (String) request.getSession().getAttribute("code");

        if(username == null || username.length() == 0){
            response.sendRedirect("noLogin.jsp");
        }else{
            HashMap allshop = (HashMap) session.getAttribute("allshop");
    %>
            欢迎选购商品：<br>
            <table border="1">
                <tr bgcolor="pink">
                    <td>商品名称</td>
                    <td>商品价格</td>
                    <td>购买</td>
                </tr>
                <%
                    Set set = allshop.keySet();
                    Iterator ite = set.iterator();
                    while(ite.hasNext()){
                        String sid = (String) ite.next();
                        Shop shop = (Shop) allshop.get(sid);//根据对应的sid得到相应的Shop类商品
                %>
                <tr bgcolor="yellow">
                    <td><%=shop.getName()%></td>
                    <td><%=shop.getSprice()%></td>
                    <td><a href="buyForm.jsp?sid=<%=sid%>">购买</a> </td>
                </tr>
                <%}%>
            </table>
            <a href="showCart.jsp">查看购物车</a>
    <%
        }
    %>

</body>
</html>