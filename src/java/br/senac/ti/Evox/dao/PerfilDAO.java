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
    
    public boolean cadastrarEmpregado(Perfil perfil) throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Drvier");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rh","root","");
            
            String query = "INSERT INTO Pefil (id_pefil, nome, descricao, ativo) VALUES (?,?,?,?))";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString (1, perfil.getNome());
            pstm.setString (2, perfil.getDescricao());
            pstm.setBoolean (3, perfil.isAtivo());
            
        } catch (SQLException ex) {
            ex.printStackTrace();   
        }
        return false;
    }
        
}