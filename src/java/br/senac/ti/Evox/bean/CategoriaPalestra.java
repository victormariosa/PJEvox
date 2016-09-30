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
public class CategoriaPalestra {
    private int id_categoria_palestra ;
    private String nome;
    private String descricao;
    private boolean ativo;

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

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
}
