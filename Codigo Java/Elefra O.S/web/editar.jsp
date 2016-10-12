<%-- 
    Document   : editar
    Created on : 27/09/2016, 22:07:13
    Author     : ADM
--%>

<%@page import="Cliente.Cliente"%>
<%@page import="Cliente.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>listar</title>
    </head>
    <body background="imagem eletrica 2 pagina.jpg" style="background-repeat: no-repeat; background-size:100%;">
        
        <%  int codigo = Integer.valueOf(request.getParameter("codigo"));
            Cliente cliente = ClienteDAO.buscar(codigo);
        %>
        <div align=center> 
            <table border="0">
               
                <form action="EditarServlet" method="post"> 
                    <label>Codigo:</label>
                    <input name="codigo" value="<%= cliente.codigo%>">
                    <br>
                    <label> Nome:</label>
                    <input name="nome" value="<%= cliente.nome%>">
                    <br>
                    <label>E-mail:</label>
                    <input name="email" value="<%= cliente.email%>">
                    <br>
                    <label>Telefone Residêncial:</label>
                    <input name="telefone" value="<%= cliente.telefone%>">
                    <br>
                    <label>Telefone Celular:</label>
                    <input name="celular" value="<%= cliente.celular%>">
                    <br>        
                    <input type="submit" value="Cadastrar">
                </form>
            </table>
        </div>
    </body>
</html>