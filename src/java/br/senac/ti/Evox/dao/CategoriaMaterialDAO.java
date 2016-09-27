
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.CategoriaMaterial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CategoriaMaterialDAO {
    public boolean adicionarCategoriaMaterial(CategoriaMaterial categoriaMaterial) {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rh", "root", "root");

            String query = "INSERT INTO categoriaMaterial (id_categoria, nome, descricao, ativo) VALUES (?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, categoriaMaterial.getNome());
            pstm.setInt(2, categoriaMaterial.getId_categoria());
            pstm.setInt(3, categoriaMaterial.getDescricao());
            pstm.setBoolean(4, categoriaMaterial.isAtivo());

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

    public boolean atualizar(CategoriaMaterial categoriaMaterial) {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
                    "root", "root");

            String query = "UPDATE categoriaMaterial SET nome =?, id_categoria =?,descricao =?, ativo =? WHERE id_categoria = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, categoriaMaterial.getNome());
            pstm.setInt(2, categoriaMaterial.getId_categoria());
            pstm.setInt(3, categoriaMaterial.getDescricao());
            pstm.setBoolean(4, categoriaMaterial.isAtivo());

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
    public boolean deletar(int id_categoria) {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda",
                    "root", "root");

            String query = "DELETE FROM categoriaMaterial WHERE id_categoria = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, id_categoria);

            int r = pstm.executeUpdate();

            if (r > 0) {
                return true;

            } else {

                return false;

            }

        } catch (SQLException ex) {
        }
        return false;

    }
    
}
