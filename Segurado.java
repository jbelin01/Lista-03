public class Segurado {
    private String nome;
    private int idade;
    private int grupoRisco;

    public Segurado(String nome, int idade, int grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getGrupoRisco() {
        return grupoRisco;
    }

    public void setGrupoRisco(int grupoRisco) {
        this.grupoRisco = grupoRisco;
    }
}