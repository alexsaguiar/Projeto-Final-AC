<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>   <!--  ***********criar esta pagina no jsp ***** -->
    <head>
        <title>Cadastro cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>  <!-- background="imagem lampada1.jpg" style="background-repeat: no-repeat; background-size:100%;" == Podemos direcionar usando marginheight="200px" topmargin="150px" -->
        <div>
            <!--  -->
            <!-- começo  parte 1 feito para fixar o topo da tela e movi mentar a tela por baixo do topo -->
            <div  style="position:fixed; width:100%; height: 100px; top: 0; background: #fff">
                <div align="center"> <h1 style="color:black;"><em><u>Cadastro do Cliente</u></em></h1> </div>
                <!-- criado para esticar a imagem no campo do html -->
                <img src="bloco.jpg" style="width:100%; height: 100px;" /> 
            </div>
            <!-- parte 2 da fixação - feito para movimentar a tela por baixo do topo -->
            <div style="margin-top: 150px;">  <!-- para verificar minimiza a tela -->

                <!--  hr feito para o estilo da linha reta no meio do site-->
                <hr size="1" noshade style="width:100%; height: 10px;">  
                <div align="center">
                    <h1><u>Pagina de gerenciamento de cadastro de usuario do programa</u></h1>
                    <br>
                    <p><em>Faça aqui seu cadastro para um novo Eletricista ou Avicultor</em></p>
                </div>
                <div align="center">
                    <img src="imagem lanterna.jpg" border="0" style=" width: 200px; height: 120px;">
                </div>

                <div  align="center"> <!--style="opacity:1;" verificar com o prof Diego o que faz essa tag -->
                    <form style="background-color:#ccc; width:200px;" action="SalvarServlet" method="post"> 
                        <!--  <form style="background-image:url('imagem lanterna.jpg');    width:200px" action="SalvarServlet" method="post"> -->

                        <label>Codigo:</label>
                        <input name="codigo">
                        <br>
                        <label>Nome:</label>
                        <input name="nome">
                        <br>
                        <label>E-mail:</label>
                        <input name="email">
                        <br>
                        <label>Telefone Residêncial:</label>
                        <input name="telefone">
                        <br>
                        <label>Telefone Celular:</label>
                        <input name="celular">
                        <br>
                        <label>Cidade:</label>
                        <input name="cidade">
                        <br>
                        <input type="submit" value="Cadastrar">
                    </form>
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
                <!-- fim  -->
                <!-- parte 3 fechamento da fixação - feito para movimentar a tela por baixo do topo -->
            </div> 
        </div> 
    </body>
</html>