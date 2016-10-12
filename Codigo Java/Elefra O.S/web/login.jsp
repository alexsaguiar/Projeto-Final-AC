<%-- 
    Document   : login
    Created on : 27/09/2016, 22:15:22
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div>
            ${erro}
        </div>
        <h1>Fazendo o login</h1>
        <form action="LoginServlet" method="post">
            <label>Usuário:</label>
            <input name="usuario">
            <br>
            <label>Senha:</label>
            <input name="senha" type="password">
            <br>
            <input type="submit" value="Entrar">
        </form>
    </body>
</html>
