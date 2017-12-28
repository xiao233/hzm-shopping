<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();//代表应用名
    String basePath = request.getScheme() + "://"//
            + request.getServerName() + ":"//服务器地址
            + request.getServerPort() + path + "/";//请求端口号
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>错误提示</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="alert-warning text-center">
        <c:out value="${infor}"></c:out>
    </div>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>