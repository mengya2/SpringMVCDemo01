<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/one.action">1默认的请求转发页面</a><br>
<a href="${pageContext.request.contextPath}/two.action">2请求转发action</a><br>
<a href="${pageContext.request.contextPath}/three.action">3使用重定向的方式</a><br>
<a href="${pageContext.request.contextPath}/fore.action">4使用重定向action</a><br>

<a href="${pageContext.request.contextPath}/data.action">5携带数据进行跳转处理</a><br>

<form action="${pageContext.request.contextPath}/mydate.action">
    日期：<input type="date" name="mydate">
    <input type="submit" value="提交">
</form>

<br><br><br><br>
<a href="${pageContext.request.contextPath}/list.action">处理集合中对象的日期成员</a>
</body>
</html>
