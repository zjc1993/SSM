<%--
  Created by IntelliJ IDEA.
  User: 11924
  Date: 2019/2/20
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<style>
    table{
        border-collapse: collapse;
        width: 600px;
    }
    table,td,th{
        border: 1px solid black;
    }
    td,th{
        text-align: center;
    }
</style>
<head>
    <title>系统用户信息</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>用户名</th>
        <th>真实姓名</th>
        <th>注销状态</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${allSysUser}" var="sysUser">
        <tr>
            <td style="display: none;">${sysUser.id}</td>
            <td>${sysUser.userName}</td>
            <td>${sysUser.userTrueName}</td>
            <td>${sysUser.deleteFlag}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
