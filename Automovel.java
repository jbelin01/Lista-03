public class Automovel {
    
    private Double distancia;
    private Double combustivel;

    public Automovel(){

    }

    public Automovel( Double distancia, Double combustivel){

        this.distancia = distancia;
        this.combustivel = combustivel;
    }
    public Double getdistancia(){

        return this.distancia;

    }

    public void setDistancia( Double distancia){

        this.distancia = distancia;
        
    }

    public Double getCombustivel(){

        return this.combustivel;

    }

    public void setCombustivel (Double combustivel){

        this.combustivel = combustivel;
    }

    public static Double consumoMedio(Double distancia, Double combustivel){

        return distancia / combustivel; 
    }
}
