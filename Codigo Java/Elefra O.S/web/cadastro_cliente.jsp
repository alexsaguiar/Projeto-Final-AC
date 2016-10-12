<%-- 
    Document   : cadastro_cliente
    Created on : 27/09/2016, 21:57:01
    Author     : ADM
--%>

<%@page import="cidade.CidadeDAO"%>
<%@page import="cidade.Cidade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Cliente.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Cliente</title>
    </head>
    <body>
        <div  style="position:fixed; width:100%; height: 100px; top: 0; background: #fff">
            <div align="center"> <h1 style="color:black;"><em><u>Cadastro do Cliente</u></em></h1> </div>
            <!-- criado para esticar a imagem no campo do html -->
            <img src="bloco.jpg" style="width:100%; height: 100px;" /> 
        </div>
        <!-- parte 2 da fixação - feito para movimentar a tela por baixo do topo -->
        <div style="margin-top: 150px;">  <!-- para verificar minimiza a tela -->
            <h1>Cadastro cliente</h1>
            <div style="color:red">${erro}</div>
            <div style="color:red">${sucesso}</div>
            <div align="center">
                <form style="width: 200px;" action="SalvarServlet" method="post">
                    <label>Código:</label>
                    <input name="codigo" value="${Codigo}">
                    <br>
                    <label>Nome:</label>
                    <input name="nome" value="${nome}">
                    <br>
                    <label>E-mail:</label>
                    <input name="email" value="${e-mail}">
                    <br>
                    <label>Cidade Natal:</label>
                    <select name="cidade">

                        <% for (Cidade cidade : CidadeDAO.listar()) {%>
                        <option value="<%=cidade.codigo%>">
                            <%=cidade.nome%>
                        </option>
                        <% }%>
                    </select>
                    <input type="submit" value="Cadastrar">
                </form>
            </div>
            <div align="center" style="margin-top: 100px;">
                <footer>
                    <table border="1">
                        <tr>
                            <td>Direitos Reservados a Empresa de Gerenciamento de Software Elefra</td>
                        </tr>
                    </table>
                </footer>
            </div>
        </div>
    </body>
</html>
