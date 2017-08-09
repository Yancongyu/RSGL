<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/3
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.atg.com/taglibs/json" prefix="json" %>

<json:array>
    <c:forEach items="${sessionScope.cList}" var="c">
        <json:object>
            <json:property name="id" value="${c.id}"></json:property>
            <json:property name="cityId" value="${c.cityId}"></json:property>
            <json:property name="city" value="${c.city}"></json:property>
            <json:property name="father" value="${c.father}"></json:property>
        </json:object>
    </c:forEach>
</json:array>