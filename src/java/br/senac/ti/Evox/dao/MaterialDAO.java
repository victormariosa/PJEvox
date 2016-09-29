package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Material;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MaterialDAO {
    public boolean adicionarMaterial(Material material) throws ClassNotFoundException {
        try{
            //GERENCIAR CONEXÃO
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
        String query = "INSERT INTO material (nome, descricao, ativo) VALUES (?,?,?)"; //INSERIR NO BANCO
        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, material.getNome());
        pstm.setString(2, material.getDescricao());
        pstm.setInt(3, material.getAtivo());
            
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
    
    public boolean atualizarMaterial(Material material){
        try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
         String query = "UPDATE INTO material (nome, descricao, ativo) VALUES (?,?,?)";
         PreparedStatement pstm = conn.prepareStatement(query);
         pstm.setString(1, material.getNome());
         pstm.setString(2, material.getDescricao());
         pstm.setInt(3, material.getAtivo());
         
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
    
    public boolean deletarMaterial(int id) throws SQLException{
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
        String query = "DELETE FROM material WHERE id = ?";
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
