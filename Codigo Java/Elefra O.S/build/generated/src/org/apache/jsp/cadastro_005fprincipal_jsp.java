package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastro_005fprincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>   <!--  ***********criar esta pagina no jsp ***** -->\n");
      out.write("    <head>\n");
      out.write("        <title>Cadastro cliente</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>  <!-- background=\"imagem lampada1.jpg\" style=\"background-repeat: no-repeat; background-size:100%;\" == Podemos direcionar usando marginheight=\"200px\" topmargin=\"150px\" -->\n");
      out.write("\n");
      out.write("        <!--  -->\n");
      out.write("        <!-- começo  parte 1 feito para fixar o topo da tela e movi mentar a tela por baixo do topo -->\n");
      out.write("        <div  style=\"position:fixed; width:100%; height: 100px; top: 0; background: #fff\">\n");
      out.write("            <div align=\"center\"> <h1 style=\"color:black;\"><em><u>Cadastro do Cliente</u></em></h1> </div>\n");
      out.write("            <!-- criado para esticar a imagem no campo do html -->\n");
      out.write("            <img src=\"bloco.jpg\" style=\"width:100%; height: 100px;\" /> \n");
      out.write("        </div>\n");
      out.write("        <!-- parte 2 da fixação - feito para movimentar a tela por baixo do topo -->\n");
      out.write("        <div style=\"margin-top: 150px;\">  <!-- para verificar minimiza a tela -->\n");
      out.write("\n");
      out.write("            <!--  hr feito para o estilo da linha reta no meio do site-->\n");
      out.write("            <hr size=\"1\" noshade style=\"width:100%; height: 10px;\">  \n");
      out.write("            <div align=\"center\">\n");
      out.write("                <h1><u>Pagina de gerenciamento de cadastro de usuario do programa</u></h1>\n");
      out.write("                <br>\n");
      out.write("                <p><em>Sendo utilizada tanto para cadastrar um novo Eletricista ou Avicultor</em></p>\n");
      out.write("            </div>\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <img src=\"imagem lanterna.jpg\" border=\"0\" style=\" width: 200px; height: 120px;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div  align=\"center\"> <!--style=\"opacity:1;\" verificar com o prof Diego o que faz essa tag -->\n");
      out.write("                <form style=\"background-color:#ccc; width:200px;\" action=\"SalvarServlet\" method=\"post\"> \n");
      out.write("                    <!--  <form style=\"background-image:url('imagem lanterna.jpg');    width:200px\" action=\"SalvarServlet\" method=\"post\"> -->\n");
      out.write("\n");
      out.write("                    <label>Codigo:</label>\n");
      out.write("                    <input name=\"codigo\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Nome:</label>\n");
      out.write("                    <input name=\"nome\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>E-mail:</label>\n");
      out.write("                    <input name=\"email\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Residêncial:</label>\n");
      out.write("                    <input name=\"telefone\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Celular:</label>\n");
      out.write("                    <input name=\"celular\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Cidade:</label>\n");
      out.write("                    <input name=\"cidade\">\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"submit\" value=\"Cadastrar\">\n");
      out.write("                </form>\n");
      out.write("                <div align=\"center\" style=\"margin-top: 100px;\">\n");
      out.write("                    <footer>\n");
      out.write("                        <table border=\"1\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Direitos Reservados a Empresa de Gerenciamento de Software Elefra</td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </footer>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- fim  -->\n");
      out.write("            <!-- parte 3 fechamento da fixação - feito para movimentar a tela por baixo do topo -->\n");
      out.write("        </div> \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
