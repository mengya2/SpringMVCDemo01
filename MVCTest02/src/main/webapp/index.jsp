<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<h2>这里是index的页面</h2>
<a href="${pageContext.request.contextPath}/zwwdemo1.action">访问服务器进行跳转</a>

<form action="${pageContext.request.contextPath}/zwwfrom.action" method="get">
    <input type="submit" value="提交">
</form>

<br><br>
<h2>1、单个数据的提交</h2>
<form action="${pageContext.request.contextPath}/one.action">
    姓名：<input name="myname">
    年龄：<input name = "age">
    <input type="submit" value="提交">
</form>

<h2>1、对象数据的提交</h2>
<form action="${pageContext.request.contextPath}/two.action">
    姓名：<input name="name">
    年龄：<input name = "age">
    <input type="submit" value="提交">
</form>

<h1>3、动态占位符提交</h1>
<a href="${pageContext.request.contextPath}/three/zhangsan/22.action">占位符处理</a>

<h3>4、参数名称不一致的解决方法</h3>
<form action="${pageContext.request.contextPath}/fore.action" method="get">
    姓名：<input name="name">
    年龄：<input name = "age">
    <input type="submit" value="提交">
</form>
</body>
</html>