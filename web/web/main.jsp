<%@ page import="bean.User" %>
<%@ page import="biz.LoginBiz" %>
<%@ page import="biz.Imp.LoginImp.LoginBizImp" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/31
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登陆界面
<%
    LoginBiz lb = new LoginBizImp();
    String cn=(String)session.getAttribute("currt");
    User u=lb.currentUser(cn);
    out.println(u.getUsername());
    out.println(u.getCity().getCity());
    out.println(u.getCertType().getContent());
    out.println(u.getUserType().getContent());
%>
</body>
</html>
