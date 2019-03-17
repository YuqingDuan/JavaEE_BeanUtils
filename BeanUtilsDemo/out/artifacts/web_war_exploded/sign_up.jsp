<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Sign Up Page</title>
    </head>
    <body>
        <form method="post" action="RegisterServlet">
            username:&nbsp;<input type="text" name="username"><br>
            <br>
            password:&nbsp;<input type="password" name="password"><br>
            <br>
            email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email"><br>
            <br>
            phone:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phone"><br>
            <br>
            address:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address"><br>
            <br>
            birthday:&nbsp;&nbsp;&nbsp;<input type="text" name="birthday"><br>
            <br>
            age:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="age"><br>
            <br>
            <input type="submit" value="sign up">
        </form>
    </body>
</html>