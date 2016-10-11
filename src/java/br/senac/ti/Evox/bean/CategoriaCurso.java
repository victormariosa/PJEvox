
package br.senac.ti.Evox.bean;

/**
 *
 * @author VictorMariosa
 */
public class CategoriaCurso {
    private int id_categoria_curso;
    private String nome;
    private String descricao;
    private boolean ativo;

    public int getId_categoria_curso() {
        return id_categoria_curso;
    }

    public void setId_categoria_curso(int id_categoria) {
        this.id_categoria_curso = id_categoria_curso;
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
