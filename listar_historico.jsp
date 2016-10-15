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
        <title>Histórico</title>
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
                                <li><a href="index.jsp">Home</a></li>
                                <li><a href="pendencia.jsp">Pendência</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Histórico</h3>
                    <img src="img/fibra otica.jpg" alt="imagem luzes" />
                    <ul class="sem-marcador sem-padding noticias">
                        <li><u><strong>Serviços</strong></u></li>
                        <li><strong>Pendentes</strong></li>                                   
                    </ul>
                </div>
            </section>
            <section>
                <div align="center" class="coluna col7 contato">
                    <h2>Histórico</h2>
                    <table border="1">
                        <thead>
                            <tr>
                                <td>codigo</td>
                                <td>Pendentes</td>
                                <td>Trabalhos Concluidos</td>
                                <td>Observacao</td>
                                <td>Editar</td>
                                <td>Excluir</td>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Historico historico : HistoricoDAO.listar_historico()) {%>  
                            <tr> 
                                <td> <%=historico.codigo_historico%> </td>
                                <td> <%= historico.pendente%>        </td>
                                <td> <%= historico.tb_concluido%>    </td>
                                <td> <%= historico.observacao%>      </td>

                                <td> <a href="atualizar_historico.jsp?codigo_historico=<%=historico.codigo_historico%>"> Editar </a> </td>
                                <td> <a href="Excluir_Historico_Servlet?codigo_historico=<%=historico.codigo_historico%>"> Excluir </a> </td>

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
        </div>
    </body>
</html>
