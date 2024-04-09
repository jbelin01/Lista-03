package br.edu.up.modelos;
public class Pessoa {
    
    private int idade;
    private String nome;
    private String sexo;
    private String saude;

    public Pessoa(){

    }
    public Pessoa(int idade){
        this.idade = idade;
    }

    public Pessoa( String nome, String sexo, String saude){

        
        this.nome = nome;
        this.sexo = sexo;
        this.saude = saude;

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
    public String getSaude(){

        return this.saude;

    }

    public void setSaude( String saude ){

        this.saude = saude;

    }

}
