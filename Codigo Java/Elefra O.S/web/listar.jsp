<%-- 
    Document   : listar
    Created on : 27/09/2016, 19:13:50
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cliente.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Cliente</title>
    </head>
    <body>
        
        <h1>Lista de Clientes Cadastrados</h1>
        <table>
            <thead>
                <tr>
                    <td>Codigo</td>
                    <td>Nome</td>
                    <td>E-mail</td>
                    <td>Telefone Residêncial</td>
                    <td>Telefone Celular</td>
                    <td>Cidade Natal</td>
                    <td>UF</td>
                    <td></td>
                </tr>
            </thead>
            <tbody>
                <tr> 
                    <% for (Cliente cliente: ClienteDAO.listar()) { %> 
                    <td> <%= cliente.codigo %></td>
                    <td><%= cliente.nome %></td>
                    <td><%= cliente.email %></td>
                    <td><%= cliente.telefone %></td>
                    <td><%= cliente.celular %></td>
                    <td> <%= cliente.cidadeNatal.nome %> </td>
                    <td> <%= cliente.cidadeNatal.estado %> </td>
                    <td> <a href="editar.jsp?codigo=<%=cliente.codigo%>"></a></td>
                    <td> <a href="ExcluirServlet?codigo=<%=cliente.codigo%>"> Excluir </a>  </td>
                </tr>
                 <% } %>
            </tbody>
        </table>              
    </body>
</html>
