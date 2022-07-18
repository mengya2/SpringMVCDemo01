<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录处理</title>
</head>
<body>
<h2>登录处理</h2>
<form action="${pageContext.request.contextPath}/login">
  账号：<input type="text" name="name">
  密码: <input type="password" name="password">
  <input type="submit" value="登录">
</form>
<br>
${msg}
</body>
</html>
