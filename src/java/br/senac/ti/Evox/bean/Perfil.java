package br.senac.ti.Evox.bean;

public class Perfil {
    
        
        private int id_Pefil;
        private String nome;
        private String descricao; 
        private boolean ativo;

        public int getid_Pefil() {
            return id_Pefil;
        }

        public void setid_Pefil(int id_Pefil) {
            this.id_Pefil = id_Pefil;
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
