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
    <%--<base href="<%=basePath%>">--%>
    <title>成功显示</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="alert alert-success">
        <h2>${customer.customerName}</h2>
        <h2>${customer.customerEmail}</h2>
        <h2>${customer.customerPhone}</h2>
        <h2>${customer.customeCreateTime}</h2>
        <h2>${customer.customerMoney}</h2>
    </div>
    <div class="alert alert-success">
        <c:forEach var="address" items="${addressList}">
            <h3>${address.id}</h3>
            <h3>${address.province}</h3>
            <h3>${address.city}</h3>
            <h3>${address.country}</h3>
            <h3>${address.road}</h3>
        </c:forEach>
    </div>
<script src="js/jquery-3.2.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>