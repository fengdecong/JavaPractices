<%@ page import="java.util.HashMap" %>
<%@ page import="bean.Shop" %><%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2019/12/14
  Time: 17:31
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

    if(username == null){
        response.sendRedirect("noLogin.jsp");
    }else{
        String sid = request.getParameter("sid");
        HashMap allshop = (HashMap) session.getAttribute("allshop");
        Shop shop = (Shop) allshop.get(sid);
%>
欢迎购买：<%=shop.getName()%>
<form action="/AddServlet" method="post">
    商品价格：<%=shop.getSprice()%><br>
    <input name="sid" type="hidden" value="<%=shop.getSid()%>">
    <input name="name" type="hidden" value="<%=shop.getName()%>">
    <input name="sprice" type="hidden" value="<%=shop.getSprice()%>">
    数量：<input name="snumber" type="text">
    <input type="submit" value="购买">
</form>
<%
    }
%>

</body>
</html>