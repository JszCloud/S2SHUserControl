<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/2 0002
  Time: 下午 05:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>

    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="js/common.js"></script>

</head>
<body>

<div class="div1">
    <h2>新增用户信息</h2>
    <form action="userAction!do_save" method="post">
        <label>用户名称：</label>
        <input type="text" name="user.name" size="50" placeholder="请输入你的用户名！"><br><br>

        <label>电子邮箱：</label>
        <input type="text" name="user.email" size="50" placeholder="请输入你的邮箱！"><br><br>
        <label>性别：</label>
        <input type="radio" name="user.sex" checked="checked" value="男">男
        <input type="radio" name="user.sex" value="女">女<hr>
        <button type="submit" class="btn1">保存</button>
        <button type="reset" class="btn2">重置</button>
        <button class="btn3" type="button">返回</button>
    </form>
</div>


</body>


