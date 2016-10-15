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
        <title>Login</title>
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
                                <li><a href="index.jsp" target="_blank">Home</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Faça seu Login &raquo;</h3>
                    <img src="img/pessoas2.jpg" alt="imagem pessoas" />
                    <ul class="sem-marcador sem-padding noticias">
                        <li><u><strong>Elefra O.S</strong>  </u></li>
                        <li><p>Cuidando sempre de você</p></li>                                         
                    </ul>
                </div>
                <div align="center">
                    <div>
                        ${erro}
                    </div>
                    <div class="coluna col7 contato login">
                        <h1>Faça o login</h1>

                        <form action="Login" method="post">
                            <label>Usuário:</label>
                            <input name="login_usuario">
                            <br>
                            <label>Senha:</label>
                            <input name="senha" type="password">
                            <br>
                            <br>
                            <input type="submit" class="botao" value="Entrar &raquo;" />
                        </form> 
                    </div>
                </div>
        </div>            
        <div class="conteudo-extra">
            <div class="linha">
                <div class="coluna col7">
                    <section>
                        <h2>Atenção:</h2>
                        <p>Analise todas as informações para não efetuar o cadastro errado</p>
                    </section>
                </div>
                <div class="coluna col5">
                    <h3>Esteja sempre conectado conosco</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/tomada.png" alt="imagem tomada">
                            <h4>Esteja sempre atualizado</h4>
                            <p>Mantenha seus dados sempre em dia</p>
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
