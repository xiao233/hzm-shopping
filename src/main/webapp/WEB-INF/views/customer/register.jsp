<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/12/26
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/bootstrap.css" rel="stylesheet">
</head>
<body>
<c:if test="${info.trim() eq 'registerFail'}">
    <div class="alert alert-warning text-center" style="font-size: 30px">
        抱歉，${customerName}注册失败。
    </div>
</c:if>
<form class="form-horizontal" role="form" action="/customer/register.do" method="post" onsubmit="return checkAll()">
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">用户账户:</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="name" name="customerName" placeholder="请输入用户名">
        </div>
        <div class="col-sm-4">
            <span id="checkName"></span>
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">用户密码:</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" id="password" name="customerPassword" placeholder="请输入密码">
        </div>
        <div class="col-sm-4">
            <span id="checkPassword"></span>
        </div>
    </div>
    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">用户邮箱:</label>
        <div class="col-sm-4">
            <input type="email" class="form-control" id="email" name="customerEmail" placeholder="请输入邮箱">
        </div>
        <div class="col-sm-4">
            <span id="checkEmail"></span>
        </div>
    </div>
    <div class="form-group">
        <label for="phone" class="col-sm-2 control-label">用户电话:</label>
        <div class="col-sm-4">
            <input type="text" class="form-control" id="phone" name="customerPhone" placeholder="请输入电话" maxlength="11">
        </div>
        <div class="col-sm-4">
            <span id="checkPhone"></span>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-4">
            <button type="submit" class="btn btn-primary btn-block">立即注册</button>
        </div>
    </div>
</form>
<script src="/js/jquery-3.2.1.js"></script>
<script src="/js/bootstrap.js"></script>
<script src="/js/myjs/register.js"></script>
</body>
</html>
