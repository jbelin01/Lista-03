public class Pessoa {
    
    private int idade;
    private String nome;
    private String sexo;

    public Pessoa(){

    }

    public Pessoa(int idade){

        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;

    }

    public int getIdade(){

        return this.idade;

    }

    public void setIdade ( int idade ){

        this.idade = idade;

    }

    public String getNome(){

        return this.nome;

    }

    public void setNome( String nome ){

        this.nome = nome;

    }

    public String getSexo(){

        return this.sexo;

    }

    public void setSexo( String sexo ){

        this.sexo = sexo;

    }

}
