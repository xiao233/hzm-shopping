<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/26
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户主界面</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <script src="/js/jquery-3.2.1.js"></script>
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<div class="alert alert-success text-center" style="font-size: 30px">
    恭喜，${customer.customerName}登录成功
</div>
<div>
    <ul class="nav nav-tabs">
        <li class="active">
            <a href="#">Home</a>
        </li>
        <li>
            <a href="#">信息管理</a>
        </li>
        <li>
            <a href="#">查看商品</a>
        </li>
        <li>
            <a href="#">订单管理</a>
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">地址管理
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li>
                    <a href="#">Swing</a></li>
                <li>
                    <a href="#">jMeter</a></li>
                <li>
                    <a href="#">EJB</a></li>
                <li class="divider"></li>
                <li>
                    <a href="#">分离的链接</a></li>
            </ul>
        </li>
        <li>
            <a href="/customer/exitProgram.do">退出系统</a></li>
    </ul>
</div>
</body>
</html>
