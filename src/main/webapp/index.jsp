<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加用户</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="js/common.js"></script>

</head>
<body>
<header>
    <img src="images/logo.png">
    用户管理系统
    <div class="nav1">
        <a href="#">帮助</a>
        <a href="#">退出</a>
    </div>
</header>
<section>
    <aside>
        <ul class="ul">
            <li>用户查询</li>
            <li>用户新增</li>
        </ul>
    </aside>
    <article>
        <iframe class="iframe" src="userAction!list" seamless="seamless" width="100%" height="100%" scrolling="no"></iframe>
    </article>
</section>
<footer></footer>

</body>
</html>
