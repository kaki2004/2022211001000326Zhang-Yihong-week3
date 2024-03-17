<%--
  Created by IntelliJ IDEA.
  User: j
  Date: 2024/3/17
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
New user registration
<form method="post" action="/register">
    ID:<input type="text" name="ID"><br/>
    username:<input type="text" name="username"><br/>
    password: <input type="password" name="password" autocomplete="off" required><br/>
    email:<input type="email" name="email"><br/>
    gender:
    <label for="male">
        <input type="radio" id="male" name="gender" value="male" checked/> Male
    </label>
    <label for="female">
        <input type="radio" id="female" name="gender" value="female"/> Female
    </label>
    <br/>
    <input type="submit" value="Register"/>
</form></body>
</html>

</body>
</html>
