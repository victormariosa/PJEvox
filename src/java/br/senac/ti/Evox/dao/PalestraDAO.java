/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Palestra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Senacrio
 */
public class PalestraDAO {
    public boolean adicionarPalestra(Palestra palestra) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "", "");
            String query = "INSERT INTO palestra  (nome,descricao) VALUES (?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, palestra.getNome());
            pstm.setString(2, palestra.getDescricao());
            
            int r = pstm.executeUpdate();
             if (r>0) {
                return true;

            } else {

                return false;

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    
        return false;
    }
    
    
    
    public boolean deletarPalestra(int id) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "", "");
            String query = "delete from palestra where id=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);
            
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
    
    public boolean atualizarPalestra(Palestra palestra) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "", "");

            String query = "update palestra set nome=?, descricao=?, where id=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, palestra.getNome());
            pstm.setString(2, palestra.getDescricao());
            
            ResultSet r = pstm.executeQuery();

            if (r.next()) {
                return true;

            } else {

                return false;

            }
            
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
        return false;
    }
    
    public List<Palestra> getPalestra() throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "", "");
            String query = "select * from palestra ";

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            ArrayList<Palestra> listaPalestra = new ArrayList();

            while (rs.next()) {
                Palestra palestra = new Palestra();
                palestra.setId(rs.getInt("id"));
                palestra.setNome(rs.getString("nome"));
                palestra.setDescricao(rs.getString("descricao"));
                

                listaPalestra.add(palestra);
            }
            return listaPalestra;
        
        }
        
        catch(SQLException ex) {
            ex.printStackTrace();
        }

        return null;

    }
    
    
}
