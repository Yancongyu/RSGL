<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/31
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/checkImgajax.js"></script>
    <script>
        window.onload=function()
        {
            var y=document.getElementById("yzmimg");

            y.onclick=function()
            {
                y.src="image.jsp?"+Math.random();
            }
            var x = document.f1.yzm;
            x.onblur=function () {
                sendRequest(this.value);
            }
        }
    </script>
</head>
<body>
<form action="checkLogin" method="post" name="f1">
    用户姓名:<input type="text" name="uname"><br/>
    用户密码:<input type="password" name="pwd"><br/>
    <input name="r" checked="checked" type="radio" value="2">用户
    <input name="r" type="radio" value="1">管理员
    <br/>
    验证码:<input type="text" name="yzm">
    <img id="yzmimg" alt="" src="image.jsp">
    <br/>
    <span></span>
    <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
