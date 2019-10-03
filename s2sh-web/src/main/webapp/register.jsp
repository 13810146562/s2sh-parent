<%--
  User: zqq
  Date: 2019/9/27
  Time: 11:07
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta name="viewport" content="width=device-width,initial-scale=1,shrink-to-fit=no">
    <link rel="stylesheet" href="<c:url value="bootstrap4/css/bootstrap.min.css"/> ">
    <title>S2SH用户注册</title>
</head>
<body class="container">
<header class="jumbotron rounded mb-0 rounded-circle text-center">
    <span class="text-danger display-4">Maven+S2SH多模块整合</span>
</header>
<article class="border border-dark">
    <header class="text-center">
       <span class="text-warning h1"> 用户注册</span>
    </header>
    <section class="align-center">
        <form action="<s:url namespace="/user" action="register"/>" method="post">
                <fieldset class="col-8 offset-3">
                    <legend>请输入一下内容完成注册。</legend>
                    <div class="form-inline form-group">
                        <label for="username" class="h5">用户名：</label>
                        <input name="userName" type="text" class="form-control col-6" id="username" placeholder="请输入用户名" required="required">
                    </div>
                    <div class="form-inline form-group">
                        <label for="password" class="h5">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                        <input name="password" type="password" id="password" class="form-control col-6"placeholder="请输入密码" required="required">
                    </div>
                    <input type="submit" value="提&nbsp;&nbsp;交" class="btn btn-success offset-2">
                    <input type="reset" value="重&nbsp;&nbsp;置" class="btn btn-success offset-1">
                </fieldset>
        </form>
    </section>
</article>
<script src="<c:url value="jquery/jquery-3.4.1.min.js"/> "></script>
<script src="<c:url value="bootstrap4/js/popper.min.js"/> "></script>
<script src="<c:url value="bootstrap4/js/bootstrap.min.js"/> "></script>
</body>
</html>
