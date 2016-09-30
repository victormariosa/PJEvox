/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;


import br.senac.ti.Evox.bean.Perfil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Senacrio
 */
public class PerfilDAO {
    
    public boolean cadastrarPerfil(Perfil perfil) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Drvier");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/rh","root","");
            
            String query = "INSERT INTO pefil (id_pefil, nome, descricao, ativo) VALUES (?,?,?,?))";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString (1, perfil.getNome());
            pstm.setString (2, perfil.getDescricao());
            pstm.setString (3, perfil.getAtivo());
            
             int  r = pstm.executeUpdate();
             

           if(r>0)
           {
            return true;
                    
           }else{
            
             return false;
           
           }
           
        } catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return false;
    }
    
     public boolean alterarPerfil(Perfil perfil) throws ClassNotFoundException{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            String query = "UPDATE perfil SET nome = ?, descricao = ?, ativo = ? WHERE id_perfil= ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString (1, perfil.getNome());
            pstm.setString (2, perfil.getDescricao());
            pstm.setString (3, perfil.getAtivo());
            
            
            ResultSet r = pstm.executeQuery();
            
            if(r.next())
            {
                return true;
                
            }else{
                return false;
            }
            } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return false;
        
    }
     
     public boolean removerPerfil(int id_Perfil) throws ClassNotFoundException{
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            String query = "DELETE FROM perfil WHERE id_perfil = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id_Perfil);
            
            int r = pstm.executeUpdate();
            
            if(r>0)
            {
                return true;
                
            }else{
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return false;
    }   
    
}
