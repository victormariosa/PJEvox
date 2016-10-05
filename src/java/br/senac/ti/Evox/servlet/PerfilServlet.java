/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.servlet;

import br.senac.ti.Evox.bean.Perfil;
import br.senac.ti.Evox.dao.PerfilDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Senacrio
 */
@WebServlet(name = "PerfilServlet", urlPatterns = {"/PerfilServlet"})
public class PerfilServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("1");
            boolean resposta = false;
            String op = null, respST = null, resultado = null;

            Perfil CdAt = new Perfil();
            PerfilDAO dao = new PerfilDAO();

            op = request.getParameter("btOp");

            if (op.equals("Enviar")) {
                out.println("entrei no IF <br>");
                CdAt.setNome(request.getParameter("txtNome"));
                CdAt.setDescricao(request.getParameter("txtDescricao"));
                respST = request.getParameter("rdbSN");

                if (respST.equals("S")) {
                    CdAt.setAtivo(true);
                } else if (respST.equals("N")) {
                    CdAt.setAtivo(false);
                }

                resposta = dao.cadastrarPerfil(CdAt);

                if (resposta) {
                    resultado = "OK";
                } else {
                    resultado = "ERRO";
                }
            }else{
                if (op.equals("Alterar")) {
                    CdAt.setid_Perfil(Integer.parseInt(request.getParameter("Bid")));
                    CdAt.setNome(request.getParameter("Bnome"));
                    CdAt.setDescricao(request.getParameter("Bdescricao"));
                    respST = request.getParameter("Bestatus");

                    out.println("2");

                    if (respST.equals("S")) {
                    out.println("3");
                        CdAt.setAtivo(true);
                    } else if (respST.equals("N")) {
                        CdAt.setAtivo(false);
                    }
                    out.println("4");
                    resposta = dao.alterarPerfil(CdAt);

                    if (resposta) {
                        resultado = "OK";
                    } else {
                        resultado = "ERRO";
                    }
                    out.println("5");
                }
                if (op.equals("Deletar")) {
                    CdAt.setid_Perfil(Integer.parseInt(request.getParameter("Bid")));

                    resposta = dao.removerPerfil(CdAt);

                    if (resposta) {
                        resultado = "OK";
                    } else {
                        resultado = "ERRO";
                    }
                }
            }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PerfilServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Você Esta... " + resultado + "</h1>");
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PerfilServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PerfilServlet.class.getName()).log(Level.SEVERE, null, ex);
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
