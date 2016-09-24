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
public class Curso {
    
    private int id;
    private String nome;
    private String destricao;
    private boolean ativo;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDestricao(String destricao) {
        this.destricao = destricao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
