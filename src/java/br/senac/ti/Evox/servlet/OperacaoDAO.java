/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.servlet;

import br.senac.ti.Evox.bean.Operacao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class OperacaoDAO {
    
    public boolean cadastrarOperacao(Operacao operacao) throws ClassNotFoundException {
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","");
            String query = "INSERT INTO Operacao (nome, descricao) VALUES (?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, operacao.getNome());
            pstm.setString(2, operacao.getDescricao());
           
            
            
            int r = pstm.executeUpdate();
            if(r > 0)
            {
                return true;
            }else{
                return false;
            }
       
        
            }  catch (SQLException ex){
            ex.printStackTrace();
            }
             return false;
            }
    
    
    
     public boolean alterar(Operacao operacao){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","","");
            String query = "UPDATE Operacao SET nome = ?, Descricao = ? WHERE id_Operacao = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, operacao.getNome());
            pstm.setString(2, operacao.getDescricao());
            
            
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
     
     public boolean remover(int id_operacao){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","","");
            String query = "DELETE FROM Operacao WHERE id_operacao = ?";
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
     
     public List<Operacao> recuperarOperacao(){
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","","");
            String query = "SELECT * FROM Operacao";
            Statement stm = conn.createStatement();
            
            ResultSet rs = stm.executeQuery(query);
            
            ArrayList<Operacao> listaOperacao = new ArrayList();
            
            while(rs.next())
            {
                Operacao operacao = new Operacao();
                operacao.setId(rs.getInt("id_Operacao"));
                operacao.setNome(rs.getString("nome"));
                operacao.setdescricao(rs.getString("descricao"));
               
                listaOperacao.add(operacao);
            }
            
            return listaOperacao;
        
    }
     catch (SQLException ex) {
            
        }  
        return null;   
    }    
}

