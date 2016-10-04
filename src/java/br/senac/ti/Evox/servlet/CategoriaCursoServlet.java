/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.servlet;

import br.senac.ti.Evox.bean.CategoriaCurso;
import br.senac.ti.Evox.bean.Perfil;
import br.senac.ti.Evox.dao.PerfilDAO;
import br.senac.ti.Evox.dao.AtegoriaCursoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Senacrio
 */
@WebServlet(name = "CategoriaCursoServlet", urlPatterns = {"/CategoriaCursoServlet"})
public class CategoriaCursoServlet extends HttpServlet {

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
             boolean resposta = false;
            String op=null, resp=null, resultado=null;
            
            CategoriaCurso cad = new CategoriaCurso();
            AtegoriaCursoDAO dao = new AtegoriaCursoDAO();
            
            op = request.getParameter("botao");
            
            if(op .equals("Cadastrar")){
                cad.setNome(request.getParameter("txtNome"));
                cad.setDescricao(request.getParameter("txtDescricao"));
                resp = request.getParameter("status");

                if(resp .equals("S")){
                    cad.setAtivo(true);
                }else if(resp .equals("N")){
                    cad.setAtivo(false);
                }

                resposta = dao.AdastrarCategoria(cad); 

                if(resposta){
                    resultado = "OK";
                }else{
                    resultado = "ERRO";
                }
            }
            if(op .equals("Alterar")){
                cad.setId_categoria_curso(Integer.parseInt(request.getParameter("Bid")));
                cad.setNome(request.getParameter("txtNome"));
                cad.setDescricao(request.getParameter("txtDescricao"));
                resp = request.getParameter("status");
                if(resp .equals("S")){
                    cad.setAtivo(true);
                }else if(resp .equals("N")){
                    cad.setAtivo(false);
                }
                
                resposta = dao.alterarCategoria(cad);
                
                if(resposta){
                    resultado = "OK";
                }else{
                    resultado = "ERRO";
                }
            }
            if(op .equals("Deletar")){
                cad.setId_categoria_curso(Integer.parseInt(request.getParameter("Bid")));
                cad.setNome(request.getParameter("txtNome"));
                cad.setDescricao(request.getParameter("txtDescricao"));
                resp = request.getParameter("status");
                if(resp .equals("S")){
                    cad.setAtivo(true);
                }else if(resp .equals("N")){
                    cad.setAtivo(false);
                }
                
                resposta = dao.removerCategoria(cad.getId_categoria_curso());
                
                if(resposta){
                    resultado = "OK";
                }else{
                    resultado = "ERRO";
                }
            }
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
            Logger.getLogger(CategoriaCursoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CategoriaCursoServlet.class.getName()).log(Level.SEVERE, null, ex);
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
