<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/26
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
    <script src="/js/jquery-3.2.1.js"></script>
    <script src="/js/bootstrap.js"></script>
</head>
<body>

<c:if test="${info.trim().toLowerCase() eq 'fail'}">
    <div class="alert alert-warning text-center" style="font-size: 30px">
        抱歉，登录失败，请核对用户名和密码是否正确。
    </div>
</c:if>
<c:if test="${info.trim() eq 'registerSuccess'}">
    <div class="alert alert-success text-center" style="font-size: 30px">
        恭喜，${customerName}注册成功，请登录。
    </div>
</c:if>
<c:if test="${exit.toLowerCase() eq 'success'}">
    <div class="alert alert-success text-center" style="font-size: 30px">
        恭喜，${customer.customerName}成功退出系统。
    </div>
</c:if>

<form class="form-horizontal" role="form" action="/customer/login.do" method="post">
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">用户账户:</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="name" name="customerName" placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">用户密码:</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" id="password" name="customerPassword" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-2">
            <div class="checkbox">
                <label>
                    <input type="checkbox" name="remember">请记住我
                </label>
            </div>
        </div>
        <div class="col-sm-2">
            <a href="/customer/register.view">注册</a>
            &nbsp;
            &nbsp;
            <a href="#">忘记密码?</a>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-4">
            <button type="submit" class="btn btn-primary btn-block">登录</button>
        </div>
    </div>
</form>
</body>
</html>
