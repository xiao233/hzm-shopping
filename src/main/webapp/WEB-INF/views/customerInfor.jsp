<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/26
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>当次会话</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<div class="alert alert-success">
    <h3>用户名: <c:out value="${sessionScope.customer.customerName}"></c:out></h3>
    <h3>密码:<c:out value="${sessionScope.customer.customerPassword}"></c:out></h3>
</div>
</body>
</html>
