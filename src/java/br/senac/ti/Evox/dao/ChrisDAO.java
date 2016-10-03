/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.dao;

import br.senac.ti.Evox.bean.Perfil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Senacrio
 */
public class ChrisDAO {
    public List<Perfil> getPerfil(){
        
        Perfil p1 = new Perfil();
        p1.setid_Perfil(1);
        p1.setNome("Administrador");
        p1.setDescricao("adminsitrdor do sistema");
        p1.setAtivo(true);
        
        Perfil p2 = new Perfil();
        p2.setid_Perfil(2);
        p2.setNome("Cliente");
        p2.setDescricao("Cliente do sistema");
        p2.setAtivo(true);
        
        Perfil p3 = new Perfil();
        p3.setid_Perfil(2);
        p3.setNome("XYZ");
        p3.setDescricao("Cliente do sistema");
        p3.setAtivo(true);
        
        ArrayList<Perfil> lista = new ArrayList<Perfil>();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        return lista;
    }

}
