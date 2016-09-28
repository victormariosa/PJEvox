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
            
            String query = "INSERT INTO Pefil (id_pefil, nome, descricao, ativo) VALUES (?,?,?,?))";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString (1, perfil.getNome());
            pstm.setString (2, perfil.getDescricao());
            pstm.setBoolean (3, perfil.isAtivo());
            
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
            String query = "UPDATE perfil SET nome = ?, descricao = ?, ativo = ? WHERE id_Perfil= ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString (1, perfil.getNome());
            pstm.setString (2, perfil.getDescricao());
            pstm.setBoolean (3, perfil.isAtivo());
            
            
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
     
     public boolean removerPerfil(int id_operacao){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            String query = "DELETE FROM perfil WHERE id_Perfil = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id_operacao);
            
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
     
      public List<Perfil> recuperarPerfil(){
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            String query = "SELECT * FROM perfil";
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(query);
            
            ArrayList<Perfil> listaperfil = new ArrayList();
            
            while(rs.next())
            {
                Perfil perfil = new Perfil();
                perfil.setid_Pefil(rs.getInt("id_Perfil"));
                perfil.setNome(rs.getString("nome"));
                perfil.setDescricao(rs.getString("descricao"));
               
                listaperfil.add(perfil);
            }
            
            return listaperfil;
        
    }
    catch (SQLException ex) {
            
    }  
        return null;   
    }    
    
}
