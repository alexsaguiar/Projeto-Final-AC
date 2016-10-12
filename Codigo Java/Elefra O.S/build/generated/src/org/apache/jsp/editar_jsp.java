package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Cliente.Cliente;
import Cliente.ClienteDAO;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>listar</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"imagem eletrica 2 pagina.jpg\" style=\"background-repeat: no-repeat; background-size:100%;\">\n");
      out.write("        \n");
      out.write("        ");
  int codigo = Integer.valueOf(request.getParameter("codigo"));
            Cliente cliente = ClienteDAO.buscar(codigo);
        
      out.write("\n");
      out.write("        <div align=center> \n");
      out.write("            <table border=\"0\">\n");
      out.write("               \n");
      out.write("                <form action=\"EditarServlet\" method=\"post\">\n");
      out.write("                    <label>Codigo:</label>\n");
      out.write("                    <input name=\"codigo\" value=\"");
      out.print( cliente.codigo);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label> Nome:</label>\n");
      out.write("                    <input name=\"nome\" value=\"");
      out.print( cliente.nome);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>E-mail:</label>\n");
      out.write("                    <input name=\"email\" value=\"");
      out.print( cliente.email);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Residêncial:</label>\n");
      out.write("                    <input name=\"telefone\" value=\"");
      out.print( cliente.telefone);
      out.write("\">\n");
      out.write("                    <br>\n");
      out.write("                    <label>Telefone Celular:</label>\n");
      out.write("                    <input name=\"celular\" value=\"");
      out.print( cliente.celular);
      out.write("\">\n");
      out.write("                    <br>        \n");
      out.write("                    <input type=\"submit\" value=\"Cadastrar\">\n");
      out.write("                </form>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
