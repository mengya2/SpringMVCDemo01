
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h2>这里是view下的页面,用来进行获取数据处理</h2>
requestStu:${requestStu}<br>
sessionS:${sessionS}<br>
modeS:${modeS}<br>
mapS:${mapS}<br>
modeMapS；${modeMapS}

<h2>这里是单个日期的显示</h2>
单个日期的显示：${mydate}
<h2>传过来的main，处理日期数据的集合</h2>
lists:${list}

</body>
</html>
