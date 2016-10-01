/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.CategoriaPalestra;
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
public class CategoriaPalestraDAO {
    
     public boolean adicionarCategoriaPalestra(CategoriaPalestra categoriapalestra) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb", "root", "");
            String query = "INSERT INTO categoria_palestra  (nome,descricao,ativo) VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, categoriapalestra.getNome());
            pstm.setString(2, categoriapalestra.getDescricao());
            pstm.setBoolean(3, categoriapalestra.isAtivo());
            
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
    public boolean deletarCategoriaPalestra(int id) throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb", "root", "");
            String query = "delete from categoria_palestra where id_categoria_palestra=?";
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
    public boolean atualizarCategoriaPalestra(CategoriaPalestra categoriapalestra) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb", "root", "");

            String query = "update categoria_palestra set nome=?, descricao=? where id_categoria_palestra=?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, categoriapalestra.getNome());
            pstm.setString(2, categoriapalestra.getDescricao());
            pstm.setInt(3, categoriapalestra.getId_categoria_palestra());
            
           int r = pstm.executeUpdate();

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
    public List<CategoriaPalestra> getCategoriaPalestra() throws ClassNotFoundException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb", "root", "");
            String query = "select * from categoria_palestra ";

            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            ArrayList<CategoriaPalestra> listaCategoriaPalestra = new ArrayList();

            while (rs.next()) {
                CategoriaPalestra categoriaPalestra = new CategoriaPalestra();
                categoriaPalestra.setId_categoria_palestra(rs.getInt("id_categoria_palestra"));
                categoriaPalestra.setNome(rs.getString("nome"));
                categoriaPalestra.setDescricao(rs.getString("descricao"));
                

                listaCategoriaPalestra.add(categoriaPalestra);
            }
            return listaCategoriaPalestra;
        
        }
        
        catch(SQLException ex) {
            ex.printStackTrace();
        }

        return null;

    }
   /* public static void main(String[]args) throws ClassNotFoundException, SQLException{
        CategoriaPalestra p = new CategoriaPalestra();
        p.setNome("nome2");
        p.setDescricao("descrição1");
        p.setAtivo(true);
        p.setId_categoria_palestra(1);
        
        
        CategoriaPalestraDAO dao = new CategoriaPalestraDAO();
        //dao.adicionarCategoriaPalestra(p);
        //dao.deletarCategoriaPalestra(1);
        //dao.atualizarCategoriaPalestra(p);
        
        
        
        ArrayList<CategoriaPalestra> lista = (ArrayList<CategoriaPalestra>) dao.getCategoriaPalestra();
        
        for(CategoriaPalestra pa: lista){
            System.out.println("nome " + pa.getNome() );
        
        }
}*/
}
