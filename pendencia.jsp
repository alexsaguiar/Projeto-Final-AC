<%-- 
    Document   : index
    Created on : 07/10/2016, 19:23:50
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clientes.*"%>
<%@page import="historico.*" %>
<%@page import="historico.HistoricoDAO" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pendencia</title>
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
                                <li><a href="listar_historico.jsp">Histórico</a></li>
                            </ul>
                        </nav>
                    </div>
                </header>
            </div>
        </div>
        <div class="linha">
            <section>
                <div class="coluna col5 sidebar">
                    <h3>Seleção de Pendência</h3>
                    <img src="img/clique5.jpg" alt="imagem check" />
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
                <div class="coluna col7 contato">
                    <h2>Escolha a opção de Serviço:</h2>
                    <h4 style="color:#FF0000">Atenção !!! preencha os campos sem as pontuações (ç ~ ´)</h4>
                    <form action="Salvar_Historico_Servlet" method="post"> 
                        <label>Codigo do Serviço:</label>
                        <input placeholder="verificar codigo" name="codigo_historico">
                        <br> 
                        <label>Descrição do Serviço:</label>
                        <select name="pendente">
                            <option value="troca de Lampada">Troca de Lampada</option>
                            <option value="Reparo no Comedouro">Reparo no Comedouro</option>
                            <option value="Reparo na Ventilacao">Reparo na Ventilacao</option>
                            <option value="Reparo no Bebedouros">Reparo no Bebedouros</option>
                            <option value="Conserto no Aquecedor">Conserto no Aquecedor</option>
                            <option value="Regulagem da Umidade">Regulagem da Umidade</option>
                        </select>  
                        <br>
                        <br>
                        <br>
                        <label>Trabalhos Concluidos:</label>
                       <select name="tb_concluido">
                            <option value="Sim">Sim</option>
                            <option value="Nao">Nao</option>
                       </select>
                        <br> 
                        <label>Observação:</label>
                        <textarea  name="observacao" ></textarea>
                        <input type="submit" class="botao" value="Salvar &raquo;" />
                    </form> 
                </div>
            </section>
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
                    <h3>Seja um novo cliente</h3>
                    <ul class="sem-marcador sem-padding noticias">
                        <li>
                            <img src="img/clique.png" alt="imagem pessoas ">
                            <h4>Venha fazer parte de nossos clientes</h4>
                            <p>Teremos sempre o privilégio de termos conosco</p>
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
