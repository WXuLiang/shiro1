<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/1 0001
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div>
    <h3>登录成功了</h3>
    <br>
    以下内容会根据不同用户的不同权限看到不同内容<br>
    <br>
    你拥有如下功能:<br>
    <shiro:hasPermission name="product:project:view1">
        <li class='O1'><button type="button" class="btn btn-primary btn-search" >1.查询</button></li>
    </shiro:hasPermission>


    <shiro:hasPermission name="product:project:add">
        <li class='O2'><button type="button" class="btn btn-primary btn-add">2.添加</button></li>
    </shiro:hasPermission>


    <shiro:hasPermission name="product:project:close">
        <li class='O3'><button type="button" class="btn btn-primary btn-invalid">3.禁用</button></li>
    </shiro:hasPermission>


    <shiro:hasPermission name="product:project:open">
        <li class='O4'><button type="button" class="btn btn-primary btn-valid">4.启用</button></li>
    </shiro:hasPermission>


</div>
</body>
</html>
