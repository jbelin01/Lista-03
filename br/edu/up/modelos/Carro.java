package br.edu.up.modelos;
public class Carro {
    
    private Double fabrica;
    private Double distribuidor;
    private Double imposto;

    public Carro(){

    }

    public Carro( Double fabrica, Double percentual, Double imposto){

        this.fabrica = fabrica;
        

    }

    public Double getFabrica(){

        return this.fabrica;

    }

    public void setFabrica(Double fabrica){

        this.fabrica = fabrica;

    }

    

    public Double custoConsumidor(Double fabrica){

        return (fabrica * 1.45) * 1.28;

    }
}
