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

    public boolean cadastrarPerfil(Perfil perfil) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb", "root", "");

            String query = "INSERT INTO perfil (nome, descricao, ativo) VALUES (?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, perfil.getNome());
            pstm.setString(2, perfil.getDescricao());
            pstm.setBoolean(3, perfil.isAtivo());

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

    public boolean alterarPerfil(Perfil perfil) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb", "root", "");
            
            String query = "UPDATE perfil SET nome = ?, descricao = ?, ativo = ? WHERE id_perfil = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, perfil.getNome());
            pstm.setString(2, perfil.getDescricao());
            pstm.setBoolean(3, perfil.isAtivo());
            pstm.setInt(4, perfil.getid_Perfil());

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

    public boolean removerPerfil(Perfil perfil) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/evoxdb", "root", "");
            String query = "DELETE FROM perfil WHERE id_Perfil = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setInt(1, perfil.getid_Perfil());

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

    public Perfil recuperarEmpregado(String nome) {

        try {
            //GERENCIAR  CONEXAO
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/evoxdb",
                    "root", "root");

            String query = "SELECT * FROM empregado WHERE nome = ?";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, nome);

            ResultSet rs = pstm.executeQuery();

            /*while (rs.next()) {
                Perfil perfil = new Perfil();
                perfil.setId(rs.getInt("id_empregado"));
                perfil.setNome(rs.getString("nome"));
                perfil.setCargo(rs.getString("cargo"));
                perfil.setValorHora(rs.getFloat("valor_hora"));
                perfil.setHorasTrabalhadas(rs.getFloat("horas_trabalhadas"));
                perfil.setSalario(rs.getFloat("salario"));

                return perfil;
            }*/
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return null;

    }
}
