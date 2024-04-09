package br.edu.up.modelos;
public class Prestacao {
    
    private Double compra;
    

    public Prestacao(){

    }

    public Prestacao( Double compra){

        this.compra = compra;

    }

    public Double getCompra(){

        return this.compra;

    }

    public void setCompra(Double compra){

        this.compra = compra;

    }

    public Double valorParcela (Double compra){

        return compra / 5; 
        
    }
}
