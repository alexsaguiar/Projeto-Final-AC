<%-- 
    Document   : index
    Created on : 07/10/2016, 19:23:50
    Author     : ADM
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clientes.ClienteDAO"%>
<%@page import="clientes.*"%>
<%@page import="historico.*" %>
<%@page import="historico.HistoricoDAO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista Cliente</title>
        <link rel="stylesheet" href="normalize.css" /> 
        <style>
            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';
        </style>
        <link rel="stylesheet" href="estilos.css" /> 
    </head>
    <body>
        <div class="header">
            <div class="linha">
                <header>
                    <div class="coluna col4">
                        <h1 class="logo">Elefra O.S</h1>
                    </div>
                    <div class="coluna col8">
                        <nav>
                            <ul class="menu inline sem-marcador">
                                <li><a href="cadastro_principal.jsp">Gerenciador</a></li>
                                <li><a href="login.jsp">Login</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <section>
            <div style="margin-left: 150px;" align="center" class="coluna col7 contato">
                <h2 align="center;">Lista de Clientes</h2>
                <table  border="1">
                    <thead>
                        <tr>
                            <td>codigo_cliente</td>
                            <td>nome_cliente</td>
                            <td>Login/Usuário</td>
                            <td>cliente</td>
                            <td>email</td>
                            <td>telefone</td>
                            <td>celular</td>
                            <td>senha</td>
                            <td>observacao</td>
                            <td>cidade</td>
                            <td>estado</td>
                            <td>editar</td>
                            <td>excluir</td>
                        </tr>
                    </thead>
                    <tbody>
                    
                        <% for (Cliente cliente : ClienteDAO.listar_cliente()) {%>  
                        <tr>
                            <td> <%= cliente.codigo_cliente%> </td>
                            <td> <%= cliente.nome_cliente%> </td>
                            <td> <%= cliente.login_usuario%> </td>
                            <td> <%= cliente.cliente%> </td>
                            <td> <%= cliente.email%> </td>
                            <td> <%= cliente.telefone%> </td>  
                            <td> <%= cliente.celular%> </td>
                            <td> <%= cliente.senha%> </td>
                            <td> <%= cliente.observacao%> </td> 
                            <td> <%= cliente.nome_cidade%> </td>   <!--cliente.cidade.nome -->
                            <td> <%= cliente.estado%> </td>   <!--cliente.cidade.estado -->

                            <td> <a href="atualizar_editar.jsp?codigo_cliente=<%=cliente.codigo_cliente%>"> Editar </a> </td>
                            <td> <a href="ExcluirServlet?codigo_cliente=<%=cliente.codigo_cliente%>"> Excluir </a> </td>
                        </tr>
                        
                        <% }%>
                    </tbody>
                </table>  
            </div>
        </section>
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Pendências</h2>
                        <p>Certifique que todos os trabalhos foram bem feitos</p>
                        <p>caso não esteja satisfeito entre em contato com o nosso</p>
                        <p>telefone de contato (99)9999-9999</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Histórico</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/pessoas2.jpg" alt="imagem pessoas " />
                            <h4>Acompanhe todo o histórico de serviços</h4>
                            <p>Estará sempre atualizado com as ultimas informações
                                para sempre cumprirmos</p>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="footer">
                <div class="linha">
                    <footer>
                        <div class="coluna col12">
                            <span>&copy; 2016 Elefra O.S gerenciador de tarefas </span>
                        </div>
                    </footer>
                </div>
            </div>
        </div>
</body>
</html>
