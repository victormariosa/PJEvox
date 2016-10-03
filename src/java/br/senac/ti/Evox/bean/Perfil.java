package br.senac.ti.Evox.bean;

public class Perfil {
    
        
        private int id_Perfil;
        private String nome;
        private String descricao; 
        private boolean ativo;

        public int getid_Perfil() {
            return id_Perfil;
        }

        public void setid_Perfil(int id_Perfil) {
            this.id_Perfil = id_Perfil;
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
