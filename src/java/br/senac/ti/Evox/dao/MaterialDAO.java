package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Material;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MaterialDAO {
    public boolean adicionarMaterial(Material mt) throws ClassNotFoundException {
        try{
            //GERENCIAR CONEXÃO
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb","root","");
            String query = "INSERT INTO material (nome, descricao, ativo) VALUES (?,?,?)"; //INSERIR NO BANCO
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, mt.getNome());
            pstm.setString(2, mt.getDescricao());
            pstm.setInt(3, mt.getAtivo());
            
            int r = pstm.executeUpdate();
            if(r > 0)
            {
                return true;
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            
            }
        
            return false;
    }
    
}
