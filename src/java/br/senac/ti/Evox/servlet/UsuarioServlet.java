/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.servlet;

import br.senac.ti.Evox.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Senacrio
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class UsuarioServlet extends HttpServlet {

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
        String login = request.getParameter("txtLogin");
        String password = request.getParameter("txtSenha");
        String users = request.getParameter("usuarios");

         UsuarioDAO dao = new UsuarioDAO();
        
        ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.getUsuario();
        
        request.setAttribute("lista", lista);
        request.getRequestDispatcher("/PerfilServlet").forward(request, response);
        
        
        /*if (login(login,password,users)) {
            
            
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/perfilservlet");
            rd.forward(request, response);
            

        } else {

           
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/Cadastro_Usuario.jsp");
            rd.include(request, response);
             out.println("<font color=red>Senha ou usuário errado.</font>");

        }
*/
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
        processRequest(request, response);
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
