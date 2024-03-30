public class Veiculo {
    private double valor;
    private String combustivel;

    public Veiculo() {
    }

    public Veiculo(double valor, String combustivel) {
        this.valor = valor;
        this.combustivel = combustivel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}