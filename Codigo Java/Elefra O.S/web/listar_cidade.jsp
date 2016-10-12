<%-- 
    Document   : listar_cidade
    Created on : 27/09/2016, 22:14:20
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cidade.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista das Cidade</title>
    </head>
    <body>
        <h1>Lista de Cidade</h1>
        <form>
            <table border="1">
                <select name="cidade">
                    <% for (Cidade cidade : CidadeDAO.listar()) { %>
                    <option value="<=%cidade.codigo%>"> <"%Cidade.nome%"> </option> 
                    <% } %>
                </select>
                <input type="submit" value="Cadastrar">
            </table>
        </form>
    </body>
</html>
