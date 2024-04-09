package br.edu.up.modelos;
public class Vendedor{

    private String nome;
    private Double salario;
    private int venda;


    public Vendedor(){

    }

    public Vendedor ( String nome, Double salario, int venda){

        this.nome = nome;
        this.salario = salario;
        this.venda = venda;

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){

        this.nome = nome;

    }

    public Double getSalario(){

        return this.salario;

    }

    public void setSalario( Double salario){

        this.salario = salario;

    }

    public int getVenda(){
        
        return this.venda;

    }

    public void setVenda(int venda){

        this.venda = venda;

    }

    public  Double salarioFinal( Double salario, int venda){

        return salario * (venda * 0.15);

    }



}