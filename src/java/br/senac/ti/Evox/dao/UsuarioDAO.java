/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Usuario;
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
public class UsuarioDAO {
   
    public boolean adicionarUsuario(Usuario usuario) throws SQLException{
        
         try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb", "root", "");

            String query = "INSERT INTO Usuario (nome, senha, users) VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getUsers());
        
            
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
    
     public boolean atualizarUsuario(Usuario usuario) {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb",
                    "root", "");

            String query = "UPDATE Usuario SET nome =?, senha =?, users=? WHERE id = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getSenha());
            pstm.setString(3, usuario.getUsers());

            ResultSet r = pstm.executeQuery();
    
     if (r.next()) {
                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return false;
          
     }
     
      public boolean deletarUsuario(int id) throws SQLException {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb",
                    "root", "");

            String query = "DELETE FROM Usuario WHERE id = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id);

            int r = pstm.executeUpdate();
            
             if (r > 0) {
                return true;

            } else {

                return false;

            }
             
             } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return false;

    }
      
      public List<Usuario> getUsuario() throws ClassNotFoundException {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb",
                    "root", "");

            String query = "SELECT * FROM Usuario";
            Statement stm = conn.createStatement();

            ResultSet rs = stm.executeQuery(query);

            ArrayList<Usuario> listaUsuario = new ArrayList();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setSenha(rs.getString("usuario"));
                
                listaUsuario.add(usuario);

            }return listaUsuario;

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return null;
    }
}
