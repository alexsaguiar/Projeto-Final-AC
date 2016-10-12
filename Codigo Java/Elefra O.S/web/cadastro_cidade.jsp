<%-- 
    Document   : cadastro_cidade
    Created on : 27/09/2016, 21:59:40
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cidade.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Cidades</title>
    </head>
    <body>
        <div  style="position:fixed; width:100%; height: 100px; top: 0; background: #fff">
            <div align="center"> <h1 style="color:black;"><em><u>Cadastro do Cliente</u></em></h1> </div>
            <!-- criado para esticar a imagem no campo do html -->
            <img src="bloco.jpg" style="width:100%; height: 100px;" /> 
        </div>
        <!-- parte 2 da fixação - feito para movimentar a tela por baixo do topo -->
        <div style="margin-top: 150px;">  <!-- para verificar minimiza a tela -->
            <div align="center">
                <h1>Cadastramento de Cidades</h1>
            </div>
            <div align="center">
                <form action="Salvar_CidadeServlet" method="post">
                    <label>Codigo:</label>
                    <input name="codigo">
                    <br>
                    <label>Nome:</label>
                    <input name="nome">
                    <br>
                    <label>Estado:</label>
                    <select name="estado">
                        <option value="AC">AC</option>
                        <option value="AL">AL</option>
                        <option value="AP">AP</option>
                        <option value="AM">AM</option>
                        <option value="BA">BA</option>
                        <option value="CE">CE</option>
                        <option value="DF">DF</option>
                        <option value="ES">ES</option>
                        <option value="GO">GO</option>
                        <option value="MA">MA</option>
                        <option value="MT">MT</option>
                        <option value="MS">MS</option>
                        <option value="MG">MG</option>
                        <option value="PA">PA</option>
                        <option value="PB">PB</option>
                        <option value="PR">PR</option>
                        <option value="PE">PE</option>
                        <option value="PI">PI</option>
                        <option value="RJ">RJ</option>
                        <option value="RN">RN</option>
                        <option value="RS">RS</option>
                        <option value="RO">RO</option>
                        <option value="RR">RR</option>
                        <option value="SC">SC</option>
                        <option value="SP">SP</option>
                        <option value="SE">SE</option>
                        <option value="TO">TO</option>   
                    </select>
                    <input type="submit"  value="Cadastrar">
                </form>
            </div>
            <div align="center" style="margin-top: 400px;">
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

