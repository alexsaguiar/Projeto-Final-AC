<%-- 
    Document   : index
    Created on : 07/10/2016, 19:23:50
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="normalize.css" /> 
        <style>
            @import 'https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700';
        </style>
        <link rel="stylesheet" href="estilos.css" /> 
        <%@page import="clientes.*"%>
        <%@page import="historico.*" %>
        <%@page import="historico.HistoricoDAO" %>

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
                                <li> <a href="index.jsp" target="_blank">Home &raquo;</a></li>
                                <li> <a href="pendencia.jsp" target="_blank">Pendências &raquo;</a></li>
                                <li> <a href="listar_historico.jsp" target="_blank">Histórico &raquo;</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col3 sidebar">
                    <img src="img/TRABALHO 2.png" />
                    <ul class="sem-marcador sem-padding noticias">
                    <li><u><strong>Elefra O.S</strong>  </u></li>
                    <li><strong>Endereço:</strong></li>
                    <li>Rua das Camélias, 123</li>
                    <li>Bairro das Flores</li>
                    <li>Bela Flor - Pr</li>                                           
                </ul>
                <h3>Contato Direto</h3>
                <ul class="sem-marcador sem-padding noticias">
                    <li>Fone: <strong>(46) 9999-9999</strong></li>
                    <li>e-mail: <strong>elefra@elefra.com</strong></li>
                    <li>Facebook: <strong>elefra.facebook</strong></li>                                           
                </ul>
                </div>
                <div class="coluna col9">
                    <h2><em>Agilidade em suas tarefas conte conosco da Elefra</em></h2>
                    <img src="img/ELETRICA.jpg" alt="imagem" />
                    <p></p>
                 <!--   <a href="clientes.html" class="botao">Verificar o que pode ser feito aqui &raquo;</a> -->
                </div>
            </section>
        </div>
        <div class="conteudo-extra">
            <div class="linha">
                <section>
                    <h2>Avisos</h2>
                    <p>Neste site você pode analisar o quando pode ser útil para o auxílio de todo eletricista</p>
                    <h2>O que você irá encontrar no Site ?</h2>
                    <p>Tendo o melhor assistente para ajudar no que for preciso na organização das suas tarefas</p>
                    <h2>Temas</h2>
                    <p>Tendo como o propósito atender a sua necessidade de continuas melhoras no ramo de atuação</p>
                </section>
            </div>
            <div class="coluna col5">
                <h3>Noticias</h3>
                <ul class="sem-marcador sem-padding noticias">
                    <li>
                        <img src="img/imagem lanterna.jpg" alt="imagem lanterna" />
                        <h4>Acompanhe as ultimas tendências</h4>
                        <p>Surgindo no mercado um organizador de tarefas para eletricistas que 
                            tenham como foco a manutenção de aviários na região sudoeste do Paraná.
                            Para ser mais preciso no munícipio de Dois Vizinhos, onde, se concentram as maiores empresas 
                            do ramo de aves da américa latina.
                            <a href="">leia mais &raquo;</a></p>
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
    </body>
</html>



<!-- 
<h3>Clientes Satisfeitos</h3>
                    <div class="coluna col3 sidebar">
                    <ul class="sem-marcador sem-padding">
                        <li><a href="listar.jsp">Listas de Pessoas</a></li>
                        <li><a href="listar_cidade.jsp">Lista de Cidades</a></li>
                        <li><a href="">Histórico</a></li>
                        <li><a href="">Serviços</a></li>
                        <li><a href="">Pendências</a></li>                      
                    </ul>
                    <a href="cliente.html" class="botao">Verificar o que pode ser feito aqui &raquo;</a>
-->