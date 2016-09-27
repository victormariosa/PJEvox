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
public class Operacao {
     
    
    private int id_operacao;
    private String nome;
    private String descricao;
    private boolean ativo;

    public int getId() {
        return id_operacao;
    }

    public void setId(int id) {
        this.id_operacao = id;
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


    
}
