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
<header class="jumbotron rounded mb-0 rounded rounded-circle text-center">
    <span class="text-danger display-4">MAVEN+S2SH多模块整合</span>
</header>
<article class="border border-dark">
    <header class="text-center">
        <span class="text-warning h1 align-center"> 用户信息表</span>
        <a href="register.jsp" class="btn btn-danger float-right">注册</a>
    </header>
    <section class="align-center">
        <table class="table table-striped table-bordered text-center table-hover w-50 offset-3">
            <thead>
            <tr class="bg-success">
                <th>用户ID</th>
                <th>用户账号</th>
                <th>用户密码</th>
            </tr>
            </thead>
            <tbody id="users">
            </tbody>
        </table>
    </section>
</article>
<s:debug/>
<script src="<c:url value="jquery/jquery-3.4.1.min.js"/> "></script>
<script src="<c:url value="bootstrap4/js/popper.min.js"/> "></script>
<script src="<c:url value="bootstrap4/js/bootstrap.min.js"/> "></script>
<script>
    /**
     * 查询所有用户
     */
    function findAllUser() {
        $.post("<s:url namespace="/user" action="findAllUser"/>", {}
            , function (users) {
                const $users = $("#users");
                let tr = "";
                $users.fadeOut(2000);
                $.each(users, function (index, user) {
                    tr += "<tr><td>" + user.userId + "</td><td>" + user.userName + "</td><td>" + user.password + "</td></tr>";
                });
                $users.append(tr);
                $users.fadeIn(2000);
            }, "json");
    }

    $(function () {
        $("#users").hide();
        findAllUser();
    });
</script>
</body>
</html>
