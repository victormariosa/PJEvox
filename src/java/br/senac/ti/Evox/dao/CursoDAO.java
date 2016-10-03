/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Senacrio
 */
public class CursoDAO {

    /**
     *
     * @param curso
     * @return
     */
    public boolean cadastrarCurso(Curso curso) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
            String query = "Insert into curso(nome, descricao, id_categoria_curso) values(?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, curso.getNome());
            pstm.setString(2, curso.getDescricao());
            pstm.setInt(3, curso.getId());
            
            int r = pstm.executeUpdate();
            if (r>0){
                return true;
            } else{
                return false;
            }
            
        }catch (SQLException ex){
            ex.printStackTrace();
         }
        return false;
    }
     public boolean atualizarCurso(Curso curso) throws ClassNotFoundException, ClassNotFoundException{
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/evoxdb", "root","");
             String query ="update curso set nome?, descricao=?, id_curso=? where id_categoria_curso=?";
             PreparedStatement pstm = conn.prepareStatement(query);
             pstm.setString(1, curso.getNome());
             pstm.setString(2, curso.getDescricao());
             pstm.setInt(3, curso.getId());
             
             int r = pstm.executeUpdate();
             if (r>0){
                 return true;
             }else{
                 return false;
             }
          }catch (SQLException ex){
              ex.printStackTrace();
          }
         return false;
     }
     public boolean deletarCurso(Curso curso) throws ClassNotFoundException, ClassNotFoundException, SQLException{
         try{
             Class.forName("com.mysql.jdc.Driver");
             Connection conn= DriverManager.getConnection("jdbc:mysql://localhost/evoxdb", "root","");
             String query = "delete from id_curso where id_categoria_curso= ?";
             PreparedStatement pstm = conn.prepareStatement(query);
             pstm.setInt(1, curso.getId);
             
             int r = pstm.executeUpdate();

            if (r > 0) {
                return true;

            } else {

                return false;
            }
         }catch (SQLException ex) {
            ex.printStackTrace();
        }
       return false;
     }
}

    