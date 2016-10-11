/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;


import br.senac.ti.Evox.bean.CategoriaCurso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Victor
 */
public class categoriaCursoDAO {
  /* public Object txtNome;
   *public Object txtsenha;
  */
    
    boolean cadastrarCategoria(CategoriaCurso categoriaCurso)throws ClassNotFoundException{
       try{
           Class.forName("com.mysql.jdbc.Driver");
           
           Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
           
           String query = "INSERT INTO categoriacurso (nome, descricao, ativo) VALUES (?,?,?)";
           PreparedStatement pstm = conect.prepareStatement(query);
           pstm.setString(1, categoriaCurso.getNome());
           pstm.setString(2, categoriaCurso.getDescricao());
           pstm.setBoolean(3, categoriaCurso.isAtivo());
           
           int result = pstm.executeUpdate();
           
           if(result > 0){
               return true;
           }
           else
           {
               return false;
           }
       }catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return false; 
        
       
       
    }
    
     public boolean alterarCategoria(CategoriaCurso categoriaCurso){
         
         try{
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");

            String query = "UPDATE categoriacurso SET nome=?, descricao=?, ativo=?";

            PreparedStatement pstm = conect.prepareStatement(query);
            pstm.setString(1, categoriaCurso.getNome());
            pstm.setString(2, categoriaCurso.getDescricao());
            pstm.setBoolean(3, categoriaCurso.isAtivo());


            int result = pstm.executeUpdate();

            if(result>0){

                return true;
            }
            else{
                return false;
            }
            
         } catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return false;
    }
     
     public boolean removerCategoria(int id_categoria_curso){
          try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
            String query = "DELETE FROM categoriacurso WHERE id_categoria_curso = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id_categoria_curso);
            
            int result = pstm.executeUpdate();
            
            if(result > 0){
                return true;
            }
            else{
                return false;
            }
        }
        catch(SQLException ex){
             ex.printStackTrace(); 
        }
        return false;
     }
}
