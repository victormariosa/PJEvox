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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb","root", "");
            String query = "INSERT INTO palestra (nome,descricao,ativo,id_categoria_palestra) VALUES (?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, palestra.getNome());
            pstm.setString(2, palestra.getDescricao());
            pstm.setBoolean(3, palestra.isAtivo());
            pstm.setInt(4, palestra.getId_categoria_palestra());
            
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb","root", "");
            String query = "delete from palestra where id_palestra=?";
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb","root", "");

            String query = "update palestra set nome=?, descricao=? where id_palestra=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, palestra.getNome());
            pstm.setString(2, palestra.getDescricao());
            pstm.setInt(3, palestra.getId_palestra());
            
            int  r = pstm.executeUpdate();

            if (r>0) {
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
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb","root", "");
            String query = "select * from palestra ";

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            ArrayList<Palestra> listaPalestra = new ArrayList();

            while (rs.next()) {
                Palestra palestra = new Palestra();
                palestra.setId_palestra(rs.getInt("id_palestra"));
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
    
    /*public static void main(String[]args) throws ClassNotFoundException, SQLException{
        Palestra p = new Palestra();
        p.setNome("nome1");
        p.setDescricao("descrição1");
        p.setAtivo(true);
        p.setId_palestra(7);
        
        
        PalestraDAO dao = new PalestraDAO();
        ArrayList<Palestra> lista = (ArrayList<Palestra>) dao.getPalestra();
        
        for(Palestra pa: lista){
            System.out.println("nome " + pa.getNome() );
        
        }
        
        
        
        
      
        
    
    }*/

 
}