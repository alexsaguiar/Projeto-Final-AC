/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADM
 */
public class Salvar_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SalvarServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SalvarServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("nome_cliente").isEmpty()
                || request.getParameter("codigo_cliente").isEmpty()
                || request.getParameter("login_usuario").isEmpty()
                || request.getParameter("cliente").isEmpty()
                || request.getParameter("email").isEmpty()
                || request.getParameter("nome_cidade").isEmpty()) {
            request.setAttribute("erro",
                    "Preencha todos os campos corretamente.");
            request.getRequestDispatcher(
                    "cadastro_principal.jsp")
                    .forward(request, response);
        } else {

            int codigo_cliente = Integer.valueOf(request.getParameter("codigo_cliente"));
            String nome_cliente = request.getParameter("nome_cliente");
            String login_usuario = request.getParameter("login_usuario");
            String cliente = request.getParameter("cliente");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            String celular = request.getParameter("celular");
            String senha = request.getParameter("senha");
            String observacao = request.getParameter("observacao");
            String nome_cidade = request.getParameter("nome_cidade"); //
            String estado = request.getParameter("estado");

            ClienteDAO.salvar(codigo_cliente, nome_cliente, login_usuario, cliente, email, telefone, celular, senha, observacao, nome_cidade, estado);

            //serve para deixar mensagem é utilizado para aparecer na mesma pagina
            /*
            request.setAttribute("sucesso",
                    "Cadastro realizado com sucesso!");
            request.getRequestDispatcher(
                 //   "listar_cliente.jsp") 
                    .forward(request, response);
             */
            response.sendRedirect("listar_cliente.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
