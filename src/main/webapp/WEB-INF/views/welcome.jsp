<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/25
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎界面</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-center">欢迎进入</h1>
<div class="alert alert-success">
    <h2>name:${customer.customerName}</h2>
    <h2>password:${customer.customerPassword}</h2>
    <h2><a href="/showInfor.view">显示详细信息</a></h2>
    <h2><a href="/showAddress.view">显示地址信息</a></h2>
    <h2><a href="/showCustomer.view">显示用户信息</a></h2>
    <h2><a href="/checkSession.view">验证session</a></h2>
    <h2><a href="/getInfo/lxj/233">获取用户信息</a></h2>
</div>
</body>
</html>
