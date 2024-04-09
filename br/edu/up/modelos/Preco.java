package br.edu.up.modelos;
public class Preco {
    
    private Double custo;
    private Double venda;

    public Preco(){

    }
    

    public Preco( Double custo, Double venda){

        this.custo = custo;
        this.venda = venda;

    }

    public Double getCusto(){

        return this.custo;

    }

    public void setCusto ( Double custo ){

        this.custo = custo;

    }

    public Double getVenda(){

        return this.venda;

    }

    public void setVenda ( Double venda ){

        this.venda = venda;

    }

    

}
