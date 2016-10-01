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
public class Palestra {
    private int id_palestra ;
    private String nome;
    private String descricao;
    private boolean ativo;
    private int id_categoria_palestra; 

    
    public int getId_palestra() {
        return id_palestra;
    }
    public void setId_palestra(int id_palestra) {
        this.id_palestra = id_palestra;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the id_categoria_palestra
     */
    public int getId_categoria_palestra() {
        return id_categoria_palestra;
    }

    /**
     * @param id_categoria_palestra the id_categoria_palestra to set
     */
    public void setId_categoria_palestra(int id_categoria_palestra) {
        this.id_categoria_palestra = id_categoria_palestra;
    }

    public void getId_categoria_palestra(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
    
}
