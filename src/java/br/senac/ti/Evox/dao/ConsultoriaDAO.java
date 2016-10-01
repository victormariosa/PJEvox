/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Consultoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConsultoriaDAO {
    public boolean adicionarConsultoria(Consultoria consultoria) throws ClassNotFoundException {
        try{
            //GERENCIAR CONEXÃO
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
        String query = "INSERT INTO consultoria (nome, descricao, ativo) VALUES (?,?,?)"; //INSERIR NO BANCO
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, consultoria.getNome());
        pstm.setString(2, consultoria.getDescricao());
        pstm.setBoolean(3, consultoria.isAtivo());
            
            int r = pstm.executeUpdate();
            if(r > 0)
            {
                return true;
            }else{
                return false;
            }
            
            } catch(SQLException ex) {
            ex.printStackTrace();
            
        }
        return false;
    }
    
    public boolean atualizarConsultoria(Consultoria consultoria){
        try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
         String query = "UPDATE INTO consultoria (nome, descricao, ativo) VALUES (?,?,?)";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, consultoria.getNome());
        pstm.setString(2, consultoria.getDescricao());
        pstm.setBoolean(3, consultoria.isAtivo());
         
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
    
    public boolean deletarConsultoria(int id) throws SQLException{
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
        String query = "DELETE FROM consultoria WHERE id = ?";
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);
        
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
