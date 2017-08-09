<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="json" uri="http://www.atg.com/taglibs/json" %>
<%@ page import="bean.CertType" %>
<%@ page import="java.util.List" %>
<%@ page import="bean.UserType" %>
<%@ page import="bean.Province" %>
<%@ page import="bean.City" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/31
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/regist.js"></script>
</head>
<body>
<form action="registSuc.jsp" method="post" name="f1">
    <td align="center">
        <table width="100%" align="center" valign="center" border="0">
            <tr>
                <td width="50%" align="right">请输入用户名: &nbsp;</td>
                <td>
                    <input name="username" type="text" placeholder="请输入用户名" align="left">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请输入密码: &nbsp;</td>
                <td>
                    <input name="password" type="password" align="left">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">确认密码: &nbsp;</td>
                <td>
                    <input name="password2" type="password" align="left">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请输入真实姓名: &nbsp;</td>
                <td>
                    <input name="realname" type="text" align="left">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请选择性别: &nbsp;</td>
                <td>
                    男<input type="radio" name="sex" value="man" checked>&nbsp;女<input type="radio" name="sex" value="woman">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请选择籍贯: &nbsp;</td>
                <td>
                    <select id="province">
                        <c:forEach items="${sessionScope.psList}" var="p">
                        <option value="${p.provinceId}">${p.province}</option>
                        </c:forEach>
                    </select>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <select id="city">
                        <%--<jsp:useBean id="cb" class="biz.Imp.CityImp.CityBizImp"></jsp:useBean>--%>
                        <%--<%--%>
                            <%--List<City> carr = cb.selectCityBiz(pid);--%>
                            <%--for (City c : carr) {--%>
                        <%--%>--%>
                        <%--<option value="<%=c.getId()%>" id="city" name="cityId"><%=c.getCity()%></option>--%>
                        <%--<%--%>
                            <%--}--%>
                        <%--%>--%>
                        <option>--城市--</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请选择证件类型: &nbsp;</td>
                <td>
                    <select name="certtype">
                        <jsp:useBean id="ctb" class="biz.Imp.CertTypeImp.CertTypeBizImp"></jsp:useBean>
                        <%
                            List<CertType> ctarr = ctb.selectCertTypeBiz();
                            for (CertType c : ctarr) {
                        %>
                        <option value="<%=c.getId()%>"><%=c.getContent()%></option>
                        <%
                            }
                        %>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请输入证件号码: &nbsp;</td>
                <td>
                    <input name="cert" type="text" align="left">
                </td>
            </tr>
            <tr>
                <td width="50%" align="right">请选择旅客类型: &nbsp;</td>
                <td>
                    <select name="usertype">
                        <jsp:useBean id="utb" class="biz.Imp.UserTypeImp.UserTypeBizImp"></jsp:useBean>
                        <%
                            List<UserType> utarr = utb.selectUserTypeBiz();
                            for (UserType u : utarr) {
                        %>
                                    <option value="<%=u.getId()%>"><%=u.getContent()%></option>
                                <%
                                    }
                                %>
                    </select>
                </td>
            </tr>
        </table>
    </td>
</form>
</body>
</html>
