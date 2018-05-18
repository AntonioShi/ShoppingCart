<%--
  Created by IntelliJ IDEA.
  User: antonio
  Date: 18-4-16
  Time: 上午9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>用户登录界面</title>
</head>

<body>
<form method="post" action="${pageContext.request.contextPath}">
    <table>
        <tr><td>用户验证录入:<br />用户名：<input type="text" name="user"/></td></tr>
        <tr><td>密码：<input type="password" name="passwd"/></td></tr>
    </table>
    <input type="submit" name="sub" value="提交"/>
</form>
</body>
</html>
