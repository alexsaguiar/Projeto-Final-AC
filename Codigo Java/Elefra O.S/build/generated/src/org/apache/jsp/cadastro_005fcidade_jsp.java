package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cidade.*;

public final class cadastro_005fcidade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastro Cidades</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1>Cadastramento de Cidades</h1>\n");
      out.write("\n");
      out.write("        <div align=\"center\">\n");
      out.write("            <form action=\"Salvar_CidadeServlet\" method=\"post\">\n");
      out.write("                <label>Codigo:</label>\n");
      out.write("                <input name=\"codigo\">\n");
      out.write("                <br>\n");
      out.write("                <label>Nome:</label>\n");
      out.write("                <input name=\"nome\">\n");
      out.write("                <br>\n");
      out.write("                <label>Estado:</label>\n");
      out.write("                <select name=\"estado\">\n");
      out.write("                    <option value=\"AC\">AC</option>\n");
      out.write("                    <option value=\"AL\">AL</option>\n");
      out.write("                    <option value=\"AP\">AP</option>\n");
      out.write("                    <option value=\"AM\">AM</option>\n");
      out.write("                    <option value=\"BA\">BA</option>\n");
      out.write("                    <option value=\"CE\">CE</option>\n");
      out.write("                    <option value=\"DF\">DF</option>\n");
      out.write("                    <option value=\"ES\">ES</option>\n");
      out.write("                    <option value=\"GO\">GO</option>\n");
      out.write("                    <option value=\"MA\">MA</option>\n");
      out.write("                    <option value=\"MT\">MT</option>\n");
      out.write("                    <option value=\"MS\">MS</option>\n");
      out.write("                    <option value=\"MG\">MG</option>\n");
      out.write("                    <option value=\"PA\">PA</option>\n");
      out.write("                    <option value=\"PB\">PB</option>\n");
      out.write("                    <option value=\"PR\">PR</option>\n");
      out.write("                    <option value=\"PE\">PE</option>\n");
      out.write("                    <option value=\"PI\">PI</option>\n");
      out.write("                    <option value=\"RJ\">RJ</option>\n");
      out.write("                    <option value=\"RN\">RN</option>\n");
      out.write("                    <option value=\"RS\">RS</option>\n");
      out.write("                    <option value=\"RO\">RO</option>\n");
      out.write("                    <option value=\"RR\">RR</option>\n");
      out.write("                    <option value=\"SC\">SC</option>\n");
      out.write("                    <option value=\"SP\">SP</option>\n");
      out.write("                    <option value=\"SE\">SE</option>\n");
      out.write("                    <option value=\"TO\">TO</option>   \n");
      out.write("                </select>\n");
      out.write("                <input type=\"submit\"  value=\"Cadastrar\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div align=\"center\" style=\"margin-top: 100px;\">\n");
      out.write("            <footer>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Direitos Reservados a Empresa de Gerenciamento de Software Elefra</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
