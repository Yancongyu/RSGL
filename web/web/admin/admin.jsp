<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/31
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
导航栏
<hr/>
用户列表
<hr/>
<c:forEach items="${sessionScope.userlist}" var="user">
    <img src="${user.imagePath}" width="50px" height="50px">
    ${user.username}<br/>
</c:forEach>
共有:${sessionScope.paging.totalPage}页
</body>
</html>
