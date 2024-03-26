
public class Usuario {
    
    
    private Double cotacao;
    private Double carteira;

    public Usuario(){

    }

        public Usuario( Double real, Double dollar,Double carteira){

    
            this.cotacao = cotacao;
            this.carteira = carteira;

        }

        
        public Double getCotacao(){

            return this.cotacao;

        }

        public void setCotacao( Double cotacao){

            this.cotacao = cotacao;

        }

        public Double getCarteira(){

            return this.carteira;

        }

        public void setCarteira( Double carteira){

            this.carteira = carteira;

        }
    
        public Double conversao( Double carteira, Double cotacao){

            return cotacao * carteira; 
        }

}
