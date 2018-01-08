<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/2 0002
  Time: 下午 05:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <script type="text/javascript" src="../js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
</head>

<body>
<div class="div2">
    <label>用户名称：</label>
    <input type="text" name="">
    <button>查询</button>
    <table>
        <tr>
            <th>
                <input type="checkbox" name="over" id="over">
            </th>
            <th>ID</th>
            <th>
                用户名称
            </th>

            <th>邮箱</th>
            <th>性别</th>
            <th>创建时间</th>
            <th>修改时间</th>
            <th>操作</th>

        </tr>

        <c:forEach items="${list}" var="user">
            <tr id="tr">
                <td>
                    <input type="checkbox" name="over">
                </td>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.sex}</td>
                <td>${user.createDate}</td>
                <td>${user.updateDate}</td>
                <td>
                    <a href="#">修改</a>
                    <a href="#">删除</a>
                </td>
            </tr>
        </c:forEach>

    </table>

    <ul class="pagination .mx-auto">
    <c:if test="${page.pages!=1}">
        <li class="page-item"><a class="page-link" href="userAction!list?page.pages=${page.pages-1}">上一页</a></li>
    </c:if>
        <c:forEach var="current" begin="1" end="${page.sum/page.cut+1}"
                   varStatus="status">

            <li class="page-item"><a class="page-link" href="userAction!list?page.pages=${current}">${current}</a></li>

        </c:forEach>
    <c:if test="${page.pages<page.sum/page.cut}">
        <li class="page-item"><a class="page-link" href="userAction!list?page.pages=${page.pages+1}">下一页</a></li>
    </c:if>

    </ul>
</div>
<%--<script type="text/javascript">
    $(function() {
        $.ajax({
            url: "demo_ajax_load.txt",
            async: true,
            type:post,
            success: function(result) {
                $("#tr").html(result);
            },
            dataType:json
        })
    })
</script>--%>
</body>

</html>
