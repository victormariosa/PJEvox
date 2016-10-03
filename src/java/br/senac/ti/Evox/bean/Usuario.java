/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.ti.Evox.bean;

/**
 *
 * @author Senacrio
 */
public class Usuario {
    
    private int id;
    private String nome;
    private String senha;
    private boolean ativo;
     private int id_perfil;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    public boolean getAtivo(){
        return ativo;
    }

    /**
     * @return the users
     */
    public int getId_perfil() {
        return id_perfil;
    }

    /**
     * @param id_perfil
     */
    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }
    
}
