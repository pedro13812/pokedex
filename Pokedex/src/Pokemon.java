public class Pokemon {
    private String nome;
    private String descricao;
    private String caminhoImagem; // agora é um caminho no classpath
    private String tipo;

    public Pokemon(String nome, String descricao, String caminhoImagem, String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.caminhoImagem = caminhoImagem;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }
        public String getTipo() {
          return tipo;
    }
}