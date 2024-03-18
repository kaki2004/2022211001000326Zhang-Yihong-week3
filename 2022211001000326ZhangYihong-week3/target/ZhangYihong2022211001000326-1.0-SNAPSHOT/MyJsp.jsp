<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2024/3/9
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<a href="http://www.ecjtu.jx.cn/">go to ecjtu</a>
<form method="post">
    ID:<input type="text" name="name"><br/>
    username:<input type="text" name="id"><br/>
    password: <input type="password" id="password" name="password" autocomplete="off" required><br/>
    email:<input type="email" name="id"><br/>
    gender:
    <label for="male">
        <input type="radio" id="male" name="gender" value="male" checked/> Male
    </label>
    <label for="female">
        <input type="radio" id="female" name="gender" value="female"/> Female
    </label>
    <br/>
    <input type="submit" value="Send data to server"/>
</form>></body>
</html>
