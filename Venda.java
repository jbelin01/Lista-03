public class Venda {
    
    private Double custo;
    private Double acrescimo;

    public Venda(){

    }

    public Venda(Double custo, Double acrescimo){

        this.custo = custo;
        this.acrescimo = acrescimo;

    }

    public Double getCusto(){

        return this.custo;

    }

    public void setCusto(Double custo){

        this.custo = custo;

    }

    public Double getAcrescimo(){

        return this.acrescimo;

    }

    public void setAcrescimo(Double acrescimo){

        this.acrescimo = acrescimo;

    }

    public Double valorVenda(Double custo, Double acrescimo){

        return custo * (1 + acrescimo/100);

    }
}
